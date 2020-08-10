package org.platforms.leetcode.AprilChallenge;

public class MiddleOfTheLinkedList 
{
	public class ListNode 
	{
	      int val;
	      ListNode next;
	      ListNode(int x) 
	      { 
	    	 val = x; 
	      }
	 }
	 
	
	public ListNode middleNode(ListNode head) 
    {
           ListNode mynode = head;
        
            int size = 0;
            while(mynode != null)
            {
               size ++;
               mynode = mynode.next;
            }
           
           int limit = 0;
        
            while(limit < size/2 )
            {
                limit ++;
                head = head.next;
            }
        
            return head;
    }

}
