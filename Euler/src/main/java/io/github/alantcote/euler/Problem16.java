package io.github.alantcote.euler;

import java.math.BigInteger;

/**
 * A solution for Project Euler Problem 16. The problem statement is
 * <a href="http://projecteuler.net/problem=16">here</a>.
 * 
 * @author Al Cote'
 */
public class Problem16 {
	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		BigInteger base = BigInteger.ONE.add(BigInteger.ONE);
		BigInteger result = base.pow(1000);
		String resultString = result.toString();
		int sum = 0;

		for (int i = 0; i < resultString.length(); ++i) {
			String digitString = resultString.substring(i, i + 1);
			int digit = Integer.parseInt(digitString);

			sum += digit;
		}

		// 10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376
		System.out.println("resultString = " + resultString);
		// 1366
		System.out.println("sum = " + sum);
	}
}
