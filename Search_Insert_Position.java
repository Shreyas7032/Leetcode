class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                 index=i;
                 break;
            }
            else
            {
                
                if((target>nums[i] && i==nums.length-1) || (target>nums[i] && target<nums[i+1]))
                {
                    index=i+1;
                    break;
                }
            }
        }
        return index;

    }
}