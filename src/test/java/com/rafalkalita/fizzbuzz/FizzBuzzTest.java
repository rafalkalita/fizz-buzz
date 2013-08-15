package com.rafalkalita.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void createsAValidStringForOne() {
		
		assertGenerated("1", 1);
	}
	
	@Test
	public void aValidStringForTwo() {
		
		assertGenerated("1 2", 2);
	}
	
	private void assertGenerated(String expected, int number) {
		
		assertEquals(expected, fizzBuzz.generate(number));
	}
}
