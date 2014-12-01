package com.greatjin.junittest;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd()
	{
		Calculator c = new Calculator();
		
		double r = c.add(10, 50);
		
		assertEquals(60, r, 0);
	}
}
