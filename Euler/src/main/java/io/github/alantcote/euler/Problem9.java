package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 9. The problem statement is
 * <a href="http://projecteuler.net/problem=9">here</a>.
 * 
 * The succinct problem statement is "There exists exactly one Pythagorean
 * triplet (a*a + b*b = c*c) for which a + b + c = 1000. Find the product abc."
 * 
 * We'll use brute force.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The desired result is 31875000 = 200 * 375 * 425.
 */
public class Problem9 {

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		for (int a = 1; a < 1000; ++a) {
			for (int b = a + 1; b < 1000; ++b) {
				int c = 1000 - a - b;

				if (c > b) {
					int sumSq = a * a + b * b;
					int cSq = c * c;

					if (sumSq == cSq) {
						int prod = a * b * c;

						System.out.println("a = " + a);
						System.out.println("b = " + b);
						System.out.println("c = " + c);
						System.out.println("prod = " + prod);
					}
				}
			}
		}
	}
}
