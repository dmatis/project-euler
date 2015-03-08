
public class Problem_10 {

	/**
	 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

		Find the sum of all the primes below two million.
	 */
	static boolean isPrime(int n) {
		// add prime feature to not look at multiples of 3, 5
		if (n%2 == 0) {
			return false;
		}
		for (int i=3; (2*i)<n; i+=2) {
	        if(n%i==0) {
	            return false;
	        }
		}
		return true;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		long sumPrime = 5;
		for (int i = 5; i < 2000000; i+=2) {   // currently still iterating through all numbers, but we know prime is only found in odd #'s after 2
			if (isPrime(i)) {
				System.out.println(i);
				sumPrime += i;
				}
			}
		System.out.println("The sum of all primes is: " + sumPrime);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000000;  //divide by 1000000 to get milliseconds.
		System.out.println("The runtime duration was: " + duration);
	} // currently running in 162 seconds
}
