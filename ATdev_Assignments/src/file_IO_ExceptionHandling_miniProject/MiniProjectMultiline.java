package file_IO_ExceptionHandling_miniProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MiniProjectMultiline {
	static void copyQA(File f) throws IOException {
		BufferedReader qafile = new BufferedReader(new FileReader(f));

		File ans = new File("./Answersm.txt");
		if (!ans.exists())
			ans.createNewFile();

		File que = new File("./Questionsm.txt");
		if (!que.exists())
			que.createNewFile();

		BufferedWriter bfwa = new BufferedWriter(new FileWriter(ans));
		BufferedWriter bfwq = new BufferedWriter(new FileWriter(que));
		String str = "";
		int flag = 2;
		while ((str = qafile.readLine()) != null) {
			str = str.trim();
			try {
			if (!str.equals("")) {
				if ((str.charAt(0) + "" + str.charAt(1) + str.charAt(2)).matches("[Q][0-9]+[:]")) {
					flag = 0;
					bfwq.newLine();
				}
				if ((str.charAt(0) + "" + str.charAt(1) + str.charAt(2)).matches("[A][0-9]+[:]")) {
					flag = 1;
					bfwa.newLine();
				}
			}
			}catch (StringIndexOutOfBoundsException e) {   }

			if (flag == 0) {
				if (!str.equals("")) {
					bfwq.write(str);
					bfwq.newLine();
				}
			} else if (flag == 1) {
				if (!str.equals("")) {
					bfwa.write(str);
					bfwa.newLine();
				}
			}
		}

		qafile.close();
		bfwa.close();
		bfwq.close();
	}

	public static void main(String[] args) throws IOException {
		try {
			File f = new File("./QuestAnswerm.txt");
			if (!f.exists())
				throw new FileNotFoundException("File not found");
			copyQA(f);
			System.out.println("File copied ...");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
