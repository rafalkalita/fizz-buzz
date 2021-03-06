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
		
		if(isDividableByThree(i) && isDividableByFive(i)) {
			return "FizzBuzz";
		}
		
		if(isDividableByThree(i)) {
			return "Fizz";
		}
		
		if(isDividableByFive(i)) {
			return "Buzz";
		}
		
		return i + "";
	}

	private boolean isDividableByFive(int i) {
		return i % 5 == 0;
	}

	private boolean isDividableByThree(int i) {
		return i % 3 == 0;
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
