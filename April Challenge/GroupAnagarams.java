package org.platforms.leetcode.AprilChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagarams 
{
	public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> anagrams = new ArrayList<>();
		
		Map<String,List<String>> existingPoints = new HashMap<String,List<String>>();
        
         for(int i=0; i< strs.length; i++)
        {
            String s = strs[i];
            char[] a = new char[s.length()];
            
            for(int j=0; j< s.length(); j++)
            {
            	a[j] = s.charAt(j);
            }
            
            Arrays.sort(a);
    		String hash = String.valueOf(a);
            
            if(existingPoints.containsKey(hash))
            {
            	List<String> lst = new ArrayList<>();
            	lst = existingPoints.get(hash);
            	lst.add(s);
            }
            else
            {
            	List<String> lst = new ArrayList<>();
            	lst.add(s);
            	existingPoints.put(hash, lst);
            }
        }
        
        Set<String> ans = new HashSet<String>();
        ans				 = existingPoints.keySet();
        
        for(String a: ans)
        {
        	List<String> lstString	=	existingPoints.get(a);
        	anagrams.add(lstString);
        }

        return anagrams;
	}
}
