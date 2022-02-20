package extrapractice;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 123456;
		int sum = 0;
		while(num>0) {
			sum=(sum*10)+(num%10);
			num/=10;
		}
		System.out.println("Reverse of given number : "+sum);
	}
}
