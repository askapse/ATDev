package extrapractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordInFile {
	public static void main(String[] args) throws IOException {
		File f = new File("./test.txt");
		if (!f.exists())
			f.createNewFile();
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		String str;
		String word = "";
		while ((str = bfr.readLine()) != null) {
			String s[] = str.split(" |\\d+");
			for (String w : s) {
				if (word.length() < w.length()) {
					word = w;
				}
			}
		}

		System.out.println("Longest word of the file : " + word);
	}
}
