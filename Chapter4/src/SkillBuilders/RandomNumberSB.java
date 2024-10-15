package SkillBuilders;

import java.util.*;

public class RandomNumberSB {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Prompt the user for minimum and maximum values
        System.out.print("Enter the minimum value: ");
        
        int min = userInput.nextInt();
        
        System.out.print("Enter the maximum value: ");
       
        int max = userInput.nextInt();
        
        // Check if the minimum value is less than the maximum value
        if (min > max) {
        
        	System.out.println("Invalid: minimum has to be less then the maximum number");
        } else {
           
        	// Generate a a random integer in bewtween the 2 numbers
         
        	Random random = new Random();
            int randomNum = random.nextInt((max - min) + 1) + min;
            
            // Display the random number
            System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
        }
        
     
    }
}




