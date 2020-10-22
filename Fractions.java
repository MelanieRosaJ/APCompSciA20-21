/**
 * 
 */

/**
 *Author: Melanie Rosado
 *Date: Oct 20, 2020
 *Description: 
 */
import java.lang.Math;

public class Fractions {

	private int num;
	private int den;
	
	
	public Fractions() {
		num = 1;
		den = 2;
	}
	
	public Fractions(int num1, int den1) {
		num1 = num;
		den1 = den;
		
	}
	
	public static String getFracOne() {
		String fracOne = "num / den";
		return fracOne;
		
	}
	
	public static String getFracTwo() {
		String fracTwo = "num / den";
		return fracTwo;
	}
	
	public static void addition(int num1, int den1, int num2, int den2) {
		int commonDenom = Math.multiplyExact(den1, den2);
		int firstNum = Math.multiplyExact(num1, den2);
		int secondNum = Math.multiplyExact(num2, den1);
		System.out.println("The sum of " + num1 + "/" + den1 + " and " + num2 + "/" + den2 + " is " + (firstNum + secondNum) + "/" + commonDenom + ".");
	}
	
	public static void subtraction(int num1, int den1, int num2, int den2) {
		int commonDenom = Math.multiplyExact(den1, den2);
		int firstNum = Math.multiplyExact(num1, den2);
		int secondNum = Math.multiplyExact(num2, den1);
		System.out.println("The difference of " + num1 + "/" + den1 + " and " + num2 + "/" + den2 + " is " + (Math.abs(firstNum - secondNum)) + "/" + commonDenom + ".");
	}
	
	public static void multiplication(int num1, int den1, int num2, int den2) {
		int denom = Math.multiplyExact(den1, den2);
		int numer = Math.multiplyExact(num1, num2);
		System.out.println("The product of " + num1 + "/" + den1 + " and " + num2 + "/" + den2 + " is " + numer + "/" + denom + ".");
	}
	
	public static void division(int num1, int den1, int num2, int den2) {
		int numer = Math.multiplyExact(num1, den2);
		int denom = Math.multiplyExact(den1, num2);
		System.out.println("The quotient of " + num1 + "/" + den1 + " and " + num2 + "/" + den2 + " is " + numer + "/" + denom + ".");
	}
	
	public static void reciprocal(int num1, int den1) {
		System.out.println("The reciprocal of " + num1 + "/" + den1 + " is " + den1 + "/" + num1 + ".");
	}
		
	public static void exponent(int num1, int den1, int num2, int den2) {
		double insideRootNum = Math.pow(num1, num2);
		double insideRootDen = Math.pow(den1, num2);
		System.out.println(num1 + "/" + den1 + " to the power of " + num2 + "/" + den2 + " is the " + den2 + " root of " + insideRootNum + "/" + insideRootDen + ".");
	} 
}
