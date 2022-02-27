package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 14. The problem statement is
 * <a href="http://projecteuler.net/problem=14">here</a>.
 * 
 * @author Al Cote'
 */
public class Problem14 {

	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		Problem14 app = new Problem14();

		app.calculate(1000000);

		// 837799, 525
		System.out
				.println("Starting term " + app.longestStartTerm + " yields a sequence of length " + app.longestLength);
		// 56991483520
		System.out.println("Largest term discovered = " + app.largestTerm);
	}

	public long largestTerm = 0;
	public long longestLength = 0;
	public long longestStartTerm = 0;

	public void calculate(long limit) {
		for (long startTerm = 1; startTerm < limit; ++startTerm) {
			long length = collatzSeqLen(startTerm);

			if (length > longestLength) {
				longestLength = length;
				longestStartTerm = startTerm;
			}
		}
	}

	public long collatzSeqLen(long startTerm) {
		long length = 1;

		for (long term = startTerm; term != 1; term = nextCollatzTerm(term)) {
			++length;

			if (term > largestTerm) {
				largestTerm = term;
			}
		}

		return length;
	}

	public long nextCollatzTerm(long term) {
		long nextTerm;

		if (term % 2 == 0) {
			nextTerm = term / 2;
		} else {
			nextTerm = 1 + term * 3;
		}

		return nextTerm;
	}
}
