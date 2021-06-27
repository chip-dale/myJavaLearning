public class Solution {
	public static int findNumbers(int[] nums) {
		int digits = 0;
        for(int i = 0; i < nums.length; i++) {
        	int count = (nums[i] == 0) ? 1 : 0;
            while (nums[i] != 0) {
                count++;
                nums[i] /= 10;
            }
        	if(count % 2 == 0) digits++;
        }
        return digits;
	}
	
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896,555,901,482,1771};
		String txt = "even number of digits: ";
		int count = findNumbers(nums);
		
		System.out.println(txt + count);
	}
}
