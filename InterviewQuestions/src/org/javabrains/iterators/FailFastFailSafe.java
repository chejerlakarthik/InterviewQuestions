/**
 * 
 */
package org.javabrains.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 
 * To demonstrate ConcurrentModificationException
 * 
 * @author Yashoda
 *
 */
public class FailFastFailSafe 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		/*
		Demonstrating a fail safe iterator */
		
		ConcurrentMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		
		map.put(71,"Karthik");
		map.put(72, "Hari");
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		
		Iterator<Entry<Integer, String>> failSafeIterator = set.iterator();
		
		while(failSafeIterator.hasNext())
		{
			Entry<Integer, String> returnedValue = failSafeIterator.next();
			map.put(54,"Aarthi");
			Integer integerKey = returnedValue.getKey();
			String stringValue = returnedValue.getValue();
			System.out.println(integerKey + " " + stringValue);
		}
		
		/*
		Demonstrating a fail fast iterator */
		
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("Hello");
		listOfStrings.add("My");
		listOfStrings.add("Name");
		listOfStrings.add("is");
		listOfStrings.add("Karthik");
		
		Iterator<String> failFastIterator = listOfStrings.iterator();
		
		while(failFastIterator.hasNext())
		{
			//Comment the below line when you want to see the result of the fail safe iterator too.
			listOfStrings.remove(0);
			System.out.print(failFastIterator.next() + " ");
		}
		
		System.out.println();
		
	}

}
