package io.github.alantcote.euler;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link Problem9}.
 */
public class Problem9Test {

	/**
	 * Test method for {@link Problem9#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		// This trivial method needs no test.
	}

	/**
	 * Test method for {@link Problem9#findTriple()}.
	 */
	@Test
	public void testFindTriple() {
		Problem9 fixture = new Problem9();
		Problem9.Result result = fixture.findTriple();
		
		assertEquals(200, result.a);
		assertEquals(375, result.b);
		assertEquals(425, result.c);
	}

}
