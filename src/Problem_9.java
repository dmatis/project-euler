
public class Problem_9 {

	/**
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

		a^2 + b^2 = c^2
		For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

		There exists exactly one Pythagorean triplet for which a + b + c = 1000
		Find the product abc.
	 */
	public static void main(String[] args) {

		for (int i=1; i<500; i++) {
			for (int j=i; j<500; j++) {   // j = i ensures that a <= b
				for (int k=j; k<500; k++) {
					if (((i * i) + (j * j) == (k * k)) && ((i + j + k) == 1000)) { // a^2 + b^2 == c^2  &&  a + b + c == 1000
						System.out.println(i * j * k);
						System.out.println("the value of a is: " + i);
						System.out.println("the value of b is: " + j);
						System.out.println("the value of c is: " + k);
						break;
					}
				}
			}
		}
		
	}

}
