package extrapractice;

public class LSum {
	static int luckySum(int a,int b,int c){
		int sum=0;
		if(a!=13)
			if(b!=13)
				if(c!=13)
					return a+b+c;
				else return a+b;
			else return a;
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(luckySum(1, 3, 13));
	}
}
