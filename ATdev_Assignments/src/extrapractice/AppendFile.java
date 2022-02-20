package extrapractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
	public static void main(String[] args) throws IOException {
		File f = new File("./appendfile");
		if(!f.exists()) f.createNewFile();
		
		FileReader fr = new FileReader(f);
		System.out.println("Before append ...");
		int c;
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		fr.close();
		
		FileWriter fw = new FileWriter(f,true);
		System.out.println("\nEnter a append line : ");
		String str = new Scanner(System.in).nextLine();
		fw.write("\n"+str);
		fw.close();
		System.out.println("File written succesfully ...");
		System.out.println("File after append ...............");
		BufferedReader bfr = new BufferedReader(new FileReader(f));
		while((str=bfr.readLine())!=null) {
			System.out.println(str);
		}
		bfr.close();		
	}
}
