package org.platforms.leetcode.AprilChallenge;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK 
{
	public int subarraySum(int[] nums, int t) 
    {
			Map<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
            int ans = 0;
            int sum = 0;
        
            for(int i=0; i< nums.length;i++)
            {
                sum += nums[i];
                
                if(map.containsKey(sum - t))
               {
                   int count = map.get(sum-t);
                   ans+=  count;
                   
                }
               
                
                if(map.containsKey(sum))
                {
                    int val = map.get(sum);
                    map.put(sum,val+1);
                }
                else
                {
                    map.put(sum,1);
                }
                
                
            }
        
        return ans;
        
    }

}
