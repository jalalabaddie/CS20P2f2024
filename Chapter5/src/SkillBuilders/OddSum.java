package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {

		
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user for a number
	        System.out.print("Please enter a number: ");
	       
	        int number = scanner.nextInt();

	        int sum = 0; // Variable to store the sum of odd numbers

	        // Loop through numbers from 1 to the entered number
	        for (int oddNum = 1; oddNum <= number; oddNum++)
	        {
	           
	        	// Check if the number is odd
	            if (oddNum % 2 != 0) {
	                
	            	sum += oddNum; // Add the odd number to the sum
	            }
	        }

	        // Display the sum/total of the odd numbers
	        System.out.println("The sum of odd numbers from 1 to " + number + " is: " + sum);

	    
		
	
	}

}
