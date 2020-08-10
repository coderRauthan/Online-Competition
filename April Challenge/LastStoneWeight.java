package org.platforms.leetcode.AprilChallenge;

import java.util.ArrayList;
import java.util.List;

public class LastStoneWeight 
{
	class Solution 
	{
	    public int lastStoneWeight(int[] stones) 
	    {
	        List<Integer> lst = new ArrayList<Integer>();
	        
	        for(int i=0; i< stones.length; i++)
	        {
	            lst.add(stones[i]);
	        }
	        
	        return findIt(lst);
	    }
	    
	    public int findIt(List<Integer> lst)
	    {
	        if(lst.size() == 1)
	        {
	            return lst.get(0);
	        }
	        
	        if(lst.size() == 0)
	        {
	            return 0;
	        }
	        
	        int maxIndex  = -1;
	        int sMaxIndex = -1;
	        int max       =  Integer.MIN_VALUE;
	        int sMax      =  Integer.MIN_VALUE;
	        
	        for(int i=0; i< lst.size(); i++)
	        {
	            if(lst.get(i)== max)
	            {
	                sMax      = lst.get(i);
	                sMaxIndex = i;
	            }
	            else if(lst.get(i) > max)
	            {
	                sMax = max;
	                sMaxIndex = maxIndex;
	                
	                max = lst.get(i);
	                maxIndex = i;
	            }
	            else if(lst.get(i) > sMax)
	            {
	                sMax      = lst.get(i);
	                sMaxIndex = i;
	            }
	        }
	        
	        List<Integer> newList = new ArrayList<>();
	        for(int i=0; i< lst.size(); i++)
	        {
	            if(i != maxIndex && i != sMaxIndex)
	            {
	                newList.add(lst.get(i));
	            }
	        }
	        
	        int difference = max - sMax;
	        if(difference > 0)
	        {
	            newList.add(difference);
	        }
	        
	        return findIt(newList);
	    }
	}
}
