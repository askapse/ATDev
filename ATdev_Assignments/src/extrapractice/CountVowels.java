package extrapractice;

public class CountVowels {
	public static void main(String[] args) {
		int count=0;
		String str = "hello firends how are you today..???";
		for(int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') count++;
		}
		
		System.out.println("Vowels in string : "+count);
	}
}
