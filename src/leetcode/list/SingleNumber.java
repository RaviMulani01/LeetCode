package leetcode.list;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
//		int result = singleNumber(nums);
		int result = singleNumbers(nums);
		System.out.println(result);

	}
	//return result using the XOR operator
	public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
	}
	
	//using nested for loop	
	public static int singleNumbers(int[] nums) {
        for(int i = 0 ; i <nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    if(i!=j){
                    count ++;
                    }
                }
            }
            if(count == 0){
                return nums[i];
            }
        }
        return -1;
    }
}
