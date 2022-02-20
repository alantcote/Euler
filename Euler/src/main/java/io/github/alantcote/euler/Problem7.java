package io.github.alantcote.euler;

import io.github.alantcote.euler.utils.Primes;

/**
 * A solution for Project Euler Problem 7. The problem statement is
 * <a href="http://projecteuler.net/problem=7">here</a>.
 * 
 * The succinct problem statement is "What is the 10 001st prime number?"
 * 
 * We happen to have an existing class that calculates prime numbers. We'll use
 * it.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The desired result is 104743.
 */
public class Problem7 {
	/**
	 * The number of primes to consider.
	 */
	public static int NBR_PRIMES = 10001;

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		System.out.println("prime " + NBR_PRIMES + " = " + nthPrime(NBR_PRIMES));
	}

	public static long nthPrime(int n) {
		/**
		 * A prime number calculator. See {@link Primes}.
		 */
		Primes primes = new Primes();
		int count = 1;
		long candidate = 2;
		long lastPrime = 0;

		while (count < n) {
			lastPrime = candidate;
			candidate = primes.nextPrime(lastPrime);
			++count;
		}

		return candidate;
	}
}
