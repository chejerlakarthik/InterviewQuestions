package org.javabrains;

import org.junit.Test;

public class GreaterBy2OrMore {

	@Test
	public void test() 
	{
		int a=17,b=15;
		
		if((a-b)>=2)
		{
			System.out.println("a is greater than b by "+ (a-b) );
		}
		else if ((b-a)>=2)
		{
			System.out.println("b is greater than a by "+ (b-a) );
		}
		else
		{
			System.out.println("Inconclusive: a="+ a + " b=" + b);
		}
	}

}
