package extrapractice;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c = in.nextLine().charAt(0);

		if (Character.isAlphabetic(c)) {
			c=Character.toLowerCase(c);
			switch (c) {
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;

			default:
				System.out.println("Consonant");
			}
		}
	}
}
