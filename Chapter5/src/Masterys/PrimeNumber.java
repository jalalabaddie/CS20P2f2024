package Masterys;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);

        //Prompt the user for a number.
        System.out.print("Please enter a number greater than 1: ");
       
        int number = scanner.nextInt();
       
        //boolean is primitive data type that can only hold 2 possible values which is true or false.
        //Check if the number is prime.
        boolean isPrimeNum = true;

        // A prime number is greater than 1.
        if (number <= 1) {
         
        	isPrimeNum = false;
    
        } else {
            
        	// Check for factors from 2 to number - 1.
            for (int num = 2; num < number; num++) {
               
            	if (number % num == 0) {
                    isPrimeNum = false; //Not prime if evenly divisible.
                   
                    break; //No need to check further.
                }
            }
        }

        // Display the result.
        if (isPrimeNum) { 
        	System.out.println(number + " is a prime number.");
 
        } else {
        	System.out.println(number + " is not a prime number.");
        }

		
	}

}
