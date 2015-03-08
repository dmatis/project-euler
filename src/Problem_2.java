
public class Problem_2 {

	/*
	 * By considering the terms in the Fibonacci sequence whose values
	 * do not exceed four million, find the sum of the even-valued terms.
	 */
	
	private static boolean validFib(int i) {
		if (((i - 2) + (i - 1)) % 2 == 0) {
			return true;
		} else return false;
	}
	
	public static int sumEvenFib(int n) {
		int totalSum = 0;
		for (int i=2; i<n; i++) {
			if (validFib(i)) {
				totalSum += i;
			}
		}
		return totalSum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumEvenFib(4000000));
	}

}
