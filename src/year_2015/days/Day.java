package year_2015.days;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public interface Day {

	void execute();

	default public String readFileToString(String filePath) {
		String output = "";

		try {
			output = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

}
