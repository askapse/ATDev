package lists;

import java.util.ArrayList;

public class CopyArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		
		ArrayList<Integer> lcp = new ArrayList<Integer>(l);
		l.add(3);
		for(Integer a : lcp) {
			System.out.println(a);
		}
		
	}
}
