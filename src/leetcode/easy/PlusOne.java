package leetcode.easy;

public class PlusOne {

	public static void main(String[] args) {
		int digits[] = {1,2,3};
		int[] result = plusOne(digits);

		for(int r:result)
			System.out.print(r + " ");
	}
	public static int[] plusOne(int[] digits) {
	    int carry = 1;
	    for (int i = digits.length - 1; i >= 0; i--) {
	        int currentSum = digits[i] + carry;
	        digits[i] = currentSum % 10;
	        carry = currentSum / 10;
	    }

	    if (carry != 0) {
	        int[] result = new int[digits.length + 1];
	        result[0] = carry;
	        System.arraycopy(digits, 0, result, 1, digits.length);
	        return result;
	    } else {
	        return digits;
	    }
	    }

}
