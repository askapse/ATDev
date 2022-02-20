package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToList {
	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		for (int i = 2; i <= 10; i++) {
			num.add(i);
		}
	
	ArrayList<Integer> l = new ArrayList<>(num);
	
	System.out.println(l);
		
		
	}
}
