package Masterys;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {

		
		
		  // Create a Scanner object for user input
	      Scanner userInput = new Scanner(System.in);
	       
	      // Prompt the user for their first and last name
	       System.out.print("Please Enter Your First Name: ");
	      
	       String firstName = userInput.nextLine();
	       
	       System.out.print("Please Enter your last name: ");
	       
	       String lastName = userInput.nextLine();
	      
	       // Get the first letter of the last name and convert it to uppercase
	       char firstLet = Character.toUpperCase(lastName.charAt(0));
	      
	       // Determine the group assignment based on the first letter of the last name
	       String group;
	      
	       if (firstLet >= 'A' && firstLet <= 'I') {
	    	   group = "Group 1";
	     
	       } else if (firstLet >= 'J' && firstLet <= 'S') {
	           group = "Group 2";
	      
	       } else if (firstLet >= 'T' && firstLet <= 'Z') {
	           group = "Group 3";
	       
	       } else {
	           group = "Unknown Group"; // Edge case handling
	       }
	      
	       // Display the name and the group they are assigned to
	       System.out.println(firstName + " " + lastName + " is assigned to " + group + ".");
	     
	   }
	

	}

