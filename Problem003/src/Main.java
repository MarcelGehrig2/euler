import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Largest prime factor
		// ////////////////////
		
		/*
		 * The prime factors of 13195 are 5, 7, 13 and 29.
		 * What is the largest prime factor of the number 600851475143 ?
		 */
		
		// # of attempts:		1
		// success:				true
		// calculating time:	1223  usec
		// answer:				6857
		

		long inputNumber;
		inputNumber = 600851475143L;
		//inputNumber = 13195;
		//inputNumber = 60;
		
		
		
		// CODE
		long startTime = System.nanoTime();
		
		
		ArrayList<Long> primeNumbers = new ArrayList<Long>();
		long inputNumberCopy = inputNumber;
		
		for (long i=2L; i<= inputNumberCopy; i++) {
			if (divideable(inputNumberCopy, i)) {
				primeNumbers.add(i);
				inputNumberCopy = inputNumberCopy / i;
				i=1;
			};
		}
		
		
		long largestPrime = primeNumbers.get(primeNumbers.size()-1);
//		int fib_0 = 0;
//		int fib_1 = 1;	// init
//		int fib_2 = 0;
//		
//		int sumEvenFib = 0;
//		
//		while ((fib_1 + fib_2) < 4e6) {
//			fib_0 = fib_1 + fib_2;	// calculating new value
//			
////			System.out.print("Fibonacci number = " + fib_0);
//			
//			if ( (fib_0 % 2) == 0 )	sumEvenFib += fib_0; 
//			
//			// shifting Variables
//			fib_2 = fib_1;
//			fib_1 = fib_0;
//			
////			System.out.println();
//		};
//		
//		System.out.println();
//		System.out.println("The sum of all even Values is: " + sumEvenFib);
		
		
		
		// RESULTS
		long stopTime = System.nanoTime();

		System.out.println();
		System.out.println("The prime factors are:\t\t" + primeNumbers);
		System.out.println("The largest primefactor is:\t" + largestPrime);
		System.out.println("Calculating time:\t\t" + ((int)(stopTime-startTime)/(1000)) + " usec");
		
	}
	
	public static Boolean divideable(long divident, long divisor) {
		if (divident % divisor == 0) {
			return true;
		}
		else return false;
	}

}
