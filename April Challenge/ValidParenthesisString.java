package org.platforms.leetcode.AprilChallenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParenthesisString 
{
	public boolean checkValidString(String s) 
    {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i< s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(i);
            }
            else if(s.charAt(i) == '*')
            {
                queue.offer(i);
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else if(!queue.isEmpty())
                {
                    //System.out.println("uppper Star Used: for "+i+" is "+queue.peek());
                    queue.poll();
                }
                else
                {
                    //System.out.println("False called for i: "+i);
                    return false;
                }
            }
        }
        
        Stack<Integer> newStack = new Stack<>();
        while(!stack.isEmpty())
        {
            newStack.push(stack.pop());
        }
        
        while(!newStack.isEmpty())
        {
            int n = newStack.peek();
            
            if(queue.isEmpty())
            {
                //System.out.println("False called for n: "+n);
                return false;
            }
            
            while(!queue.isEmpty())
            {
                  if(n > queue.peek())
                  {
                      //System.out.println("lower Star Used: for n: "+n+" is: "+queue.peek());
                      queue.poll();
                  }
                  else
                  {
                      newStack.pop();
                      queue.poll();
                      break;
                  }
            }
        }
        
        return true;
            
        }

}
