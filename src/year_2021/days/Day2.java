package year_2021.days;

import templates.Day;

public class Day2 extends AbstractDay {

    private int horizontal = 0;
    private int depth = 0;
    private int aim = 0;

    private void calculatePosition(String direction, int i){
        switch(direction) {
            case "forward":
                horizontal = horizontal+i;
                depth = depth + (aim * i);
                break;
            case "down":
                aim = aim+i;
                break;
            case "up":
                aim = aim-i;
                break;
        }
    }

    private void move(String[] input){
        for(int i =0; i < splitInput.length; i++){
            String[] currentLine = splitInput[i].split(" ");
            calculatePosition(currentLine[0], Integer.parseInt(currentLine[1]));
        }
    }

    private String[] splitInput;
    @Override
    public void execute(boolean isDebug, boolean isHome) {
        readInput(isDebug, isHome);
        splitInput = input.split("\r\n");
        move(splitInput);
        System.out.println("Part 1: " + horizontal * aim);
        System.out.println("Part 2: " + horizontal * depth);
    }
}
