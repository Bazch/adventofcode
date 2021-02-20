package year_2015.days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Day2 implements Day {

	private String input = readFileToString(FILE_PATH);
	private static final String FILE_PATH = "/Users/bvdboomg/personal/adventofcode/resources/Day2.txt";


	public String[] splitInput(String in) {
		String[] array = in.split("\n");
		return array;
	}

	public int calculateWrapping() {
		int l = 0;
		int w = 0;
		int h = 0;
		int smallest = 0;
		int total = 0;
		String[] array = input.split("\n");
		for (int i = 0; i < array.length; i++) {
			String[] array2 = array[i].split("x");
			l = Integer.parseInt(array2[0]);
			w = Integer.parseInt(array2[1]);
			h = Integer.parseInt(array2[2]);
			List<Integer> newArray = new ArrayList<Integer>(Arrays.asList(l*w,w*h,h*l));
			Collections.sort(newArray);
			smallest = newArray.get(0);

			System.out.println("Total: " + total + " + (2 * " + l + " * " + w + " ) + (2 * " + w + " * " + h + ") + (2 * " + h + " * " + l + ") + " + smallest);
			total += (((2 * l * w) + (2 * w * h) + (2 * h * l)) + smallest);
			System.out.println(i);
		}

		return total;
	}

	public int calculateRibbon() {
		int l = 0;
		int w = 0;
		int h = 0;
		int smallest = 0;
		int total = 0;
		String[] array = input.split("\n");
		for (int i = 0; i < array.length; i++) {
			String[] array2 = array[i].split("x");
			l = Integer.parseInt(array2[0]);
			w = Integer.parseInt(array2[1]);
			h = Integer.parseInt(array2[2]);
			List<Integer> newArray = new ArrayList<Integer>(Arrays.asList(l*w,w*h,h*l));
			Collections.sort(newArray);
			smallest = newArray.get(0);

			System.out.println("Total: " + total + " + (2 * " + l + " * " + w + " ) + (2 * " + w + " * " + h + ") + (2 * " + h + " * " + l + ") + " + smallest);
			total += (((2 * l * w) + (2 * w * h) + (2 * h * l)) + smallest);
			System.out.println(i);
		}

		return total;
	}

	
	@Override
	public void execute() {

		System.out.println(calculateWrapping());
	}
}
