package org.platforms.leetcode.AprilChallenge;

import java.util.HashSet;
import java.util.Set;

public class CountingElements 
{
	public int countElements(int[] arr) 
	{
	   Set<Integer> set = new HashSet<>();
	        
	        for(int i=0; i< arr.length; i++)
	        {
	            set.add(arr[i]);
	        }
	        
	        int available = 0;
	        for(int i=0; i< arr.length; i++)
	        {
	            int a = arr[i]+1;
	            
	            if(set.contains(a))
	            {
	                available ++;
	            }
	        }
	        
	        return available;
	    }

}


