package com.rafalkalita.fizzbuzz;

public class FizzBuzz {

	private String[] values;

	public String generate(int number) {

		values = new String[number];

		for (int i = 1; i <= number; i++) {
			values[i - 1] = generateString(i);
		}

		return printResult();
	}

	private String generateString(int i) {
		
		if(i % 3 == 0) {
			return "Fizz";
		}
		
		if(i == 5) {
			return "Buzz";
		}
		
		return i + "";
	}

	private String printResult() {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < values.length; i++) {

			result.append(values[i]);

			if (values.length - 1 != i) {
				result.append(" ");
			}
		}

		return result.toString();
	}

}
