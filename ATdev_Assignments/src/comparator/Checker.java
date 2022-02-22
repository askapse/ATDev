package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Checker implements Comparator<Player>{
	@Override
	public int compare(Player o1, Player o2) {
		if(o1.score == o2.score) {
			return o1.name.compareTo(o2.name);
		}
		
		return o1.score-o2.score;		
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter Number of entries : ");
		int n = in.nextInt();
		Player [] pl = new Player[n];
		
		for(int i = 0;i<pl.length;i++) {
			System.out.print("\nEnter Name and Score : ");
			String name = in.next();
			int score = in.nextInt();
			
			pl[i] = new Player(score, name);
		}
		
			
		Arrays.sort(pl, new Checker());
	
		System.out.println("After sorting.....");
		for(int i =0; i<pl.length;i++) {
			System.out.println("Name : "+pl[i].name+"  Score : "+pl[i].score);
		}
	}
	
}
