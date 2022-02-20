package sets;

import java.util.TreeSet;

public class TreeSetFLRemove {
	public static void main(String[] args) {
		TreeSet<String> ts =  new TreeSet<>();
		ts.add("Black");
		ts.add("Green");
		ts.add("Orange");
		ts.add("Red");
		ts.add("White");
		
		System.out.println("First Element is:"+ts.first());
		System.out.println("Last Element is:"+ts.last());
	}
}
