package org.platforms.leetcode.AprilChallenge;

import java.util.Stack;

public class MinStack 
{
	Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min   = new Stack<Integer>();
    /** initialize your data structure here. */
    public MinStack() 
    {
    	
    }
    
    public void push(int x) 
    {
       stack.push(x); 
    
       if(min.isEmpty())
       {
           min.push(x);
       }
       else
       {
           if(x <= min.peek())
           {
               min.push(x);
           }
       }
    }
    
    public void pop() 
    {
        int a = stack.pop();
        if(a == min.peek())
        {
            min.pop();
        }
    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin() 
    {
        return min.peek();
    }
}
