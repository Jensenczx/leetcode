public class Solution {
    public int thirdMax(int[] nums) {
      	if(nums == null || nums.length == 0)
      		return 0;

        Integer max1 = nums[0];
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] > max1)
        		max1 = nums[i];
        }

        Integer max2 = null;
        for(int j = 0; j < nums.length; j++) {
        	if(nums[j] < max1)
        		max2 = max2 == null ? nums[j] : Math.max(nums[j], max2);
        }
        
        if(max2 == null)
        	return max1;

        Integer max3 = null;
        for(int k = 0; k < nums.length; k++) {
        	if(nums[k] < max2)
        		max3 = max3 == null ? nums[k] : Math.max(nums[k], max3);
        }

        return max3 == null ? max1 : max3;
    }


}