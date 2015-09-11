package org.javabrains.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RemoveDuplicatesUsingHashMap {

	@Test
	public void test() 
	{
		Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		int[] numbers = new int[]{1,2,3,4,4,5,6,4,5,6,8,9,10};
		int value = 0;
		
		for(int i=0; i < numbers.length; i++)
		{
			if(hashMap.containsKey(numbers[i]))
			{
				value = hashMap.get(numbers[i]).intValue();
				hashMap.put(numbers[i], ++value);
			}
			else
			{
				value=0;
				hashMap.put(numbers[i], ++value);
			}
		}
		
		System.out.println(hashMap.keySet());
		
		for(Map.Entry<Integer, Integer> entry : hashMap.entrySet())
		{
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}

}
