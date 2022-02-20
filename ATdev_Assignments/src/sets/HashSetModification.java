package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public class HashSetModification {

	public static void main(String args[]) {
		// Creating HashSet and adding elements

		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
//		set.add(null);
//		set.add(null);
		System.out.println("An initial list of elements:" + set);
		set.remove("Ravi");
		System.out.println("An initial list of elements:" + set);

		set.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub

			}
		});
		
		ArrayList i = new ArrayList();
		i.add(1);
		
		set.add("Gaurav");
		set.add("Ajay");
		System.out.println("Updated List:" + set);

		List<String> l = new ArrayList<>();
		l.add("Gaurav");
		l.add("Ajay");
		set.removeAll(l);
		System.out.println("After invoking removeAll() method:" + set);

		set.removeIf(n -> (n.equals("Vijay")));
		System.out.println("After invoking removeIf() method:" + set);

		set.clear();
		System.out.println("After invoking clear() method:" + set);
	}
}
