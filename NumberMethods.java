/**
 * 
 */
package numberMethods;


public class NumberMethods {
	
	public static boolean isPrime(int n) {
		boolean prime = true;
		
		for(int i = 2; i < n; i++) {
			if (n % i == 0 ) {
				prime = false;
			}
			
		}
		
		return prime;
	}
	
	public static int divisorSum(int n) {
		int sum = 0;
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		
		return sum;
	}
	
	public static boolean isStrong(int n) {
		boolean strong = false;
		
		if(isPrime(n) == false) {
			if(n > divisorSum(n)) {
				strong = true;
			}
			if(n < divisorSum(n)) {
				strong = false;
			}
		}
		
		return strong;
	}
	
	public static void printDivisors(int n) {
		
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void printPrimes(int n) {
		
		for(int i = 1; i < n; i++) {
			if(isPrime(i) == true) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void printComposites(int n) {
		
		for(int i = 1; i < n; i++) {
			if(isPrime(i) == false) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void printStrong(int n) {
		
		for(int i = 1; i < n; i++) {
			if(isStrong(i) == true) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void printWeak(int n) {
		
		for(int i = 1; i < n; i++) {
			if(isStrong(i) == false) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static int sum(int n) {
	
		int sum = 0;
		for(int i = 1; i < n; i++) {
			sum = sum + i;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		printDivisors(30);
	
		
		
	}

}