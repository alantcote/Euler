package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem5}.
 */
public class Problem5Test {

	/**
	 * Test method for {@link Problem5#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// Trivial method that needs no test.
	}

	/**
	 * Test method for {@link Problem5#satisfiesRange(long, long, long)}.
	 */
	@Test
	public void testSatisfiesRange() {
		assertFalse(Problem5.satisfiesRange(2519, 1, 10));
		assertTrue(Problem5.satisfiesRange(2520, 1, 10));

		assertFalse(Problem5.satisfiesRange(232792559, 1, 20));
		assertTrue(Problem5.satisfiesRange(232792560, 1, 20));
	}

	/**
	 * Test method for {@link Problem5#smallestMultiple(long, long)}.
	 */
	@Test
	public void testSmallestMultiple() {
		assertEquals(2520, Problem5.smallestMultiple(1, 10));
		assertEquals(232792560, Problem5.smallestMultiple(1, 20));
	}

}
