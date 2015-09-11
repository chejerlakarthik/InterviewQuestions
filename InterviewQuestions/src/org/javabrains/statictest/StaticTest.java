/**
 * 
 */
package org.javabrains.statictest;

/**
 * @author Yashoda
 *
 */
public class StaticTest {
	static int methodOne(int i) {
		return methodTwo(i *= 11);
	}

	static int methodTwo(int i) {
		return methodThree(i /= 11);
	}

	static int methodThree(int i) {
		return methodFour(i -= 11);
	}

	static int methodFour(int i) {
		return i += 11;
	}

	public static void main(String[] args) {
		System.out.println(methodOne(11));

		// Another question - minus * minus will turn into a plus. 
		// Hence add all.
		int i = 10 + +11 - -12 + +13 - -14 + +15;

		System.out.println(i);
	}
}
