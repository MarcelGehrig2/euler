
public class Main {

	public static void main(String[] args) {
		// Multiples of 3 and 5
		// ////////////////////

		/*
		 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		 * Find the sum of all the multiples of 3 or 5 below 1000.
		 */

		// # of attempts:		3
		// success:				true
		// calculating time:	34  usec	(i < 1000)
		// answer:				233168


		
		// DEBUG
		int numbOfExe = 1;
		int dbg = 1;
		
		
		
		// CODE
		
		long startTime = System.nanoTime();
		
		int sum = 0;

		for (long dbgI=0; dbgI < numbOfExe; dbgI++) {
			sum = 0;

			for (int i=0; i < 1000; i++) {
//				System.out.print("i = " + i + ",   ");
				if ( (i % 3 == 0) && (i != 0) ) {
					sum += i;
//					System.out.print(",    sum3 = " + sum);
				}
				else if ( (i % 5 == 0) && (i != 0) ) {
					sum += i;
//					System.out.print(",    sum5 = " + sum);
				}
//				System.out.println();
			}
		}

		
		

		// RESULTS
		long stopTime = System.nanoTime();

		System.out.println();
		System.out.println("The answer is:\t\t" + sum);
		System.out.println("Calculating time:\t" + ((int)(stopTime-startTime)/(1000*numbOfExe)) + " usec");
	}

}
