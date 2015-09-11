package org.javabrains.algorithms;

import java.util.Arrays;

import org.junit.Test;

public class BinarySearch {

	@Test
	public void test() 
	{
		int[] numbers = new int[]{3,10,12,10,2,1,5,8};
		
		Arrays.sort(numbers);
		
		for(int i=0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		
		int searchElement = 8;
		int found = binarySearch(numbers, searchElement);
		
		if(found==-1)
			System.out.println("Element not found");
		else
			System.out.println("Found @ "+ found + " position");
		
		
	}
	
	public int binarySearch(int[] numbers, int searchElement)
	{
		int first=0, last=numbers.length-1;
		int middle = 0;
		int returnValue=-1;
		
		while(first<=last)
		{
			middle =(first+last)/2;
			
			if(searchElement == numbers[middle])
			{
				returnValue=middle;
				break;
			}
			else if (searchElement < numbers[middle])
			{
				last = middle -1;
			}
			else
			{
				first = middle +1;
			}
		}
		
		return returnValue;
	}

}
