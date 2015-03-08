
public class prime_tester {
	
	/*checks whether an int is prime or not.
		If not a multiple of 2, look at odd numbers only
	*/
	
	boolean isPrime(int n) {
		if (n%2 == 0) {
			return false;
		}
		for (int i=3; (2*i)<n; i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
