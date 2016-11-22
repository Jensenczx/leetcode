public class Solution {

    public int findDuplicate(int[] nums) {
    	if(nums == null || nums.length = 0)
    		return 0;
    	int mid = 0, low = 1, high = nums.length - 1;
    	while(low < high) {
    		mid = (low + high)/2;
    		int count = 0;
    		for (int i = 0; i < nums.length; i++) {
    			if(nums[i] <= mid)
    				count++;
    		}
    		if(count > mid) {
    			high = mid;
    		} else {
    			low = mid + 1;
    		}
    	}
    	return low;
    }
}
