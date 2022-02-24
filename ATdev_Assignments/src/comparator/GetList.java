package comparator;

import java.util.ArrayList;
import java.util.List;

public class GetList {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Mahesh kapse", new Address("India", "Maharastra", "Pune")));
		emp.add(new Employee(2, "Abhi Kapse", new Address("India", "Karanataka", "Benguluru")));
		emp.add(new Employee(1, "Anant Kale", new Address("India", "Maharastra", "Osmanabad")));
		emp.add(new Employee(1, "Pravin Patole", new Address("India", "Maharastra", "Nashik")));

		for (Employee e : emp) {
			if (e.address.state.equalsIgnoreCase("Maharastra")
					&& (e.address.city.equalsIgnoreCase("pune") || e.address.city.equalsIgnoreCase("Nashik"))) {
				System.out.println("Name : " + e.name + " Address : " + e.address);
			}
		}	
	}
}
