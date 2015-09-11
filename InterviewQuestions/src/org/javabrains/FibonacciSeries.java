package org.javabrains;

import org.junit.Test;

public class FibonacciSeries {

	@Test
	public void test() {
		for(int i=1; i<=10; i++){
            System.out.print(fibonacci(i) +" ");
        }
	}

	public int fibonacci(int number) {
		if(number == 1)
		{
            return 0;
        }
		else if (number == 2)
		{
			return 1;
		}
        return fibonacci(number-1) + fibonacci(number -2);
	}

}
