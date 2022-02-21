package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem12}.
 */
public class Problem12Test {

	/**
	 * Test method for {@link Problem12#firstWithOverKDivisors(int)}.
	 */
	@Test
	public void testFirstWithOverKDivisors() {
		assertEquals(28, Problem12.firstWithOverKDivisors(5));
		assertEquals(76576500, Problem12.firstWithOverKDivisors(500));
	}

	/**
	 * Test method for {@link Problem12#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// This trivial method needs no unit test.
	}

	/**
	 * Test method for {@link Problem12#numberOfDivisors(int)}.
	 */
	@Test
	public void testNumberOfDivisors() {
		assertEquals(6, Problem12.numberOfDivisors(28));
		assertEquals(576, Problem12.numberOfDivisors(76576500));
	}

}
