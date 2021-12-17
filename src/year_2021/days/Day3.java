package year_2021.days;


import java.util.*;
import java.util.Map.Entry;

public class Day3 extends AbstractDay{

    private List<String> splitInput (String in) {
        List<String> splitInput = Arrays.asList(in.split("\n"));
        return splitInput;
    }

    private static <T> T mostCommon(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        for(T t : list) {
            Integer val = map.get(t);
            map.put(t, val == null ? 1 : val+1);
        }
        Entry<T, Integer> max = null;
        for (Entry<T, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }
        return max.getKey();
    }

    private static Integer mostCommonBits(List<String> bits, int index){
        List<Integer> bitsByIndex = new ArrayList<Integer>();
        for (int i = 0; i < bits.size(); i++) {
            bitsByIndex.add(Character.getNumericValue(bits.get(i).charAt(index)));
        }
        return mostCommon(bitsByIndex);
    }

    private static int calculatePowerConsumption(List<String> bits){
        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();
        for(int i = 0; i < bits.get(0).length(); i++){
            int mostCommon = mostCommonBits(bits, i);
            gamma.append(mostCommon);
            epsilon.append(mostCommon == 0 ? 1 : 0);
        }
       return Integer.parseInt(gamma.toString(),2) * Integer.parseInt(epsilon.toString(),2);
    }

    private void findNumbersByBitPosition(List<String> bits) {
        List<String> copyBits = new ArrayList<String>();
        copyBits.addAll(bits);
        for(int i = 0; i < copyBits.get(0).length(); i++){
            int mostCommon = mostCommonBits(copyBits, i);
            Iterator<String> iter = copyBits.iterator();
            while(iter.hasNext()) {
                String currentNumber = iter.next();
                if(Character.getNumericValue(currentNumber.charAt(i) )!= mostCommon) {
                    iter.remove();
                }
            }
            if (copyBits.size() == 1){
                break;
            }
        }
        for (String s:copyBits) {
            System.out.println(s);
        }

    }

    @Override
    public void execute(boolean isDebug, boolean isHome) {
        readInput(isDebug,isHome);
        System.out.println("Part 1: " + calculatePowerConsumption(splitInput(input)));
        findNumbersByBitPosition(splitInput(input));
    }
}
