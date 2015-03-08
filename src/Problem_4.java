import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Problem_4 {
	private static int examplePal = 9009;
	private static List<Integer> paliList;
	
	// Multiply 2, 3 digit numbers to generate a palindrome number.
	
	public static boolean palindromeCheck(int num1, int num2) {
		if ((num1 * num2) == reverse((num1 * num2))) {
			return true;
		}
	return false;
	}
	
	public static void paliFinder() {
		paliList = new ArrayList<Integer>();
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				if (palindromeCheck(i, j)) {
					paliList.add(i*j);
				}
			}
		}
		System.out.println(Collections.max(paliList));
	}
	
	public static void main(String[] args) {
//		System.out.println("Enter the number to reverse: ");
//		int number = new Scanner(System.in).nextInt();
//		
//		int reverse = reverse(number);
//		System.out.println("Reverse of number: " + number + " is " + reverse(number));
		
		paliFinder();
		
	}
		
		public static int reverse(int number) {
			int reverse = 0;
			int remainder = 0;
			do {
				remainder = number%10;
				reverse = reverse*10 + remainder;
				number = number/10;
			}
			while (number > 0);
			
			return reverse;
		}

	}
