package extrapractice;

public class AreaSR {
	double area(double b,double l) {
		return b*l;
	}
	
	double area(double b) {
		return b*b;
	}
	
	public static void main(String[] args) {
		AreaSR obj = new AreaSR();
		System.out.println(obj.area(2.2));
		System.out.println(obj.area(1.2,12.2));
	}
}
