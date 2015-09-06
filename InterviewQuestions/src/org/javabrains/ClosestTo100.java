package org.javabrains;

import org.junit.Test;

public class ClosestTo100 {

	@Test
	public void test() 
	{
		int a = 99,b = 102;
		
		if( Math.abs(100 - a) < Math.abs(100 - b))
		{
			System.out.println("a: " + a);
		}
		else
		{
			System.out.println("b: " + b);
		}
	}

}
