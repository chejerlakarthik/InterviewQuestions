/**
 * 
 */
package org.javabrains;

/**
 * @author Yashoda
 *
 */
public class Swapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a + " " + b);
		
		int[] integers = new int[]{51,42,42,53,44,55,69};
		int[] result = new int[10];
		
		for(int i=0; i < integers.length; i++)
		{
			for(int j=i+1; j< integers.length; j++)
			{
				if(integers[i] > integers[j])
				{
					integers[i] = integers[i] + integers[j];
					integers[j] = integers[i] - integers[j];
					integers[i] = integers[i] - integers[j];
				}
			}
		}
		
		int previous = integers[0];
		result[0] = previous;
		
		for(int i=1; i < integers.length; i++)
		{
				if (integers[i] != previous)
				{
					previous = integers[i];
					result[i] = previous;
				}
		}
		
		for(int i=0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}

}
