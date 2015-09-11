package org.javabrains.arrays;

import org.junit.Test;

public class LinkedListImpl {

	@Test
	public void test() {
		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = linkedList.head();
		linkedList.add(new LinkedList.Node("15"));
		linkedList.add(new LinkedList.Node("20"));
		linkedList.add(new LinkedList.Node("30"));
		linkedList.add(new LinkedList.Node("49"));
		linkedList.add(new LinkedList.Node("14"));
		linkedList.add(new LinkedList.Node("90"));

		// finding middle element of LinkedList in single pass
		LinkedList.Node current = head;
		int length = 0;
		LinkedList.Node middle = head;

		while (current.next() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next();
			}
			current = current.next();
		}

		if (length % 2 == 1) {
			middle = middle.next();
		}

		System.out.println("length of LinkedList: " + length);
		System.out.println("middle element of LinkedList : " + middle);

	}
}