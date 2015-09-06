package org.javabrains.statictest;

public class A 
{
	static void staticMethod()
    {
        System.out.println("Static Method");
    }
	
	static int i  = 1111;
	
	static 
	{
		i = i-- - --i;
	}
	
	{
        i = i++ + ++i;
    }
	
	int methodOfA()
	{
		return (true ? null : 0);
	}
}
