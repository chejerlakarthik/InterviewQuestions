package org.javabrains;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PrintCurrentDate {

	@Test
	public void test() 
	{
		Date currentDate = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
		String formattedDate = formatter.format(currentDate);
		assertEquals("05 Sep 2015",formattedDate);
	}

}
