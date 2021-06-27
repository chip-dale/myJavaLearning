import java.util.Arrays;

public class Solution {
	public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i+1]) {
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return nums;
    }
	
	public static void main(String[] args) {
		int[] array = {-4,-1,0,3,10};
		System.out.println("BEFORE: " + Arrays.toString(array));
		sortedSquares(array);
		System.out.println("AFTER: " + Arrays.toString(array));
	}
}
