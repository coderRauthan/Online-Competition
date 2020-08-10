package org.platforms.leetcode.AprilChallenge;

public class MoveZeroes {

	public void moveZeroes(int[] nums) 
    {
        int index = 0;
        
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] == 0)
            {
                index = i+1;
                
                while(nums[index] == 0 && index <= nums.length-2)
                {
                    index ++;
                }
                
                nums[i] = nums[index];
                nums[index] = 0;
            }
        }
        
    }

}
