package map;

import java.util.HashMap;
import java.util.Map;

public class GetMapKeyValue {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Red");
		m.put(2, "Green");
		m.put(3, "Black");
		m.put(4, "White");
		m.put(5,"Blue");
		
		System.out.println(m.get(3));
	}
}
