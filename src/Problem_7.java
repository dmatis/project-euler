
public class Problem_7 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

		What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		int count = 6;
		long value = 0;
		for (long i=14; i < 100000000L; i++) {
			if (isPrime(i)) {
				count++;
				if (count == 10001) {
					value = i;
					break;
				}
			}
		}
		System.out.println(value);
	}
	
	//checks whether an int is prime or not.
	static boolean isPrime(long n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
