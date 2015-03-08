
public class Problem_1 {
	
	/*
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	
	public static int multipleSum(int n) {
		int totalSum = 0;
		for (int i=0; i<n; i++) {
			if (i % 3 == 0 | i % 5 == 0) {
				totalSum += i;
			}
		}
		return totalSum;
	}
	
	public static void main(String[] args) {
		System.out.println(multipleSum(1000));
	}

}
