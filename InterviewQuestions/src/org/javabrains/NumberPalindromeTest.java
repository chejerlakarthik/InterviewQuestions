package org.javabrains;

import org.junit.Test;

public class NumberPalindromeTest {

	@Test
	public void test() 
	{
		Number n = 12321;
		Number reversed = 0;
		int power = 0;
		System.out.println("Input Number : " + n.intValue());
		while(n.intValue()>0)
		{
			long i = n.intValue()%10;
			reversed =  reversed.intValue() + (i * Math.pow(10,power++));
			n = n.intValue() /10;
		}
		
		System.out.println("Reversed Number : " + reversed.intValue());
	}

}
