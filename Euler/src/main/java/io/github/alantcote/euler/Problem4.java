package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 4. The problem statement is
 * <a href="http://projecteuler.net/problem=4">here</a>.
 * 
 * The succinct problem statement is "Find the largest palindrome made from the
 * product of two 3-digit numbers."
 * 
 * This solution is pretty much brute-force.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The verified correct result is 906609 (factors 913 and 993).
 */
public class Problem4 {

	public class Result {
		public int highPalindrome, factorA, factorB;

		public Result(int highPalindrome, int factorA, int factorB) {
			this.highPalindrome = highPalindrome;
			this.factorA = factorA;
			this.factorB = factorB;
		}
	}

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		Problem4 p4 = new Problem4();
		Result result = p4.highestPalindrome(100, 999);

		System.out.println("highPalindrome = " + result.highPalindrome);
		System.out.println("factorA = " + result.factorA);
		System.out.println("c = " + result.factorB);
	}

	/**
	 * Find the digits of an integer value.
	 * 
	 * @param val the integer value.
	 * @return an array of the digits.
	 */
	public int[] digits(int val) {
		int count = nbrDigits(val);
		int[] theDigits = new int[count];

		for (int i = count - 1; i >= 0; --i) {
			int quotient = val / 10;
			int product = quotient * 10;
			int aDigit = val - product;

			theDigits[i] = aDigit;
			val = quotient;
		}

		return theDigits;
	}

	public Result highestPalindrome(int minFactor, int maxFactor) {
		int iHigh = 0;
		int jHigh = 0;
		int pHigh = -1;

		for (int i = minFactor; i <= maxFactor; ++i) {
			for (int j = minFactor; j < maxFactor; ++j) {
				int candidate = i * j;

				if (candidate > pHigh) {
					if (isPalindrome(candidate)) {
						iHigh = i;
						jHigh = j;
						pHigh = candidate;
					}
				}
			}
		}

		Result result = new Result(pHigh, iHigh, jHigh);

		return result;
	}

	/**
	 * Ascertain whether a given value is a palindrome.
	 * 
	 * @param val the given value to be tested.
	 * @return true if and only if the value is a palindrome.
	 */
	public boolean isPalindrome(int val) {
		int[] digit = digits(val);
		boolean result = true;
		int count = digit.length;
		int limit = (count + 1) / 2;

		for (int i = 0; i < limit; ++i) {
			if (digit[i] != digit[count - 1 - i]) {
				result = false;

				break;
			}
		}

		return result;
	}

	/**
	 * Find out how many digits (base 10) are in a given number.
	 * 
	 * @param val the given number.
	 * @return the number of digits.
	 */
	public int nbrDigits(int val) {
		return 1 + (int) Math.log10(val);
	}
}
