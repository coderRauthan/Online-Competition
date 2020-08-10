package org.platforms.leetcode.AprilChallenge;

public class MinimumPathSum 
{
	 public int minPathSum(int[][] grid) 
	 {
	        for(int i=0; i< grid.length; i++)
	         {
	            for(int j=0; j< grid[i].length; j++)
	            {
	                if(i==0 && j==0)
	                {
	                    grid[i][j] = grid[i][j];
	                }
	                else if(i == 0 && j != 0)
	                {
	                    grid[i][j] = grid[i][j-1]+grid[i][j];
	                }
	                else if(j==0 && i != 0)
	                {
	                    grid[i][j] = grid[i-1][j]+grid[i][j];
	                }
	                else
	                {
	                    grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1]) + grid[i][j];
	                }
	            }
	         }
	        
	        int finalRow = grid.length - 1;
	        int finalColoumn = grid[finalRow].length-1;
	        return grid[finalRow][finalColoumn];
	    }

}
