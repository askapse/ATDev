package extrapractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleInput {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("\nEnter a number : ");
			double f = in.nextFloat();
			if(f>0&&f<1) System.out.println(true);
			else System.out.println(false);		
		}catch(InputMismatchException e) {
			System.err.println("Enter only double values...");
		}
	}
}
