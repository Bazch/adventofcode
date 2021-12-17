package year_2021.days;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 extends AbstractDay {
    private List<Integer> splitInput;

    private int measurementsLarger() {
        int measurementsLarger = 0;
        for(int i = 1; i < splitInput.size(); i++) {
            if(splitInput.get(i) > splitInput.get(i-1)){
                measurementsLarger++;
            }
        }
        return measurementsLarger;
    }

    private int sumPreviousThreeNumbers(int index){
        int sum = splitInput.get(index) + splitInput.get(index-1) + splitInput.get(index-2);
        return sum;
    }

    private int sumsLarger() {
        int currentSum;
        int previousSum = splitInput.get(0) + splitInput.get(1);
        int sumsLarger = 0;
        for(int i = 2; i < splitInput.size()-1; i++) {
            currentSum = sumPreviousThreeNumbers(i);
            if(currentSum > previousSum) {
                sumsLarger++;
            }
            previousSum = currentSum;
        }
        return sumsLarger;
    }

    private List<Integer> splitToIntegerArray(String input) {
        Scanner scan = new Scanner(input);
        List<Integer> numbers = new ArrayList<>();

        while (scan.hasNext())
            numbers.add(scan.nextInt());

        return numbers;
    }

    @Override
    public void execute(boolean isDebug, boolean isHome) {
        readInput(isDebug, isHome);
        splitInput = splitToIntegerArray(input);
        System.out.println(splitInput.get(0)+", "+splitInput.get(splitInput.size()-1));
        System.out.println("Part 1: " + measurementsLarger());
        System.out.println("Part 2: " + sumsLarger());
    }
}
