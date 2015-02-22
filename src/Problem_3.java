import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Problem_3 {
	
	public static BigInteger QuestionNumber = BigInteger.valueOf(600851475143L);
	public static List<Long> listOfPrimes = new ArrayList<Long>();
	public static List<Long> listOfFactPrimes = new ArrayList<Long>();
	public static List<Long> listOfFactors = new ArrayList<Long>();	
	
	/*
	 * Checks whether the input long is a prime
	 */
	public static boolean isPrime(long n) {
		for (int i=2; (2*i)<n; i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}
	
	public static void primeDivisor(long l) {
		
		for (int i = 1; (2*i) < l; i++) {
			if ((l % i) == 0) {
				listOfFactors.add((long) i);
				//System.out.println(i);
				}
			}
			for (Long currentNum : listOfFactors) {
				if 	(isPrime(currentNum)) {
					listOfFactPrimes.add(currentNum);
				}
			}
			System.out.println(listOfFactPrimes.get(listOfFactPrimes.size() - 1));
		}

	public static void main(String[] args) {
		listOfFactors.clear();
		listOfFactPrimes.clear();
		//primeDivisor(QuestionNumber);
		primeDivisor(50558665);
		}

	}
