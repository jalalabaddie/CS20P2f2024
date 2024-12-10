/*
 Program: EvensAndOdds.java          Last Date of this Revision: december 9th 2024


Purpose: An application that promts a list of odd numbers and a list of even numbers friom the range of numbers 0-99.

Author: Rasheed Allaudin, 
School: CHHS
Course: Computer Science 20
 
 */
package Masterys;

public class EvensAndOdds {


	 public static void main(String[] args) {
	        
	        //Generate 25 random numbers between 0 and 99
	        int[] numbers = generateRandomNumbers(25, 0, 99);
	        
	        //Print all odd numbers
	        System.out.println("ODD Numbers:");
	      
	        printNumbers(numbers, false);  //false flag indicates printing odd numbers
	        
	        //Print a new line before displaying even numbers
	        System.out.println("\nEVEN Numbers:");
	        
	        //Print all even numbers
	        printNumbers(numbers, true);   //true flag indicates printing even numbers
	    }

	    //Method to generate an array of random numbers
	    public static int[] generateRandomNumbers(int size, int min, int max) {
	        
	        // Create an array to hold the random numbers
	        int[] numbers = new int[size];
	        
	        //Calculate the range of random numbers
	        int range = max - min + 1;
	        
	        // Loop to populate the array with random numbers in the given range
	        for (int i = 0; i < size; i++) {
	          
	        	//Assign a random number between min and max to each element
	            numbers[i] = (int) (Math.random() * range) + min;
	        }
	        
	        //Return the populated array
	        return numbers;
	    }

	    //Method to print either even or odd numbers based on the flag
	    public static void printNumbers(int[] numbers, boolean printEven) {
	        
	        //Loop through each number in the array
	        for (int num : numbers) {
	            
	            //If printEven is true, print only even numbers
	            if (printEven && num % 2 == 0) {
	                
	            	System.out.print(num + " ");
	            
	            //If printEven is false, print only odd numbers
	            } else if (!printEven && num % 2 != 0) {
	               
	            	System.out.print(num + " ");
	            }
	        }
	    }
	}

/*
TestCase1: 
ODD Numbers:
9 59 45 95 73 71 7 31 93 19 47 67 49 29 9 
EVEN Numbers:
72 38 48 40 98 26 66 94 66 32 

TestCase2:
ODD Numbers:
97 71 59 41 25 55 43 91 33 3 11 25 71 
EVEN Numbers:
26 12 90 46 12 48 38 30 78 72 94 88 
*/