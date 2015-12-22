
public class Main {

	public static void main(String[] args) {
		// (005) Smallest multiple
		// ///////////////////////
		
		/*
		 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
		 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
		 */
		
		// # of attempts:		1
		// success:				true
		// calculating time:	188'156 usec
		// answer:				232792560
		

		// CODE
		long startTime = System.nanoTime();
		
		int largestDivident = 10;
		largestDivident = 20;
		int product = 1;
		
		for (product=largestDivident; product<=Integer.MAX_VALUE; product=product+largestDivident) {
			if (divideable(product, largestDivident)) break;
		}

		
		// RESULTS
		long stopTime = System.nanoTime();

		System.out.println();
		System.out.println("The largest palindrome is:\t" + product);
		System.out.println("Calculating time:\t\t" + ((int)(stopTime-startTime)/(1000)) + " usec");
	
	}

	public static Boolean divideable(int n, int largestDivident) {
		Boolean R = true;
		
//		System.out.println(n);
		
		for (int i=1; i<=largestDivident; i++) {
			if (n%i != 0) {
				R = false;
				break;
			}
		}
		
		return R;
	}
}
