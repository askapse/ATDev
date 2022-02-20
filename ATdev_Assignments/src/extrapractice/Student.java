package extrapractice;

public class Student {
	private String name;
	private String address;
	private int age;

	public Student() {
		this.age = 0;
		this.address = "Not Available";
		this.name = "Unknown";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void print() {
		System.out.println("Name : "+this.name+"\nAge : "+this.age+"\nAddress : "+this.address+"\n");
	}

	public static void main(String[] args) {
		Student [] students =new Student[10];
		students[0] = new Student();
		students[0].setInfo("Anil Kapse", 22);
		students[0].print();
		
		
		students[1] = new Student();
		students[1].setInfo("Mahesh  mane", 24,"kalamb maharastra");
		students[1].print();
		
		
		students[2] = new Student();
		students[2].print();
		
		
		students[3] = new Student();
		students[3].setInfo("Pravin patole", 19,"Barshi solapur maharastra");
		students[3].print();
		
	
		students[4] = new Student();
		students[4].print();
		
		students[5] = new Student();
		students[5].setInfo("Atik Sayyad", 30);
		students[5].print();
		
		students[6] = new Student();
		students[6].setInfo("Anil Kapse", 22);
		students[6].print();
		
		
		students[7] = new Student();
		students[7].setInfo("Mahesh  mane", 24,"kalamb maharastra");
		students[7].print();
		
		
		students[8] = new Student();
		students[8].print();
		
		
		students[9] = new Student();
		students[9].setInfo("Pravin patole", 19,"Barshi solapur maharastra");
		students[9].print();
	}
}
