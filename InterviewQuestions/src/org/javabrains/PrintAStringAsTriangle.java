package org.javabrains;

import org.junit.Test;

public class PrintAStringAsTriangle {

	@Test
	public void test() 
	{
		char[] input="JAVAJ2EE".toCharArray();
		
		for(int i=0; i < input.length; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(input[j]+ " ");
			}
			System.out.println();
		}
	}

}
