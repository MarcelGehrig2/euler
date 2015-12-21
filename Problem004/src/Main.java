import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// (004) Largest palindrome product
		// ////////////////////////////////
		
		/*
		 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
		 * Find the largest palindrome made from the product of two 3-digit numbers.
		 */
		
		// # of attempts:		3
		// success:				true
		// calculating time A:	11211 usec
		// answer:				906609
		

		// CODE
		long startTime = System.nanoTime();
		
		
		int largestFactor = 999;
		int largestPalindrom = 0;
//		Boolean largestPalindromIsFound = false;
		int n1=0;
		int n2=0;
		
		for (n1=largestFactor; n1>=0; n1--) {
			for (n2=largestFactor; n2>=n1; n2--) {
				
//				System.out.println("n1: " + n1);
//				System.out.println("n2: " + n2);
				
				int product = n1*n2;
				if (isPalindrome(product)) {
//					largestPalindromIsFound = true;
					if (largestPalindrom < product) largestPalindrom = product;
//					break;
				}
			}
//			if (largestPalindromIsFound) break;
		}
		
		
		
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
		System.out.println("The largest palindrome is:\t" + largestPalindrom);
		System.out.println("Factor 1:\t\t\t" + n1);
		System.out.println("Factor 2:\t\t\t" + n2);
		System.out.println("Calculating time:\t\t" + ((int)(stopTime-startTime)/(1000)) + " usec");
		
	}

	
	public static Boolean isPalindrome(int n) {
		int nCopy = n;
		Boolean isPalindrome = true;
		
//		if ((n>=100000) && (n<=999999)) {
			if (n/100000 != n%10) {
				isPalindrome = false;
			}
			n = (n%100000)/10;		// cuts first and last digit
			
//			System.out.println("First cut: " + n);
//		}
		
//		if ((n>=100) && (n<=9999)) {
			if (n/1000 != n%10) {
				isPalindrome = false;
			}
			n = (n%1000)/10;		// cuts first and last digit

//			System.out.println("Second cut: " + n);
//		}
		
//		if ((n>=1) && (n<=99)) {
			if (n/10 != n%10) {
				isPalindrome = false;
			}
//		}
		
//		System.out.println("is palindrome: " + nCopy + "   " + isPalindrome);
		return isPalindrome;
	}

	
	public static Boolean isPalindromeB(int n) {
		int nCopy = n;
		Boolean isPalindrome = true;
		String strN = Integer.toString(n);
		
		if (strN.charAt(0) != strN.charAt(strN.length()-1)) {
			isPalindrome = false;
		}
		
		strN = strN.substring(1, strN.length()-1);
		System.out.println("First cut: " + strN);
		
		if (strN.charAt(0) != strN.charAt(strN.length()-1)) {
			isPalindrome = false;
		}
		
		strN = strN.substring(1, strN.length()-1);
		System.out.println("Second cut: " + strN);
		
		if (strN.charAt(0) != strN.charAt(strN.length()-1)) {
			isPalindrome = false;
		}
		
		
		System.out.println("is palindrome: " + nCopy + "   " + isPalindrome);
		return isPalindrome;
	}
}
