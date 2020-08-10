package org.platforms.leetcode.AprilChallenge;

public class BitwiseAndOfNumbersRange 
{
	public int rangeBitwiseAnd(int m, int n) 
    {
        while(n > m)
        {
            n = n & (n-1);
        }
        
        return n;
        
        
    }

}
