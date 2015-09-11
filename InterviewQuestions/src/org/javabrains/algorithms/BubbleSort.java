package org.javabrains.algorithms;

import org.junit.Test;

public class BubbleSort {

	@Test
	public void test() 
	{
		int[] numbers = new int[]{3,10,12,10,2,1,5,8};
		
		for(int i= numbers.length -1; i >=0; i--)
		{
			for(int j=1; j <= i; j++)
			{
				if(numbers[j-1] > numbers[j])
				{
					numbers[j-1] = numbers[j-1] + numbers[j];
					numbers[j] = numbers[j-1] - numbers[j];
					numbers[j-1] = numbers[j-1] - numbers[j];
				}
			}
		}
		
		for(int i=0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
