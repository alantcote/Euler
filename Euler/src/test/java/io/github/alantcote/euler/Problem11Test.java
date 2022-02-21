package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem11}.
 */
public class Problem11Test {

	/**
	 * Test method for {@link Problem11#largeEast()}.
	 */
	@Test
	public void testLargeEast() {
		assertEquals(48477312, Problem11.largeEast());
	}

	/**
	 * Test method for {@link Problem11#largeSouth()}.
	 */
	@Test
	public void testLargeSouth() {
		assertEquals(51267216, Problem11.largeSouth());
	}

	/**
	 * Test method for {@link Problem11#largeSouthEast()}.
	 */
	@Test
	public void testLargeSouthEast() {
		assertEquals(40304286, Problem11.largeSouthEast());
	}

	/**
	 * Test method for {@link Problem11#largeSouthWest()}.
	 */
	@Test
	public void testLargeSouthWest() {
		assertEquals(70600674, Problem11.largeSouthWest());
	}

	/**
	 * Test method for {@link Problem11#largestProduct()}.
	 */
	@Test
	public void testLargestProduct() {
		assertEquals(70600674, Problem11.largestProduct());
	}

	/**
	 * Test method for {@link Problem11#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// This trivial method needs no unit test.
	}

	/**
	 * Test method for {@link Problem11#Problem11()}.
	 */
	@Test
	public void testProblem11() {
		assertNotNull(new Problem11());
	}

}
