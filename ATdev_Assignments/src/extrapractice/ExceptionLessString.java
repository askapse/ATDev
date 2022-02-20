package extrapractice;

import java.util.Scanner;

class ShortString extends Exception{
	public ShortString() {
		System.err.println("Short string error");
	}
	public ShortString(String str) {
		System.err.println(str+"short string error");
	}
}
public class ExceptionLessString {
	public static void main(String[] args) throws ShortString {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a string : ");
		String str = in.nextLine();
		if(str.length()<100) throw new ShortString();
	}
}
