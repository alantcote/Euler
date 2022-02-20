package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem4}.
 */
public class Problem4Test {

	/**
	 * Test method for {@link Problem4#digits(int)}.
	 */
	@Test
	public void testDigits() {
		Problem4 fixture = new Problem4();
		int[] result = fixture.digits(12);
		
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
	}

	/**
	 * Test method for {@link Problem4#highestPalindrome(int, int)}.
	 */
	@Test
	public void testHighestPalindrome() {
		Problem4 fixture = new Problem4();
		Problem4.Result result;
		
		result = fixture.highestPalindrome(10, 99);
		
		assertEquals(result.highPalindrome, 9009);
		assertEquals(result.factorA, 99);
		assertEquals(result.factorB, 91);
		
		result = fixture.highestPalindrome(100, 999);
		
		assertEquals(result.highPalindrome, 906609);
		assertEquals(result.factorA, 913);
		assertEquals(result.factorB, 993);
	}

	/**
	 * Test method for {@link Problem4#isPalindrome(int)}.
	 */
	@Test
	public void testIsPalindrome() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Problem4#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// Trivial method needs no test.
	}

	/**
	 * Test method for {@link Problem4#nbrDigits(int)}.
	 */
	@Test
	public void testNbrDigits() {
		fail("Not yet implemented");
	}

}
