package com.rafalkalita.fizzbuzz;

public class FizzBuzz {

	private String[] values;

	public String generate(int number) {

		values = new String[number];

		for (int i = 1; i <= number; i++) {
			values[i - 1] = i + "";
		}

		return printResult();
	}

	private String printResult() {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			
			result.append(values[i]);

			if (values.length-1 != i) {
				result.append(" ");
			}
		}

		return result.toString();
	}

}
