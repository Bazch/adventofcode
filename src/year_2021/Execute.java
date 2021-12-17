package year_2021;

import templates.Day;
import year_2021.days.Day1;
import year_2021.days.Day2;

public class Execute {

    private static final int CURRENT_DAY = 2;
    private static boolean DEBUG = false;
    private static boolean HOME = true;
    private static Day day;

    public static void main(String[] args) {

        switch (CURRENT_DAY) {
            case 1:
                day = new Day1();
                break;
            case 2:
                day = new Day2();
                break;
        }
        day.execute(DEBUG, HOME);
    }
}
