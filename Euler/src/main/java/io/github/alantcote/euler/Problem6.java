package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 6. The problem statement is
 * <a href="http://projecteuler.net/problem=6">here</a>.
 * 
 * The succinct problem statement is "Find the difference between the sum of the
 * squares of the first one hundred natural numbers and the square of the sum."
 * 
 * There are convenient formulas for the sum of squares of a progression and the
 * sum of terms of a progression. We use those and calculate the difference.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The verified correct result is 25164150 = 25502500 - 338350.
 */
public class Problem6 {
	/**
	 * The number of terms in each progression.
	 */
	public static final int N = 100;

	/**
	 * Calculate the sum of the first few terms of an arithmetic progression.
	 * 
	 * @param a the first term of the progression.
	 * @param d the difference between successive terms.
	 * @param n the number of terms to sum.
	 * @return the sum.
	 */
	public static int arithProgSum(int a, int d, int n) {
		int sum;

		sum = (n * ((2 * a) + (n - 1) * d)) / 2;

		return sum;
	}

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		int square = squareOfSum(N);
		int sum = sumOfSquares(N);
		int difference = square - sum;

		System.out.println("squareOfSum = " + square);
		System.out.println("sumOfSquares = " + sum);
		System.out.println("difference = " + difference);
	}

	/**
	 * Calculate the square of the sum of the first few natural numbers.
	 * @param n the number of terms.
	 * @return the square.
	 */
	public static int squareOfSum(int n) {
		int sum = arithProgSum(1, 1, n);
		int square = sum * sum;

		return square;
	}

	/**
	 * Calculate the sum of the squares of the first few natural numbers.
	 * @param n the number of terms.
	 * @return the sum.
	 */
	public static int sumOfSquares(int n) {
		int sum = n * (n + 1) * ((2 * n) + 1) / 6;

		return sum;
	}
}
