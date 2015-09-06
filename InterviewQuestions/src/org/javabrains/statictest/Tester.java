/**
 * 
 */
package org.javabrains.statictest;

/**
 * @author Yashoda
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*A a = null;
		
		a.staticMethod();*/
		
		
		
		/*B b = new B();
		
		System.out.println(b.i);*/
		
		// This method call will give a null pointer exception
		new A().methodOfA();
	}

}
