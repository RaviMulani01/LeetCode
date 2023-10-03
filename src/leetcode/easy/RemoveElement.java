package leetcode.easy;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {1,1,2,5,4,7,3,9,4,3}; // Input array
		int val = 3; // Value to remove
		int[] expectedNums = {1,1,2,5,4,7,9,4};  // The expected answer with correct length.

		int k = removeElement(nums, val);

		assert k == expectedNums.length;

		Arrays.sort(nums, 0, k); // Sort the first k elements of nums

		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		    System.out.print(nums[i] + " ");
		}

	}
	
	public static int removeElement(int[] nums, int val) {
	    int k = 0; // Initialize the count of elements not equal to val
	    
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != val) {
	            nums[k] = nums[i]; // Move the non-val element to the front
	            k++; // Increment the count
	        }
	    }
	    
	    return k; // k represents the count of elements not equal to val
	}


}
