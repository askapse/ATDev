package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListOfNumbers {
	public static void main(String[] args) throws IOException {
		File f = new File("./test.txt");
		if (!f.exists())
			f.createNewFile();
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		String str;
		while ((str = bfr.readLine()) != null) {
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(str);
			while (m.find())
				System.out.println(m.group());
		}

		bfr.close();
		fr.close();
	}
}
