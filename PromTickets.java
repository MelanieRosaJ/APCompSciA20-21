/**
 * 
 */
package promTickets;

import java.util.Scanner;

/**
 *Author: Melanie Rosado
 *Date: Dec 31, 2020
 *Description: 
 */
public class PromTickets {
	static double ticketPrice;
	static String name;
	static String grade;
	static String groupSize;
	

	static Scanner keyboard = new Scanner(System.in);
	
	public static void getPromTicket() {
		
		System.out.println("What is your name (first and last)?");
		name = keyboard.nextLine();
		
		System.out.println("Are you a freshman, sophomore, junior or senior?");
		grade = keyboard.nextLine();
		
		System.out.println("Are you attending solo, as part of a couple, or with a group (3 or 4)?");
		groupSize = keyboard.nextLine();
	
	
	
		
		if (grade.equals("Freshman") || grade.equals("freshman")) {
			if (groupSize.equals("Solo") || groupSize.equals("solo")) {
				ticketPrice = 65.00;
			}
			else if (groupSize.equals("Couple") || groupSize.equals("couple")) {
				ticketPrice = 98.00;
			}
			else if (groupSize.equals("Group") || groupSize.equals("group")){
				ticketPrice = 163.00;
			}
		}
		
		if (grade.equals("Sophomore") || grade.equals("sophomore")) {
			if (groupSize.equals("Solo") || groupSize.equals("solo")) {
				ticketPrice = 55.00;
			}
			else if (groupSize.equals("Couple") || groupSize.equals("couple")) {
				ticketPrice = 83.00;
			}
			else if (groupSize.equals("Group") || groupSize.equals("group")){
				ticketPrice = 138.00;
			}
		}
		
		if (grade.equals("Junior") || grade.equals("junior")) {
			if (groupSize.equals("Solo") || groupSize.equals("solo")) {
				ticketPrice = 45.00;
			}
			else if (groupSize.equals("Couple") || groupSize.equals("couple")) {
				ticketPrice = 68.00;
			}
			else if (groupSize.equals("Group") || groupSize.equals("group")) {
				ticketPrice = 113.00;
			}
		}
		if (grade.equals("Senior") || grade.equals("senior")) {
			if (groupSize.equals("Solo") || groupSize.equals("solo")) {
				ticketPrice = 40.00;
			}
			else if (groupSize.equals("Couple") || groupSize.equals("couple")) {
				ticketPrice = 60.00;
			}
			else if (groupSize.equals("Group") || groupSize.equals("group")) {
				ticketPrice = 100.00;
			}
		}
		int count = 0;
		int rand = 0;
		String confirmationNumber = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		while(count < 6) {
			rand = (int) (Math.random() * characters.length());
			confirmationNumber += characters.substring(rand, rand +1);
			
			count ++; //count = 1
		}
	
	
		System.out.println(name + " purchased a " + grade + " " + groupSize + " ticket for $" + ticketPrice + "0. The confirmation number for this sale is " + confirmationNumber + ".");
	
	}	


public static void main(String[] args) {
	getPromTicket();
	
}
}
