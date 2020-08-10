package org.platforms.leetcode.AprilChallenge;

public class MaximalSquare 
{
	public int maximalSquare(char[][] matrix) 
    {
        if(matrix.length == 0)
        {
            return 0;
        }
        
        int[][] solution = new int[matrix.length+1][matrix[0].length+1] ;
        
        int maximalSquare = 0;
        for(int i=1; i<= matrix.length; i++)
        {
            for(int j=1; j<= matrix[i-1].length; j++)
            {
                if(matrix[i-1][j-1] == '0')
                {
                    solution[i][j] = 0;
                }
                else
                {
                    solution[i][j] = Math.min(solution[i-1][j-1],Math.min(solution[i][j-1],solution[i-1][j])) + 1;
                    if(solution[i][j] > maximalSquare)
                    {
                        maximalSquare = solution[i][j];
                    }
                }
            }
        }
        
        return maximalSquare * maximalSquare;
        
    }

}
