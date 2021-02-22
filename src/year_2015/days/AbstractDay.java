package year_2015.days;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class AbstractDay implements Day{

	protected static String FILE_PATH;
	protected static String FILE_PATH_DEBUG;
	protected String input;
	
	public void readInput(boolean isDebug, boolean isHome){		
		if(isHome) {
			FILE_PATH = "C:\\Users\\basv_\\git\\adventofcode\\resources\\"
					+ this.getClass().getSimpleName() + ".txt";
			FILE_PATH_DEBUG = "C:\\Users\\basv_\\git\\adventofcode\\resources\\"
					+ this.getClass().getSimpleName() + "_test.txt";
		} else {
			FILE_PATH = "/Users/bvdboomg/personal/adventofcode/resources/"
					+ this.getClass().getSimpleName() + ".txt";
			FILE_PATH_DEBUG = "/Users/bvdboomg/personal/adventofcode/resources/"
					+ this.getClass().getSimpleName() + "_test.txt";
		}
		
		if (isDebug) {
			input = readFile(FILE_PATH_DEBUG);
		} else
		{
			input = readFile(FILE_PATH);
		}
	}
	
	private String readFile(String filePath) {
		String output = "";

		try {
			output = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}
}
