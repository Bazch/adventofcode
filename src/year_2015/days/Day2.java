package year_2015.days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Day2 extends AbstractDay {

	private String[] splitInput;
	private int l;
	private int w;
	private int h;

	public int calculateWrapping() {
		int total = 0;
		for (int i = 0; i < splitInput.length; i++) {
			String[] array2 = splitInput[i].split("x");
			l = Integer.parseInt(array2[0]);
			w = Integer.parseInt(array2[1]);
			h = Integer.parseInt(array2[2]);
			List<Integer> newArray = new ArrayList<Integer>(Arrays.asList(l*w,w*h,h*l));
			Collections.sort(newArray);
			int smallest = newArray.get(0);
			total += (((2 * l * w) + (2 * w * h) + (2 * h * l)) + smallest);
		}

		return total;
	}

	public int calculateRibbon() {
		
		int total = 0;
		for (int i = 0; i < splitInput.length; i++) {
			String[] array2 = splitInput[i].split("x");
			l = Integer.parseInt(array2[0]);
			w = Integer.parseInt(array2[1]);
			h = Integer.parseInt(array2[2]);
			List<Integer> newArray = new ArrayList<Integer>(Arrays.asList(l,w,h));
			Collections.sort(newArray);
			int smallest1 = newArray.get(0);
			int smallest2 = newArray.get(1);

			
			total += 2*smallest1 + 2*smallest2 + l*w*h;
	
		}

		return total;
	}

	
	@Override
	public void execute(boolean isDebug, boolean isHome) {
		readInput(isDebug, isHome);	
		splitInput = input.split("\\s+");
		System.out.println("Part 1: " + calculateWrapping());
		System.out.println("Part 2: " + calculateRibbon());
	}
}
