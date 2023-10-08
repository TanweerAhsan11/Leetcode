class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)        // we are taking j=i+1, since we dont need to check from 0th index. 
            {
                if(nums[j] + nums[i] == target)    
                {
                    return new int[]{i,j};        // if sum of array == target we return index of i and j.
                }
            }
        }
        return new int[]{};                      // we return nothing if sum of array is != target. 
    }
}
