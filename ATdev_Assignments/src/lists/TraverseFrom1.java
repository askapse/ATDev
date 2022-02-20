package lists;

import java.util.LinkedList;

public class TraverseFrom1 {
	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("White");
		colors.add("Black");
		colors.add("Yeollow");
		
		for(int i = 1;i<colors.size();i++) {
			System.out.println(colors.get(i));
		}
	}
}
