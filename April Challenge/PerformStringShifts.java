package org.platforms.leetcode.AprilChallenge;

public class PerformStringShifts 
{
	public String stringShift(String s, int[][] shift) 
    {
        if(s == null || s.isEmpty())
        {
            return "";
        }
        
        for(int i=0; i< shift.length; i++)
        {
            int shiftV = shift[i][0];
            
            int times  = shift[i][1];
                
            if(shiftV == 0)
            {
                s = leftShift(s,times);
            }
            else
            {
                s = rightShift(s,times);
            }
        }
        
        return s;
    }
    
    private String leftShift(String s,int times)
    {
        for(int i=1; i<= times; i++)
        {
            String newString = s.substring(1);
            newString += s.charAt(0);
            s = newString;
        }
        return s;
    }
    
    private String rightShift(String s,int times)
    {
        for(int i=1; i<=times; i++)
        {
            String newString = s.substring(0,s.length()-1);
            newString = s.charAt(s.length()-1)+newString; 
            s         = newString;
        }
        return s;
    }

}
