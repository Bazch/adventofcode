package year_2015;

import year_2015.days.Day;
import year_2015.days.Day1;
import year_2015.days.Day2;

public class Execute {

	private static final int CURRENT_DAY = 1;
	private static Day day = new Day2();

	public static void main(String[] args) {

		day.execute();
	}
}
