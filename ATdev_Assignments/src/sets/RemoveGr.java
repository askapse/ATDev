package sets;

import java.util.TreeSet;

public class RemoveGr {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(22);
		ts.add(36);
		ts.add(25);
		ts.add(16);
		ts.add(70);
		ts.add(82);
		ts.add(89);
		ts.add(14);
		
		System.out.println("Strictly greater than 76 :"+ts.ceiling(76));
		System.out.println("Strictly greater than 31 :"+ts.ceiling(31));
		
	}
}
