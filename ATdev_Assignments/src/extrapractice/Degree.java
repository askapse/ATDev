package extrapractice;

public class Degree {
	public void getDegree() {		
		System.out.println("I got a degree.");
	}
	
	public static void main(String[] args) {
		Degree d = new Degree();
		Degree du = new UnderGraduate();
		Degree dp = new PostGraduate();
		
		d.getDegree();
		du.getDegree();
		dp.getDegree();
	}
}

class UnderGraduate extends Degree{
	public void getDegree() {		
		System.out.println("I am an Undergraduate.");
	}
}

class PostGraduate extends Degree{
	public void getDegree() {		
		System.out.println("I am a Postgraduate.");
	}
}