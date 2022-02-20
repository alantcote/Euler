package io.github.alantcote.euler;

/**
 * A solution for Project Euler Problem 8. The problem statement is
 * <a href="http://projecteuler.net/problem=8">here</a>.
 * 
 * The succinct problem statement is "Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?"
 * 
 * We'll use brute force.
 * 
 * <b>Spoiler Alert</b>
 * 
 * The desired result is 2091059712.
 */
public class Problem8 {
	public static final String THOUSAND_DIGITS = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
	public static final int WINDOW_SIZE = 13;

	/**
	 * Calculate the greatest product of a sequence of digits taken from a
	 * string of digits.
	 * @param digits the string of digits.
	 * @param window the number of digits in the sequence.
	 * @return the greatest product.
	 */
	public static int largestProduct(String digits, int window) {
		int nDigits = digits.length();
		int digit[] = new int[nDigits];
		int product;
		int largest = 1;
		
		// Start by converting the digits to integers.
		for (int i = 0; i < nDigits; ++i) {
			String digitString = digits.substring(i, i + 1);
			
			digit[i] = Integer.parseInt(digitString);
		}
		
		// The second step is to compute the largest by calculating the products.
		for (int i = 0; i < nDigits - window; ++i) {
			// calculate the product
			
			product = 1;
			
			for (int j = 0; j < window; ++j) {
				product *= digit[i + j];
			}
			
			// remember the product if it is the new largest.
			if (product > largest) {
				largest = product;
			}
		}
		
		// The third and final step is to return the largest product.
		return largest;
	}
	
	/**
	 * @param args unused.
	 */
	public static void main(String[] args) {
		int bigProd = largestProduct(THOUSAND_DIGITS, WINDOW_SIZE);

		System.out.println("greatest product = " + bigProd);
	}
}
