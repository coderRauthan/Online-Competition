package org.platforms.leetcode.AprilChallenge;

public class LongestCommonSubsequence 
{
	public int longestCommonSubsequence(String text1, String text2) 
    {
        if(text1 == null || text1.isEmpty() || text2 == null || text2.isEmpty())
        {
            return 0;
        }
        
        if(text1.equals(text2))
        {
            return text1.length();
        }
        
        int[][] table = new int[text1.length()+1][text2.length()+1];
        
        for(int i=1; i<= text1.length(); i++)
        {
            for(int j=1; j<= text2.length(); j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    table[i][j] = 1 + table[i-1][j-1];
                    //System.out.println(""+i+""+j+" : "+table[i][j]);
                }
                else
                {
                    table[i][j] = Math.max(table[i][j-1],table[i-1][j]);
                    //System.out.println(""+i+""+j+" : "+table[i][j]);
                }
            }
        }
        
        return table[text1.length()][text2.length()];
    }
}
