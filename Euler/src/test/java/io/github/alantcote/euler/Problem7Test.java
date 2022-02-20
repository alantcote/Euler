package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem7}.
 */
public class Problem7Test {

	/**
	 * Test method for {@link Problem7#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// This trivial method needs no test.
	}

	/**
	 * Test method for {@link Problem7#nthPrime(int)}.
	 */
	@Test
	public void testNthPrime() {
		assertEquals(13, Problem7.nthPrime(6));
		assertEquals(104743, Problem7.nthPrime(Problem7.NBR_PRIMES));
	}

}
