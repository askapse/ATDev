package extrapractice;

public class Power {
	public static void main(String[] args) {
		int base=3,exponent=4;
		int i=0;
		while(exponent!=i) {
			System.out.print(base+""+(exponent==i+1?"":"x"));			
			i++;
		}
		System.out.print("="+(int)Math.pow(base, exponent));		
	}
}
