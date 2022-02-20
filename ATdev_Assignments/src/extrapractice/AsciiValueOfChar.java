package extrapractice;

import java.util.Scanner;

public class AsciiValueOfChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter a character : ");
		char c = in.nextLine().charAt(0);
		System.out.println("ASCII value of given character : "+(int)c);
	}
}
