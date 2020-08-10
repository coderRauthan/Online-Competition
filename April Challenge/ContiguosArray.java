package org.platforms.leetcode.AprilChallenge;

import java.util.HashMap;
import java.util.Map;

public class ContiguosArray 
{
	public int findMaxLength(int[] nums) 
    {
        if(nums.length < 2)
        {
            return 0;
        }
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        map.put(0,0);
        
        int count = 0;
        int max   = 0;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count--;
            }
            else
            {
                count++;
            }
            
            if(map.containsKey(count))
            {
                int lastValue = map.get(count);
                int value     = i+1 - lastValue;
                
                if(value > max)
                {
                    max = value;
                }
            }
            else
            {
                map.put(count,i+1);
            }
        }
        
        return max;
        
    }
}
