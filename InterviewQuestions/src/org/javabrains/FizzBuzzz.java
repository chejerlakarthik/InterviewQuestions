package org.javabrains;

import org.junit.Test;

public class FizzBuzzz {

	@Test
	public void FizzBuzzPrinting() 
	{
		for(int number=1;number <100;number++)
		{
			if(number % 15 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if(number % 3 == 0)
			{
				System.out.println("Fizz");
			}
			else if(number % 5 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(number);
			}
				
		}
		
	}

}
