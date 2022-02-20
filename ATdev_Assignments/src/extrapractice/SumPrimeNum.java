package extrapractice;

public class SumPrimeNum {
	static boolean isPrime(int n) {
		int t = n / 2;
		while (t > 1) {
			if (n % t == 0)
				return false;
			t--;
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 34;
		for (int i = num; i >= num / 2; i--) {
			if (isPrime(i)) {
//				for (int j = 0; j < num; j++) {
//					if (isPrime(j)) {
//						if ((i + j) == num)
//							System.out.printf("%d=%d+%d\n", num, num - i, i);
//					}
//				}
				if(isPrime(num-i)) {
					System.out.printf("%d=%d+%d\n",num,num-i,i);
				}
			}

		}
	}

}
