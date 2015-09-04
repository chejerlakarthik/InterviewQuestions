/**
 * 
 */
package com.oracle.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Chejerla Karthik
 *
 */
public class VerticalPrinting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "MY NAME IS KARTHIK ABRA-KA-DABRA";
		int maxlength = 0;
		
		StringTokenizer tokenizer = new StringTokenizer(str);
		List<String> list = new ArrayList<String>();

		// First split the string into separate words using StringTokenizer;
		// delimiter is SPACE. Add all of them to a list.
		while (tokenizer.hasMoreTokens()) {
			list.add(tokenizer.nextToken());
		}

		// Get the length of the longest token.
		for (String st : list) {
			if (st.length() >= maxlength) {
				maxlength = st.length();
			}
		}

		// Loop thru the list and print the contents of every element in the
		// list.
		// Check if the (i+1) value is greater than the string size; to prevent
		// StringArrayIndexOutOfBounds Exception.
		// Print a SPACE in that case. otherwise print the character from the
		// string.
		// A blank line after every iteration
		for (int i = 0; i < maxlength; i++) {
			for (String st : list) {
				if ((i + 1) <= st.length()) {
					System.out.print(st.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
