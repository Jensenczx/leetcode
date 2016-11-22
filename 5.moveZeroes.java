public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length <= 1)
        	return;
        List<Integer> list = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) 
        	if(nums[i] == 0)
        		count++;
        	else list.add(nums[i]);
        for(int i = 0; i < list.size(); i++)
        	nums[i] = list.get(i);
        for(int j = list.size(); j < nums.length; j++)
        	nums[j] = 0;
    }

    public void moveZeroes(int[] nums) {
    	if(nums == null || nums.length <= 1)
        	return;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 0)
        		count++;
        	else
        		nums[i-count] = nums[i];
        }
    	for(int j = nums.length - count; j < nums.length; j++)
    		nums[j] = 0;
    }
}