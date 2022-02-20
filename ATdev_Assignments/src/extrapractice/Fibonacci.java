package extrapractice;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0; 
		int b = 1;
		int c = 0;
		int n = 6;
		while(n>0) {			
			c=a+c;
			a=b;
			b=c;
			System.out.print(c+" ");
			n--;
		}
	}
}
