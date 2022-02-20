package extrapractice;

public class RTicket {
	static int redTicket(int a,int b,int c) {
		if(a==2 && b==2 && c==2) return 10;
		if(a==b && a==c) return 5;
		if(a!=c && a!=b) return 1;		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(redTicket(2,2,2));
	}
}
