/**
 * 
 */
package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem1}.
 */
public class Problem1Test {

	/**
	 * Test method for {@link Problem1#arithProgSum(int, int, int)}.
	 */
	@Test
	public void testArithProgSum() {
		assertEquals(Problem1.arithProgSum(3, 3, 3), 18);
		assertEquals(Problem1.arithProgSum(5, 5, 1), 5);
	}

	/**
	 * Test method for {@link Problem1#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// Trivial method needs no test.
	}

	/**
	 * Test method for {@link Problem1#solution(int)}.
	 */
	@Test
	public void testSolution() {
		assertEquals(Problem1.solution(10), 23);
		assertEquals(Problem1.solution(Problem1.LIMIT), 233168);
	}

}
