package year_2015.days;

public class Day1 implements Day {

	private int up;
	private int down;
	private String input;
	private static final String FILE_PATH = "C:\\Users\\basv_\\git\\adventofcode\\resources\\Day1.txt";
	private static final String FILE_PATH_DEBUG = "C:\\Users\\basv_\\git\\adventofcode\\resources\\Day1_test.txt";
	
	public void readInput(boolean isDebug){
		if (isDebug) {
			input = readFile(FILE_PATH_DEBUG);
		} else
		{
			input = readFile(FILE_PATH);
		}
	}
	
	public int calculateFloor() {
		up = 0;
		down = 0;
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				up++;
			} else if (input.charAt(i) == ')') {
				down++;
			}
		}
		result = up - down;
		return result;
	}

	public int calculatePosition() {
		up = 0;
		down = 0;
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				up++;
			} else if (input.charAt(i) == ')') {
				down++;
			}
			int firstIndexNegative = up - down;
			if (firstIndexNegative == -1) {
				return (i+1);
			}
		}

		return result;
	}

	@Override
	public void execute(boolean isDebug) {
		readInput(isDebug);
		System.out.println("Part 1: " + calculateFloor());
		System.out.println("Part 2: " + calculatePosition());
	}

}
