package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 1. The problem statement is
 * <a href="http://projecteuler.net/problem=1">here</a>.
 * 
 * The succinct problem statement is "Find the sum of all the multiples of 3 or
 * 5 below 1000."
 * 
 * The answer is the sum of the multiples of 3 plus the sum of the multiples of
 * 5 minus the sum of the multiples of 15 (the latter to account for terms that
 * appear in both the progression of multiples of 3 and the progression of
 * multiples of 5).
 * 
 * There's a simple formula for the sum of an arithmetic progression, which we
 * shall use, but it depends upon the number of terms. This value is easy to
 * calculate as the integer quotient ({@link #LIMIT} - 1) / (the number by which
 * we're taking multiples).
 * 
 * <b>Spoiler Alert</b>
 * 
 * The desired result is 233168.
 */
public class Problem1 {
	public static final int LIMIT = 1000;

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
	 * The main method.
	 * 
	 * @param args unused.
	 */
	public static void main(String[] args) {
		System.out.println("sum = " + solution(LIMIT));
	}

	/**
	 * Calculate the solution to the posed problem.
	 * 
	 * @param limit all terms of the progressions must be less than this.
	 * @return the solution.
	 */
	public static int solution(int limit) {
		int limitMinus1 = limit - 1;

		int nTerms3 = limitMinus1 / 3;
		int sum3 = arithProgSum(3, 3, nTerms3);

		int nTerms5 = limitMinus1 / 5;
		int sum5 = arithProgSum(5, 5, nTerms5);

		int nTerms15 = limitMinus1 / 15;
		int sum15 = arithProgSum(15, 15, nTerms15);

		int sum = sum3 + sum5 - sum15;

		return sum;
	}

}
