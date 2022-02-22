package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByDepartmentId  implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.d.did-o2.d.did;
	}
	
	
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		Department d1 = new Department(1, "Account");
		Department d2 = new Department(2, "Library");
		emp.add(new Employee(1, "Mahesh kapse",d2));
		emp.add(new Employee(2, "Abhi Kapse",d1));
		System.out.println("Before sorting...");
		for(Employee e : emp) {
			System.out.println("Department id "+e.d.did+" Department name "+e.d.name+"  "+e.id+"  "+e.name);
		}
		
		emp.sort(new SortByDepartmentId());
		
		System.out.println("After sorting...");
		for(Employee e : emp) {
			System.out.println("Department id "+e.d.did+" Department name "+e.d.name+"  "+e.id+"  "+e.name);
		}
	}
}
