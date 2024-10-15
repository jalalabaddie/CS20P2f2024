package SkillBuilders;
import java.util.*;
public class NumbersSum {

	public static void main(String[] args) {
		
	
		
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user for a number
	        System.out.print("Please enter a number: ");
	        int number = scanner.nextInt();

	        int sum = 0; // Variable to store the sum of the number

	        // Display numbers from 1 to the entered number the user has inputted 
	        System.out.println("Numbers from 1 to " + number + ":");
	       
	        for (int num = 1; num <= number; num++) {
	           System.out.println(num);
	          
	           sum += num; // Add the current number to the sum
	        }

	        //Display the total sum
	        System.out.println("The sum is: " + sum);
	        
	      
	    
		

	}

}
