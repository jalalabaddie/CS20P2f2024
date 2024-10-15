package SkillBuilders;

import java.util.*;

public class PerfectSquareSB {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = userInput.nextInt();
        
        // Calculate the square root and convert it to an integer
       
        int squareRoot = (int) Math.sqrt(number); // Shorten the square root
        
        // Check if the squared value of the shortened root equals the original number
        
        if (number >= 0 && squareRoot * squareRoot == number) {
           
        	System.out.println(number + " is a perfect square.");
       
        } else {
          
        	System.out.println(number + " is not a perfect square.");
        }
        
    
    }
}
