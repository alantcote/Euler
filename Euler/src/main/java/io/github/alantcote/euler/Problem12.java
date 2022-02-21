package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 12. The problem statement is
 * <a href="http://projecteuler.net/problem=11">here</a>.
 * 
 * The succinct problem statement is "What is the value of the first triangle
 * number to have over five hundred divisors?"
 * 
 * The Nth "triangle number" is the sum of the first N natural numbers. Thus, if
 * triangle number N is T then triangle number N+1 is T+N. So triangle numbers
 * are fairly easy to calculate.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The verified correct result is 76576500.
 */
public class Problem12 {
	public static int firstWithOverKDivisors(int k) {
		int n = 1; // the row index
		int triangleNumber = 1; // the nth triangle number

		while (numberOfDivisors(triangleNumber) <= k) {
			++n;
			triangleNumber += n;
		}

		return triangleNumber;
	}

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		int triangleNumber = firstWithOverKDivisors(500);

		System.out.println("triangleNumber = " + triangleNumber);
	}

	public static int numberOfDivisors(int number) {
		int nod = 0;
		int sqrt = (int) Math.sqrt(number);

		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) {
				nod += 2;
			}
		}

		// Correction if the number is a perfect square
		if (sqrt * sqrt == number) {
			nod--;
		}

		return nod;
	}
}
