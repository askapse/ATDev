package extrapractice;

public class Swap {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("A : "+a+" B : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A : "+a+" B : "+b);
	}
}
