package org.platforms.leetcode.AprilChallenge;

public class NumberOfIslands 
{
	public int numIslands(char[][] grid) 
    {
        if(grid.length <= 0)
        {
            return 0;
        }
        
        int islands = 0;
        for (int i = 0; i < grid.length; i++) 
		{
            for (int j = 0; j < grid[i].length; j++) 
			{
                if (grid[i][j] == '1') 
				{
                    islands++;
                    find(grid, i, j);
                }
            }
        }
        return islands;
    }
    
    private void find(char[][] grid, int i, int j) 
	{
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
		{
			return;
		} 
        
        grid[i][j] = '0';
        find(grid, i+1, j);
        find(grid, i-1, j);
        find(grid, i, j+1);
        find(grid, i, j-1);
        return;
    }

}
