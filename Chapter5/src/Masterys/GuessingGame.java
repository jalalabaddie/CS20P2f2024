package Masterys;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		

		 Scanner input = new Scanner(System.in);
	        Random rand = new Random();
	        
	        //Generate a random secret number between 1 and 20
	        int secretNumber = rand.nextInt(20) + 1;
	        int guess = 0;
	        
	        // Continue until the user guesses the correct number
	        while (guess != secretNumber) {
	        	System.out.print("Guess a number between 1 and 20: ");
	           
	            guess = input.nextInt();
	            
	            // Check if the guess is correct and respond accordingly
	            if (guess == secretNumber) {
	                System.out.println("Correct! Good Job.");
	            } else {
	                System.out.println("Wrong, try again!");
	            }
	        }
	      
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
