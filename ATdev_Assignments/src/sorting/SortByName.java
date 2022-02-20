package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		Collections.addAll(l, new Employee(1, "Mahesh Mane"),new Employee(2, "Abhi Kapse"));
		
		System.out.println("Insertion order ............");
		for(Employee e : l) {
			System.out.println(e.id+" "+e.name);
		}
		
		Collections.sort(l, new SortName());
		
		System.out.println("\nEmployee by name ........");
		for(Employee e : l) {
			System.out.println(e.id+" "+e.name);
		}
	}
}

class Employee{
	int id;
	String name;
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
}

class SortName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}