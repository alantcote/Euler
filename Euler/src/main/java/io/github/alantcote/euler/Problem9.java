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
	public class Result {
		public int a, b, c;

		public Result(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		Problem9 prob = new Problem9();
		Result result = prob.findTriple();
		int prod = result.a * result.b * result.c;

		System.out.println("a = " + result.a);
		System.out.println("b = " + result.b);
		System.out.println("c = " + result.c);
		System.out.println("prod = " + prod);
	}

	public Result findTriple() {
		Result result = null;
		
		for (int a = 1; a < 1000; ++a) {
			for (int b = a + 1; b < 1000; ++b) {
				int c = 1000 - a - b;

				if (c > b) {
					int sumSq = a * a + b * b;
					int cSq = c * c;

					if (sumSq == cSq) {
						result = new Result(a, b, c);
					}
				}
			}
		}
		
		return result;
	}
}
