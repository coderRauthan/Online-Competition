package org.platforms.leetcode.AprilChallenge;

public class JumpGame 
{
	public boolean canJump(int[] nums) 
    {
        int currentIndex = 0;
        
        for(int i=0; i<nums.length-1; i++)
        {
            int value = i+nums[i];
            
            if(value > currentIndex)
            {
                currentIndex = value;
            }
            
            if(i == currentIndex)
            {
                return false;
            }
        }
        
        return true;
    }

}
