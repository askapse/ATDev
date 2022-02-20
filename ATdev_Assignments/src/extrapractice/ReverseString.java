package extrapractice;

public class ReverseString {
	void reverseString(String str) {
		if (str.length() > 0) {
			System.out.print(str.charAt(str.length() - 1));
			reverseString(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {
		new ReverseString().reverseString("Hello World ...");
	}
}
