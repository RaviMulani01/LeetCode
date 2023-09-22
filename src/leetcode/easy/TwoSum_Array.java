package leetcode.easy;
import java.util.ArrayList;
import java.util.List;

public class TwoSum_Array {
	public static void main(String[] args) {
		 int[] nums = {2, 7, 11, 15, 3, 8,1};
	        int target = 9;
	       
	        List<int[]> pairs = twoSum(nums, target);
	        if (!pairs.isEmpty()) {
	            for (int[] pair : pairs) {
	                System.out.println("Pairs: " + pair[0] + ", " + pair[1]);
	            }
	        } else {
	            System.out.println("No valid pairs found.");
	        }
	    }

	 public static List<int[]> twoSum(int[] nums, int target) {
	        List<int[]> result = new ArrayList<>();
	        for (int i = 0; i < nums.length - 1; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    result.add(new int[]{i, j});
	                }
	            }
	        }

	        return result;
	    }
}
