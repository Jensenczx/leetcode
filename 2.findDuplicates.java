public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    	List<Integer> list = new LinkedList<>();
        if (nums == null || nums.length <= 1) return list;
        for (int i = 0; i < nums.length; i++) nums[(nums[i]-1) % nums.length] += nums.length;
        for (int j = 0; j < nums.length; j++) if(nums[j] > 2*nums.length) list.add(j+1);
        return list;  
    }
}