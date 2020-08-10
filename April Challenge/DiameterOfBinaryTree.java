package org.platforms.leetcode.AprilChallenge;

public class DiameterOfBinaryTree 
{
	public class TreeNode 
	{
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	
	int max = 0;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root == null)
        {
            return 0;
        } 
        
         findMaxLevel(root);
         return max;
    }
    
    public int findMaxLevel(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        
        int left  = findMaxLevel(node.left);
        int right = findMaxLevel(node.right);
        max = Math.max(max,left+right);
        return Math.max(left,right)+1;
     }

}
