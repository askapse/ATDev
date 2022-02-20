package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFile {
	public static void cat(File file) throws IOException {
		RandomAccessFile input = null;
		String line = null;

		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File f = new File("./test.txt");
		if (!f.exists())
			f.createNewFile();
		cat(f);
	}
}