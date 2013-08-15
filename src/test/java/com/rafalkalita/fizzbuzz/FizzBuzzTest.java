package com.rafalkalita.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void createsAValidStringForOne() {
		
		Assert.assertEquals("1", fizzBuzz.generate(1));
	}
}
