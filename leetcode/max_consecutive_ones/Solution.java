public class Solution {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int corrent = 0;
		for (int i : nums) {
			if(i == 1) {
				corrent++;
			} else {
				if(corrent > max) {
					max = corrent;
				}
				if(max >= nums.length / 2) {
					return max;
				}
				corrent = 0;
			}
		}
		return Math.max(max, corrent);
	}
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,0,1,0,0,1,1};
		String txt = "the maximum number of consecutive 1's in the array: ";
		int max = findMaxConsecutiveOnes(nums);
		
		System.out.println(txt + max);
	}
}
