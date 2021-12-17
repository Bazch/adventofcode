package year_2015;

import templates.Day;
import year_2015.days.Day1;
import year_2015.days.Day2;
import year_2015.days.Day3;
import year_2015.days.Day4;
import year_2015.days.Day5;

public class Execute {

	private static final int CURRENT_DAY = 4;
	private static boolean DEBUG = true;
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
			case 3:
				day = new Day3();
				break;
			case 4:
				day = new Day4();
				break;
			case 5:
				day = new Day5();
			
		}
		
		day.execute(DEBUG, HOME);
	}
}
