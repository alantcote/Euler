package io.github.alantcote.euler;

import java.math.BigInteger;

/**
 * A solution for Project Euler Problem 20. The problem statement is
 * <a href="http://projecteuler.net/problem=20">here</a>.
 * 
 * @author Al Cote'
 */
public class Problem20 {
	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		BigInteger bang = BigInteger.ONE;
		BigInteger term = BigInteger.ONE;
		String bangString;
		long sum = 0;

		for (int n = 0; n < 100; ++n) {
			bang = bang.multiply(term);
			term = term.add(BigInteger.ONE);
		}

		bangString = bang.toString();
		// 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000
		System.out.println("bangString = " + bangString);

		for (int i = 0; i < bangString.length(); ++i) {
			String digitString = bangString.substring(i, i + 1);
			long digitLong = Long.parseLong(digitString);

			sum += digitLong;
		}

		// 648
		System.out.println("sum = " + sum);
	}
}
