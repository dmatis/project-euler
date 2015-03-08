import static java.lang.Math.abs;
public class Problem_6 {
	//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum_of_square = sumOfSquare();
		int square_of_sum = squareOfSum();
		int diff_of_sums = abs(sum_of_square - square_of_sum);
		System.out.println("The difference of sums is: " + diff_of_sums);
	}

	private static int sumOfSquare() {
		int sum_of_square = 0;
		for (int i = 1; i < 101; i++) {
			sum_of_square += (i * i);
		}
		System.out.println("Sum of Squares to 100: " + sum_of_square);
		return sum_of_square;
	}

	private static int squareOfSum() {
		int square_of_sum = 0;
		for (int i = 1; i < 101; i++) {
			square_of_sum += i;
		}
		square_of_sum = (square_of_sum * square_of_sum);
		System.out.println("Square of Sums to 100: " + square_of_sum);
		return square_of_sum;
	}	
}