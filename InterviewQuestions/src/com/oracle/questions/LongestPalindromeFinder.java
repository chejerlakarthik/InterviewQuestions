package com.oracle.questions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LongestPalindromeFinder {

	@Test
	public void testForLongestPalindrome() 
	{
		String longest = findLongestPalindrome("XYZ123XYZMALAYALAMABCDMADAM");
		assertEquals("MALAYALAM", longest);
	}
	
	public boolean isPalindrome(String inputString)
	{
		int end = inputString.length() - 1;
		
		for(int i=0; i < inputString.length()/2;i++,end--)
		{
			if(inputString.charAt(i) != inputString.charAt(end))
			{
				return false;
			}
		}
		return true;
	}
	
	public String findLongestPalindrome(String inputString)
	{
		String longestPalindrome = "";
		int palindromesCount = 0;
		List<String> allPalindromesInInput = new ArrayList<String>();
		
		for(int i=0;i<inputString.length();i++)
		{
			for(int j=inputString.length()-1; j>=0 && j!=i; j-- )
			{
				if(isPalindrome(inputString.substring(i, j+1)))
				{
					if(inputString.substring(i, j+1).length() > longestPalindrome.length())
					{
						longestPalindrome = inputString.substring(i, j+1);
					}
					allPalindromesInInput.add(inputString.substring(i, j+1));
					palindromesCount++;
				}
			}
		}
		System.out.println("All palindromes in input string: " + allPalindromesInInput);
		System.out.println("Number of palindromes found in input string: "+ palindromesCount);
		return longestPalindrome;
	}
}
