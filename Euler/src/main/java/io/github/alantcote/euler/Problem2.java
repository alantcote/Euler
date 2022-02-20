/**
 * 
 */
package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 2. The problem statement is
 * <a href="http://projecteuler.net/problem=2">here</a>.
 * 
 * The succinct problem statement is "By considering the terms in the Fibonacci
 * sequence whose values do not exceed four million, find the sum of the
 * even-valued terms."
 * 
 * We are lazy, so we'll calculate the answer by brute force.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The desired result is 4613732.
 */
public class Problem2 {
	public static final int LIMIT = 4000000;

	/**
	 * The main method.
	 * 
	 * @param args unused.
	 */
	public static void main(String[] args) {
		System.out.println("sum = " + solution());
	}

	/**
	 * Calculate the solution to the posed problem.
	 * 
	 * @return the solution.
	 */
	public static int solution() {
		int sum = 2;
		int older = 1;
		int old = 2;
		int newest;

		while ((newest = older + old) <= LIMIT) {
			if ((newest % 2) == 0) {
				sum += newest;
			}

			older = old;
			old = newest;
		}

		return sum;
	}

}
