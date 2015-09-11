package org.javabrains;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void test() 
	{
		int inputNumber=19;
		int factorCount = 0;
		
		for(int i=1; i <= inputNumber; i++)
		{
			if(inputNumber%i == 0)
				factorCount++;
		}
		
		assertTrue((factorCount == 2));
	}

}
