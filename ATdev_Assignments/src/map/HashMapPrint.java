package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPrint {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Red");
		m.put(2, "Green");
		m.put(3, "Black");
		m.put(4, "White");
		m.put(5,"Blue");
		
		for(Entry<Integer, String> e:m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}	
		
		System.out.println("Size of the map :"+m.size());
		m.clear();
		System.out.println("Size of the map :"+m.size());
	}
}
