package org.javabrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.junit.Test;

public class StringExercises {

	@Test
	public void test() 
	{
		String input="Super man Bat Man Milk Man Super Star";
		int count = 0;
		final int ONE = 1;
		int tokenCount = 1;
		
		StringTokenizer tokenizer = new StringTokenizer(input);
		List<String> tokens = new ArrayList<String>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		// No. of words in a string
		System.out.println(tokenizer.countTokens());
		
		while(tokenizer.hasMoreTokens())
		{
			tokens.add(tokenizer.nextToken());
		}
		
		// To get the occurrences of each word in a string and its count
		for(String str : tokens)
		{
			String key = str.toLowerCase();
			if(map.containsKey(key))
			{
				count = (Integer) map.get(key);
				map.put(key, ++count);
			}
			else
			{
				map.put(key, ONE);
			}
		}
		
		System.out.println(map);
		
		
		
		// No. of words in a string - Another way
		for (int i = 0; i < input.length(); i++) 
		{
			if (input.charAt(i) == ' ' || input.charAt(i) == '\n') 
			{
				tokenCount++;
			}
		}

		System.out.println(tokenCount);

		// No. of words in a string - third way
		String[] words = input.trim().split(" ");
		System.out.println(words.length);
		
		
		// Number of character occurences in a string
		char ch = 'k';
		String str = "karthik";
		
		int charCount = str.length() - str.replace(String.valueOf(ch), "").length();
		System.out.println("Char Count: " + charCount);
		
		// Remove all white spaces from a string
		System.out.println(input.replaceAll(" ", ""));
	}
}
