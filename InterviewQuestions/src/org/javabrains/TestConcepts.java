/**
 * 
 */
package org.javabrains;

/**
 * @author Yashoda
 *
 */
public class TestConcepts {
	/**
	 * Integer class caches the frequently used values from -128 to 127 and
	 * serves them from the cache if initialized as shown below. If the value is
	 * outside this range, creates a new Integer Object using auto-boxing
	 * mechanism.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1 = 127;

		Integer i2 = 127;

		System.out.println(i1 == i2);

		Integer i3 = 128;

		Integer i4 = 128;

		System.out.println(i3 == i4);

	}

}
