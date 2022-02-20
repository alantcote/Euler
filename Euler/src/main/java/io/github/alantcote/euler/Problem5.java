package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 5. The problem statement is
 * <a href="http://projecteuler.net/problem=5">here</a>.
 * 
 * The succinct problem statement is "What is the smallest positive number that
 * is evenly divisible by all of the numbers from 1 to 20?"
 * 
 * This solution is pretty much brute-force.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The desired result is 232792560.
 */
public class Problem5 {
	/**
	 * The minimum candidate. This must be a factor of any solution.
	 */
	public static final long BASE = 2520L;

	/**
	 * The maximum factor.
	 */
	public static final long MAX = 20L;

	/**
	 * The minimum factor to check. By checking only multiples of BASE, we avoid
	 * needing to check 2-10.
	 */
	public static final long MIN = 11L;

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		for (long candidate = BASE; true; candidate += BASE) {
			if (satisfiesRange(candidate, MIN, MAX)) {
				System.out.println(candidate);

				break;
			}
		}
	}

	/**
	 * Determine whether a given number is evenly divisible by all the numbers in a
	 * given range.
	 * 
	 * @param candidate the given number.
	 * @param min       the range minimum.
	 * @param max       the range maximum.
	 * @return <code>true</code> iff the criteria are met.
	 */
	public static boolean satisfiesRange(long candidate, long min, long max) {
		for (long i = min; i <= max; ++i) {
			if (candidate % i != 0) {
				return false;
			}
		}

		return true;
	}
}
