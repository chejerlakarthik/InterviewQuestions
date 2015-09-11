package org.javabrains.statictest;

public class A {
	static void staticMethod() {
		System.out.println("Static Method");
	}

	static int i = 1111;

	static {
		i = i-- - --i;
	}

	{
		i = i++ + ++i;
	}

	@SuppressWarnings({ "null", "unused" })
	int methodOfA() 
	{
		return (true ? null : 0);
	}

	/**
	 * You cannot override this method with Integer as method argument. Compiler
	 * treats
	 * <code>int</code> and <code>Integer</code> as two different types while overriding.
	 * Auto-boxing doesn't happen.
	 * 
	 * @param i
	 */
	public void methodA(int i) {
		System.out.println(i);
	}
}
