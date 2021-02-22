package year_2015.days;

public class Day1 extends AbstractDay {

	private int up;
	private int down;

	
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
	public void execute(boolean isDebug, boolean isHome) {
		readInput(isDebug, isHome);
		System.out.println("Part 1: " + calculateFloor());
		System.out.println("Part 2: " + calculatePosition());
	}

}
