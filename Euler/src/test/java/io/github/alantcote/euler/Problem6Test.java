package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem6}.
 */
public class Problem6Test {

	/**
	 * Test method for {@link Problem6#arithProgSum(int, int, int)}.
	 */
	@Test
	public void testArithProgSum() {
		assertEquals(55, Problem6.arithProgSum(1, 1, 10));
	}

	/**
	 * Test method for {@link Problem6#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// This trivial method needs no test.
	}

	/**
	 * Test method for {@link Problem6#squareOfSum(int)}.
	 */
	@Test
	public void testSquareOfSum() {
		assertEquals(3025, Problem6.squareOfSum(10));
		assertEquals(25502500, Problem6.squareOfSum(100));
	}

	/**
	 * Test method for {@link Problem6#sumOfSquares(int)}.
	 */
	@Test
	public void testSumOfSquares() {
		assertEquals(385, Problem6.sumOfSquares(10));
		assertEquals(338350, Problem6.sumOfSquares(100));
	}

}
