package extrapractice;

public class GDC {
	static int GDC(int a,int b) {
		int num1 = a<b?b:a;
		int num2 = a>b?b:a;
		int r=num2;
		while(num1%num2!=0) {
			r = num1%num2;
			num1 = num2;
			num2 = r;
		}		
		return r;
	}
	public static void main(String[] args) {		
		System.out.println(GDC(9, 6));
	}
}
