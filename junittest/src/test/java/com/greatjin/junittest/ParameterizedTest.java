package com.greatjin.junittest;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParameterizedTest {
	
	private double exp;
	private double v1;
	private double v2;
	
	
	@Parameters
	public static Collection<Integer[]> getTestParameters()
	{
		return Arrays.asList(new Integer[][]{
				{2,1,1}
			  , {3,2,1}
			  , {4,3,1}
				});
	}
	
	public ParameterizedTest(double exp, double v1, double v2)
	{
		this.exp = exp;
		this.v1  = v1 ;
		this.v2  = v2 ;
	}

	@Test 
	public void sum()
	{
		Calculator c = new Calculator();
		
		assertEquals(exp, c.add(v1, v2), 0);
	}
	
	
}
