/*
 Program: PrimeNumber.java          Last Date of this Revision: November 2, 2024

Purpose: An application that takes users input of a number and determines if its a prime number or not.

Author: Rasheed Allaudin, 
School: CHHS
Course: Computer science 20
 
 
 */
package Mastery;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt the user for a number
        System.out.print("Please enter a number greater than 1: ");
        int number = scanner.nextInt();

        //check if the number is prime using the isPrime() method
        boolean isPrimeNum = isPrime(number);

        //display the result.
        if (isPrimeNum) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    
    }
    //method to check if a number is prime
    public static boolean isPrime(int num) {
        
    	//a prime number is greater than 1
        if (num <= 1) {
            return false;
        }
        
        //check for factors from 2 to the square root of num
        for (int priNum = 2; priNum <= Math.sqrt(num); priNum++) {
            if (num % priNum == 0) {
            	
            	//not prime if evenly divisible.
            	return false; 
            }
        }
        //it's prime if no factors were found
        return true;
        
    }
}
/*
TestCase1:
Please enter a number greater than 1: 9
9 is not a prime number.

TestCase2:
Please enter a number greater than 1: 3
3 is a prime number.

*/