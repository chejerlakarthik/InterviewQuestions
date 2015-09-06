package org.javabrains.arrays;

import org.junit.Test;
/*
 * Remove duplicates from array. Sorts the array first & then checks for the duplicates.
 */
public class RemoveDuplicates {

	@Test
	public void test() {
		int[] numbers = new int[] { 10, 20, 30, 40, 50, 20, 40, 80 };
		int[] result = new int[10];
		
		for (int i = 0; i < numbers.length ; i++) 
		{
			for(int j = i + 1; j < numbers.length ; j++)
			{
				if (numbers[i] > numbers[j]) 
				{
					numbers[i] = numbers[i] + numbers[j];
					numbers[j] = numbers[i] - numbers[j];
					numbers[i] = numbers[i] - numbers[j];
				}
			}
			
		}
		
		int previous = 0;
		int j=0;
		
		for(int i=0; i < numbers.length; i++)
		{
				if (numbers[i] != previous)
				{
					previous = numbers[i];
					result[j++] = previous;
				}
		}
		
		for(int i=0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}

}
