package year_2015.days;

public class Day5 extends AbstractDay{

	@Override
	public void execute(boolean isDebug, boolean isHome) {
		readInput(isDebug, isHome);
		String[] input2 = input.split("\\r?\\n");
		for (int i = 0; i<input2.length; i++) {
			for (int j = 0; j<input2[i].length()-1; j++)
				if (! input2[i].contains("ab")  && input2[i].charAt(j) == input2[i].charAt(j+1));
		}
	}

}
