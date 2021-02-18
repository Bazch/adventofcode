package year_2015.days;

public class Day1 implements Day {

	private int up;
	private int down;
	private String input = readFileToString(FILE_PATH);
	private static final String FILE_PATH = "/Users/bvdboomg/personal/adventofcode/resources/Day1.txt";
	
	public String calculateFloor() {
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
		System.out.println(up + " - " + down + " = " + result);
		return "calculateFloor = " + result;
	}

	public String calculatePosition() {
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
				System.out.println(i + 1);
				return "First Index = " + (i + 1);
			}
		}

		return "First Index = not calculated";
	}

	@Override
	public void execute() {
		System.out.println(calculateFloor());
		System.out.println(calculatePosition());
	}

}
