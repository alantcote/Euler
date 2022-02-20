package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem8}.
 */
public class Problem8Test {

	/**
	 * Test method for {@link Problem8#largestProduct(java.lang.String, int)}.
	 */
	@Test
	public void testLargestProduct() {
		assertEquals(5832, Problem8.largestProduct(Problem8.THOUSAND_DIGITS, 4));
		assertEquals(2091059712, Problem8.largestProduct(Problem8.THOUSAND_DIGITS, Problem8.WINDOW_SIZE));
	}

	/**
	 * Test method for {@link Problem8#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// This trivial method needs no test.
	}

}
