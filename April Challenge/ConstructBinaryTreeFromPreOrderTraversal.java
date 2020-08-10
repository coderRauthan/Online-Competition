package org.platforms.leetcode.AprilChallenge;

public class ConstructBinaryTreeFromPreOrderTraversal 
{
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	int index = 0; 
    public TreeNode bstFromPreorder(int[] A) 
     {
         int max          = Integer.MAX_VALUE;
         return getBST(A,max);
     }
    
    public TreeNode getBST(int[] A,int lastValue)
    {
        System.out.println(index);
        if(index >= A.length || A[index] > lastValue)
        {
            return null;
        }
        
        TreeNode node = new TreeNode(A[index]);
        index++;
        
        node.left  = getBST(A,node.val);
        node.right = getBST(A,lastValue);
        return node;
    }

}
