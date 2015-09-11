package org.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReversal {

	@Test
	public void test() 
	{
		String actualReversed = "kihtrak";
		
		String reversedRecursively = reverseUsingRecursion("karthik");
		assertEquals(actualReversed,reversedRecursively);
		
		String reversedIteratively = reverseUsingRecursion("karthik");
		assertEquals(actualReversed, reversedIteratively);
	}
	
	public String reverseUsingRecursion(String input)
	{
		if((input == null) || input.length() <= 1)
		{
			return input;
		}
		
		return reverseUsingRecursion(input.substring(1)) + input.charAt(0);
	}
	
	public String reverseIteratively(String input)
	{
		String reversed = "";
		
		for(int i=input.length() -1; i>=0 ; i++)
		{
			reversed += input.charAt(i);
		}
		return reversed;
	}
}
