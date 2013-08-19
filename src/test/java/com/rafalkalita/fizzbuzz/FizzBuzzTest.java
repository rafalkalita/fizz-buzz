package com.rafalkalita.fizzbuzz;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void aValidStringForThree() {

		assertGenerated("1 2 Fizz", 3);
	}

	@Test
	public void aValidStringForFive() {

		assertGenerated("1 2 Fizz 4 Buzz", 5);
	}

	@Test
	public void aValidStringForSix() {

		assertGenerated("1 2 Fizz 4 Buzz Fizz", 6);
	}

	@Test
	public void aValidStringForTen() {

		assertGenerated("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz", 10);
	}

	private void assertGenerated(String expected, int number) {

		assertEquals(expected, fizzBuzz.generate(number));
	}
}
