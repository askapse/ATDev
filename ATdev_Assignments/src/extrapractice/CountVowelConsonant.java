package extrapractice;

public class CountVowelConsonant {
	public static void main(String[] args) {
		String str="hello world...";
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				char ch = Character.toLowerCase(str.charAt(i));
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
				else c++;
			}
		}
		System.out.println("Vowels : "+v+" Consonant : "+c);
	}
}
