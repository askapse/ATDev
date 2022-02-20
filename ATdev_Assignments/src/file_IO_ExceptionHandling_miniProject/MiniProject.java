package file_IO_ExceptionHandling_miniProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MiniProject {
	static void copyQA(File f) throws IOException {
		BufferedReader qafile = new BufferedReader(new FileReader(f));
		
		File ans = new File("./Answers.txt");
		if(!ans.exists()) ans.createNewFile();
		
		File que = new File("./Questions.txt");
		if(!que.exists())que.createNewFile();
		
		BufferedWriter bfwa = new BufferedWriter(new FileWriter(ans));
		BufferedWriter bfwq = new BufferedWriter(new FileWriter(que));
		String str = "";
		while((str=qafile.readLine())!= null) {
			if(str.startsWith("Q")) {
				bfwq.write(str);
				bfwq.newLine();
			}
			if(str.startsWith("A")) {
				bfwa.write(str);
				bfwa.newLine();
			}		
		}
		
		qafile.close();
		bfwa.close();
		bfwq.close();
	}

	public static void main(String[] args) throws IOException {
		try {
			File f = new File("./QuestAnswer.txt");
			if(!f.exists()) throw new FileNotFoundException("File not found");
			copyQA(f);
			System.out.println("File copied ...");
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
