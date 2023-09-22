package leetcode.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 121;
		boolean result = isPalindrome(number);
		System.out.println("Given Number " + number + " is PalindromeNumber: " + result);

	}
	public static boolean isPalindrome(int x) {
        // Convert the integer to a string
        String xStr = Integer.toString(x);
        
        // Use two pointers approach to compare characters from both ends
        int left = 0;
        int right = xStr.length() - 1;
        
        while (left < right) {
            if (xStr.charAt(left) != xStr.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched, it's a palindrome
    }

}
