package org.platforms.leetcode.AprilChallenge;

public class BackspaceStringCompare 
{
	public boolean backspaceCompare(String S, String T) 
    {
        String newS  = "";
        String newT  = "";
        
        int currentS = 0;
        int currentT = 0;
        
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i) == '#')
            {
                if(currentS > 0)
                {
                    newS = newS.substring(0,currentS-1);
                    currentS--;
                }
            }
            else
            {
                newS += S.charAt(i);
                currentS++;
            }
        }
        
        for(int i=0; i<T.length(); i++)
        {
            if(T.charAt(i) == '#')
            {
                if(currentT > 0)
                {
                    newT = newT.substring(0,currentT-1);
                    currentT--;
                }
            }
            else
            {
                newT += T.charAt(i);
                currentT++;
            }
        }
        
       return newS.equals(newT);
    }
}
