package org.platforms.leetcode.AprilChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int currentNumber = n;
		
		Set<Integer> set = new HashSet<>();
		
		System.out.println(checkHappyNumber(currentNumber,set));
	}

	private static String checkHappyNumber(int currentNumber,Set<Integer> set) 
	{
		System.out.println(currentNumber);
		if(currentNumber == 1)
		{
			return "true";
		}
		else if(set.contains(currentNumber))
		{
			return "false";
		}
		else
		{
			set.add(currentNumber);
		}
		
		
		List<Integer> lst = new ArrayList<>();
		
		while(currentNumber > 0)
		{
			int remainder 	   = currentNumber%10;
			currentNumber = currentNumber/10;
			lst.add(remainder);
		}
		
		for(int i=0; i< lst.size(); i++)
		{
			currentNumber += lst.get(i)*lst.get(i);
		}
		
		return checkHappyNumber(currentNumber,set);
	}

}
