package lists;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdEle {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println("Before remove 3rd element");
		for(Integer a:l) {
			System.out.println(a);
		}
		
		l.remove(2);
		System.out.println("\nAfter remove 3rd element ");
		for(Integer a:l) {
			System.out.println(a);
		}
	}
}
