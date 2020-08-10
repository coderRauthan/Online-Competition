package org.platforms.leetcode.AprilChallenge;

public class MaximumSubArray 
{
	public int maxSubArray(int[] nums) 
    {
        int currentSum = 0;
        int maxSubSum  = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++)
        {
            if(currentSum < 0)
            {
                currentSum = nums[i];
            }
            else
            {
                currentSum += nums[i];
            }
            
            if(currentSum > maxSubSum)
            {
               maxSubSum = currentSum;  
            }
        }
        
        return maxSubSum;
    }

}
