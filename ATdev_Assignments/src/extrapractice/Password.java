package extrapractice;

public class Password {
	public static void main(String[] args) {
		String str="abhi11kaps";
		
		if(str.matches("[a-zA-Z\\d]{10,}")) {
			int c=0;
			for(int i=0;i<str.length();i++) {
				if(Character.isDigit(str.charAt(i))) c++;
			}
			if(c>=2) System.out.println("Valid Password");
			else System.out.println("Invalid Password");
		}else System.out.println("Invalid Password");
	}
}
