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
	public static final long BASE = 2L;

	/**
	 * The maximum factor to check.
	 */
	public static final long MAX = 20L;

	/**
	 * The minimum factor to check.
	 */
	public static final long MIN = 2L;

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
//		for (long candidate = BASE; true; candidate += BASE) {
//			if (satisfiesRange(candidate, MIN, MAX)) {
//				System.out.println(candidate);
//
//				break;
//			}
//		}
		System.out.println(smallestMultiple(MIN, MAX));
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

	public static long smallestMultiple(long min, long max) {
		long result = Long.MAX_VALUE;

		for (long candidate = 1L; candidate <= Long.MAX_VALUE; ++candidate) {
			if (satisfiesRange(candidate, min, max)) {
				result = candidate;

				break;
			}
		}

		return result;
	}
}
