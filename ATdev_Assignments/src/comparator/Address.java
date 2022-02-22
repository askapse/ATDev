package comparator;

public class Address {
	String contry;
	String state;
	String city;

	public Address(String contry,String state,String city) {
		this.contry = contry;
		this.state = state;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [contry=" + contry + ", state=" + state + ", city=" + city + "]";
	}	
}
