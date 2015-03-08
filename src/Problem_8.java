import java.math.BigInteger;

public class Problem_8 {
	
	public static int findMaxProduct(String string) {
		parseOutLineBreaks(string);
		byte[] byteArray = string.getBytes();
		int[] intArray = toIntArray(byteArray);
		
		int maxProduct = 0;
		for (int i = 0 ; i < 1000 - 13 ; i++) {
			maxProduct = Math.max(getProduct(intArray, i, 13), maxProduct);
		}
		return maxProduct;
	}
	
	private static void parseOutLineBreaks(String string) {
		// TODO Auto-generated method stub
		
	}

	private static int[] toIntArray(byte[] byteArray) {
		// TODO Auto-generated method stub
		return null;
	}

	static int getProduct(int[] intArr, int i, int numDigits) {
		int result = 1;
		for ( ; numDigits > 0 ; numDigits--) {
			result *= intArr[i++];
		}
		return result;
	}

	public static void main(String[] args) {
		int a = 4;
		System.out.println(a);
	}

}
