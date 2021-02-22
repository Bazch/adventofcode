package year_2015;

import year_2015.days.Day;
import year_2015.days.Day1;
import year_2015.days.Day2;
import year_2015.days.Day3;
import year_2015.days.Day4;

public class Execute {

	private static final int CURRENT_DAY = 4;
	private static boolean DEBUG = true;
	private static boolean HOME = false;
	private static Day day;
	
	public static void main(String[] args) {

		switch (CURRENT_DAY) {
			case 1:
				day = new Day1();
				break;
			case 2:
				day = new Day2();
				break;
			case 3:
				day = new Day3();
				break;
			case 4:
				day = new Day4();
				break;
		}
		
		day.execute(DEBUG, HOME);
	}
}
