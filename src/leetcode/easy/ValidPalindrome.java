package leetcode.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println("Given String is Palindrome: " + isPalindrome(s));

	}
	
	public static boolean isPalindrome(String s) {
	    // Remove non-alphanumeric characters and convert to lowercase
	        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Check if the cleaned string is a palindrome
	        int left = 0;
	        int right = cleanedString.length() - 1;

	        while (left < right) {
	            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }
}
