package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Mahesh kapse"));
		emp.add(new Employee(2, "Abhi Kapse"));
		System.out.println("Before sorting...");
		for(Employee e : emp) {
			System.out.println(e.id+"  "+e.name);
		}
		
		emp.sort(new SortByName());
		
		System.out.println("After sorting...");
		for(Employee e : emp) {
			System.out.println(e.id+"  "+e.name);
		}
		
	}
}
