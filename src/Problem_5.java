
public class Problem_5 {
	
	// to speed up program:
	// start looking at numbers above 2520
	// increment numbers by 2 (never odd)

	/*
	 * smallMult( initial number to start with)
	 */
	public static int smallMult(int number) {
		int remainder = 0;
			for (int i = 1; i < 11; i++) {
				remainder = number%i;
				if (i == 10) {
					System.out.println(number);
				}
				if (remainder != 0) {
					number = number + 2;
					smallMult(number);
				}

				}
			return number;
			}
	
	public static void main(String[] args) {
		smallMult(2200);

	}

}


