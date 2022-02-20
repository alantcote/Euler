package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem10}.
 */
public class Problem10Test {

	/**
	 * Test method for {@link Problem10#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// This trivial method needs no test.
	}

	/**
	 * Test method for {@link Problem10#sumOfPrimesBelow(long)}.
	 */
	@Test
	public void testSumOfPrimesBelow() {
		assertEquals(17, Problem10.sumOfPrimesBelow(10));
		assertEquals(142913828922L, Problem10.sumOfPrimesBelow(Problem10.LIMIT));
	}

}
