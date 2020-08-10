package org.platforms.leetcode.AprilChallenge;

public class ProductOfArrayExceptSelf 
{
	public int[] productExceptSelf(int[] nums) 
	    {
	        int[] intArray = new int[nums.length];
	        
	        int multiply = 1;
	        boolean containsZero = false;
	        boolean multipleZero = false;
	        
	        for(int i=0; i<nums.length; i++)
	        {
	            if(nums[i] == 0)
	            {
	               if(containsZero)
	               {
	                   multipleZero = true;
	                   break;
	               }
	                containsZero = true;   
	            }
	            else
	            {
	                multiply = multiply * nums[i];
	            }
	        }
	        
	        if(multipleZero)
	        {
	            for(int i=0; i<intArray.length; i++)
	            {
	                intArray[i] = 0;
	            }
	            return intArray;
	        }
	        
	        for(int i=0; i<intArray.length; i++)
	        {
	            if(nums[i] == 0)
	            {
	                intArray[i] = multiply;
	            }
	            else if(containsZero)
	            {
	                intArray[i] = 0;
	            }
	            else
	            {
	                int value = (int) (multiply/nums[i]) ;
	                intArray[i] = value;
	            }
	        }
	        return intArray;
	    }
	}


