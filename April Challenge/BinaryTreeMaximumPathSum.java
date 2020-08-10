package org.platforms.leetcode.AprilChallenge;

public class BinaryTreeMaximumPathSum 
{
	public class TreeNode 
	{
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) 
		      {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
	 }
	
	int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) 
    {
        rootSum(root);
        return max;
     }
    
    private int rootSum(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        
        int leftNodeSum = rootSum(root.left);
        if(leftNodeSum < 0)
        {
            leftNodeSum = 0;
        }
        
        int rightNodeSum = rootSum(root.right);
        if(rightNodeSum < 0)
        {
            rightNodeSum = 0;
        }
        
        int sum = root.val + leftNodeSum + rightNodeSum;
        if(sum > max)
        {
            max = sum;
        }
        
        return root.val+Math.max(leftNodeSum,rightNodeSum);
    }

}
