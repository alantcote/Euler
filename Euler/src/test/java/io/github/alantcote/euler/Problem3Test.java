package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem3}.
 */
public class Problem3Test {

	/**
	 * Test method for {@link Problem3#largestPrimeFactor(long)}.
	 */
	@Test
	public void testLargestPrimeFactor() {
		assertEquals(Problem3.largestPrimeFactor(13195), 29);
		assertEquals(Problem3.largestPrimeFactor(Problem3.COMPOSITE), 6857);
	}

	/**
	 * Test method for {@link Problem3#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// Trivial method needs no test.
	}

}
