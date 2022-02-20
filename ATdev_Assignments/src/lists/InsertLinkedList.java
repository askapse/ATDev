package lists;

import java.util.LinkedList;

public class InsertLinkedList {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("White");
		colors.add("Black");
		colors.add("Yeollow");
		
		colors.offerFirst("Pink");
		colors.offerLast("Blue");
		
		for(String s:colors) {
			System.out.println(s);
		}
	}
}
