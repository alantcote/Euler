package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem2}.
 */
public class Problem2Test {

	/**
	 * Test method for {@link Problem2#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// Trivial method needs no test.
	}

	/**
	 * Test method for {@link Problem2#solution(int)}.
	 */
	@Test
	public void testSolution() {
		assertEquals(Problem2.solution(10), 10);
		assertEquals(Problem2.solution(Problem2.LIMIT), 4613732);
	}

}
