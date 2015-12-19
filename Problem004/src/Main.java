import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// (004) Largest palindrome product
		// ////////////////////////////////
		
		/*
		 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		 * Find the largest palindrome made from the product of two 3-digit numbers.
		 */
		
		// # of attempts:		0
		// success:				
		// calculating time:	 usec
		// answer:				
		

		// CODE
		long startTime = System.nanoTime();
		
		
//		ArrayList<Long> primeNumbers = new ArrayList<Long>();
//		long inputNumberCopy = inputNumber;
//		
//		for (long i=2L; i<= inputNumberCopy; i++) {
//			if (divideable(inputNumberCopy, i)) {
//				primeNumbers.add(i);
//				inputNumberCopy = inputNumberCopy / i;
//				i=1;
//			};
//		}
//		
//		
//		long largestPrime = primeNumbers.get(primeNumbers.size()-1);
		
		
		
		// RESULTS
		long stopTime = System.nanoTime();

		System.out.println();
//		System.out.println("The prime factors are:\t\t" + primeNumbers);
//		System.out.println("The largest primefactor is:\t" + largestPrime);
		System.out.println("Calculating time:\t\t" + ((int)(stopTime-startTime)/(1000)) + " usec");
		
	}

}
