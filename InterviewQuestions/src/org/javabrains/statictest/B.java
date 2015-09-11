/**
 * 
 */
package org.javabrains.statictest;

/**
 * @author Yashoda
 *
 */
public class B extends A 
{
	static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }

}
