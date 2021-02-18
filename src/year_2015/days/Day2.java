package year_2015.days;

public class Day2 implements Day {

	private String input = readFileToString(FILE_PATH);
	private static final String FILE_PATH = "/Users/bvdboomg/personal/adventofcode/resources/Day2.txt";


	public String[] splitInput(String in) {
		String[] array = in.split("\n");
		return array;
	}

	public int calculate() {
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
			smallest = Math.min(l, w);
			smallest = Math.min(smallest, h);

			System.out.println("Total: " + total + " + (2 * " + l + " * " + w + " ) + (2 * " + w + " * " + h + ") + (2 * " + h + " * " + l + ") + " + smallest);
			total += ((2 * l * w) + (2 * w * h) + (2 * h * l) + smallest);
			System.out.println(total);
		}

		return total;
	}

	@Override
	public void execute() {

		System.out.println(calculate());
	}
}
