package extrapractice;

public class TripleNum {
	static boolean noTriple(int [] arr) {
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]==arr[i+1]&&arr[i]==arr[i+2]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(noTriple(new int[]{1,2,3,3,4,5,5,5}));
	}
}
