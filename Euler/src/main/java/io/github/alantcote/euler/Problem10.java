package io.github.alantcote.euler;

import io.github.alantcote.euler.utils.Primes;

/**
 * A solution for Project Euler Problem 10. The problem statement is
 * <a href="http://projecteuler.net/problem=10">here</a>.
 * 
 * The succinct problem statement is "Find the sum of all the primes below two
 * million."
 * 
 * We'll use brute force.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The verified correct result is 142913828922.
 */
public class Problem10 {
	public static long LIMIT = 2000000;

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		System.out.println("sum = " + sumOfPrimesBelow(LIMIT));
	}
	
	public static long sumOfPrimesBelow(long limit) {
		Primes primes = new Primes();
		long sum = 0;

		for (long p = Primes.FIRST_PRIME; p < limit; p = primes.nextPrime(p)) {
			sum += p;
		}
		
		return sum;
	}
}
