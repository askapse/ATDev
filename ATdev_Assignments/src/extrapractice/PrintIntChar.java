package extrapractice;

public class PrintIntChar {
	void print(int n,char c) {
		System.out.println("Integer : "+n+"\nCharacter : "+c);
	}
	
	void print(char c,int n) {
		System.out.println("Integer : "+n+"\nCharacter : "+c);
	}
	
	public static void main(String[] args) {
		PrintIntChar pchin = new PrintIntChar();
		pchin.print(20, 'A');
		pchin.print('B', 30);
	}
}
