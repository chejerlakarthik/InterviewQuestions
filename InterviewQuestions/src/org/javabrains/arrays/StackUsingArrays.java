package org.javabrains.arrays;

import org.junit.Test;

public class StackUsingArrays {

	int[] numbers = new int[10];
	
	@Test
	public void test() 
	{
		push(14);push(15);push(20);
		displayAll();
		System.out.println("Removing " + pop() + " from stack");
	}
	
	public void push(int num)
	{
		for(int i=0; i < numbers.length;i++)
		{
			if(numbers[i] == 0)
			{
				numbers[i] = num;
				break;
			}
		}
	}
	
	public int pop()
	{
		int poppedValue = 0;
		
		for(int i= numbers.length - 1; i>=0 ; i--)
		{
			if(numbers[i] != 0)
			{
				poppedValue = numbers[i];
				numbers[i] = 0;
				break;
			}
		}
		return poppedValue;
	}
	
	public void displayAll()
	{
		for(int i=0; i < numbers.length;i++)
		{
			if(numbers[i] != 0)
			{
				System.out.println(numbers[i]);
			}
		}
	}

}
