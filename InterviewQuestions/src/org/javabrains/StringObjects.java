package org.javabrains;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringObjects {

	@Test
	public void test() 
	{
		String s1 = new String("ONE");
		String s2 = "ONE";
		
		assertFalse(s1==s2);
	}

}
