package extrapractice;

public class Old35 {
	static boolean old35(int num) {
		if (num % 3 == 0 || num % 5 == 0) {
			if (num % 3 == 0 && num % 5 == 0)
				return false;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(old35(22));
	}
}
