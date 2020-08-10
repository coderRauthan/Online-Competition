package org.platforms.leetcode.AprilChallenge;

public class SearchInRotatedSortedArray 
{
	public int search(int[] nums, int target) 
    {
        int left  = 0;
        int right = nums.length - 1;
        
        while(right >= left)
        {
            int mid = (left + right)/2;
            System.out.println(mid);
            
            if(nums[mid] == target)
            {
                return mid;
            }
            
            if(nums[mid] >= nums[0])
            {
                if(target >= nums[left] && target <= nums[mid])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            else
            {
                if(target >= nums[mid] && target <= nums[right])
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
        
    }

}
