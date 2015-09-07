package org.javabrains;

import static org.junit.Assert.assertEquals;
import static java.util.Arrays.sort;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void test() 
	{
		String first = "silent";
		String second = "Listen";
		
		assertEquals(first.length(), second.length());
		
		char[] firstArray = first.toLowerCase().toCharArray();
		char[] secondArray = second.toLowerCase().toCharArray();
		
		sort(firstArray);sort(secondArray);
		
		boolean equals = false;
		
		for(int i=0; i< firstArray.length; i++)
		{
			if(firstArray[i] == secondArray[i])
			{
				equals = true;
			}
			else
			{
				equals = false;
			}
		}
		
		if(equals)
		{
			System.out.println("Anagram Strings");
		}
		
	}
}
