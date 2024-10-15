package SkillBuilders;

import java.util.*;

public class DeliverySB {
   
	public static void main(String[] args) {
       
		Scanner userInput = new Scanner(System.in);
       
        
        // Prompt the user for the dimensions of the package
		System.out.print("Enter the length of the package: ");
       
		double length = userInput.nextDouble(); // Changed to nextDouble for accurate input
        
       
		System.out.print("Enter the width of the package: ");
        
		double width = userInput.nextDouble(); // Changed to nextDouble for more accurate input
        
        
		System.out.print("Enter the height of the package: ");
       
		double height = userInput.nextDouble(); // Changed to nextDouble for more accurate input
        
        // Check dimensions so they meet the criteria
        if (length > 10 || width > 10 || height > 10) {
           System.out.println("Reject: Package dimensions are too large.");
        
        } else {
         
        	System.out.println("Accept: Package dimensions are within limits.");
        }
        
       
    }
}






