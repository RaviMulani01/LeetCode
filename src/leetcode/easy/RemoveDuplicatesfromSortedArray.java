package leetcode.easy;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

		int[] nums = {1,2,3,3,4}; // Input array
		int[] expectedNums = {1,2,3,4}; // The expected answer with correct length

		int k = removeDuplicates(nums); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}
		
		for(int r:nums)
			System.out.print(r + " ");

	}
	
	public static int removeDuplicates(int[] nums) {
	    if (nums.length == 0) {
	        return 0; // Empty array, no duplicates to remove
	    }
	    
	    int uniqueCount = 1; // Initialize with the first element as unique
	    int currentUnique = nums[0]; // The current unique element
	    
	    for (int i = 1; i < nums.length; i++) {
	        if (nums[i] != currentUnique) {
	            // Found a new unique element
	            currentUnique = nums[i];
	            nums[uniqueCount] = currentUnique;
	            uniqueCount++;
	        }
	    }
	    
	    return uniqueCount;
	    }
}
