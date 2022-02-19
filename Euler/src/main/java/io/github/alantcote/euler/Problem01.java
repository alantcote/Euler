/**
 * 
 */
package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 1. The problem statement is
 * <a href="http://projecteuler.net/problem=1">here</a>.
 * 
 * The answer is the sum of the multiples of
 * 3 plus the sum of the multiples of 5 minus the sum of the multiples of 15
 * (the latter to account for terms that appear in both the progression of
 * multiples of 3 and the progression of multiples of 5). There's a simple
 * formula for the sum of an arithmetic progression, which we shall use, but it
 * depends upon the number of terms. This value is easy to calculate as the
 * integer quotient ({@link LIMIT} - 1) / (the number by which we're taking
 * multiples). 
 */
public class Problem01 {
	public static final int LIMIT = 1000;
	public static final int LIMIT_MINUS_1 = LIMIT - 1;

	/**
	 * The main method.
	 * 
	 * @param args unused.
	 */
	public static void main(String[] args) {
		int nTerms3 = LIMIT_MINUS_1 / 3;
		int nTerms5 = LIMIT_MINUS_1 / 5;
		int nTerms15 = LIMIT_MINUS_1 / 15;
		int sum3 = arithProgSum(3, 3, nTerms3);
		int sum5 = arithProgSum(5, 5, nTerms5);
		int sum15 = arithProgSum(15, 15, nTerms15);
		int sum = sum3 + sum5 - sum15;
		
		System.out.println("sum = " + sum);
	}
	
	/**
	 * Calculate the sum of the first few terms of an arithmetic progression.
	 * @param a the first term of the progression.
	 * @param d the difference between successive terms.
	 * @param n the number of terms to sum.
	 * @return the sum.
	 */
	public static int arithProgSum(int a, int d, int n) {
		int sum;
		
		sum = (n * ((2 * a) + (n - 1) * d)) / 2;
		
		return sum;
	}

}
