public class Solution {
	
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<>();
        if(nums == null || nums.length <= 1) return result;
        int[] array = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) array[i]++;
        for (int j = 1; j < array.length; j++) if(array[j] == 0) result.add(j);
        return result;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> result = new LinkedList<>();
        if (nums == null || nums.length <= 1) return result;
        for (int i = 0; i < nums.length; i++) nums[(nums[i] - 1)%nums.length] += nums.length;
      	for (int j = 0; j < nums.length; j++) if (nums[j] <= nums.length) result.add(j);
      	return result;
    }
}