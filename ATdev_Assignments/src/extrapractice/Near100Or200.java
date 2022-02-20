package extrapractice;

public class Near100Or200 {
	static boolean nearHundred(int n) {
		int b = 99;
		int a =n>b?n:b;
		b=n<b?n:b;
		if((a-b)<10) return true;
		else {
			b=199;
			a=n>b?n:b;
			b=n<b?n:b;
			if((a-b)<10) return true;
			else return false;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(nearHundred(199));
	}
}
