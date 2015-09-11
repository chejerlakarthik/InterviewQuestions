package org.javabrains.algorithms;

import org.junit.Test;

public class BucketSort {

	@Test
	public void test() 
	{
		int[] numbers = new int[]{3,10,12,10,2,1,5,8};
		
		int[] largeArray = new int[13];
		int[] count = new int[13];
		
		for(int i=0; i < numbers.length; i++)
		{
			largeArray[numbers[i]] = numbers[i];
			count[numbers[i]]++;
		}
	}

}
