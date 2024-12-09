/*
 Program: Palindrome.java          Last Date of this Revision: december 9th 2024

Purpose: An application that prompts the user to enter a phrase/string, and determines if it is a palindrome
or not.

Author: Rasheed Allaudin, 
School: CHHS
Course: Computer Science 20
 
 */
package Masterys;

import java.util.Scanner;

public class Palindrome {


	 public static void main(String[] args) {
	        //Create scanner to get user input
	        Scanner input = new Scanner(System.in);
	        
	        //Prompt user to enter a phrase
	        System.out.print("Please enter your phrase: ");
	        
	        //Get the phrase, convert it to lowercase, and remove all non-alphabetical characters
	        String phrase = input.nextLine().toLowerCase().replaceAll("[^a-z]", "");
	        
	        //Check if the phrase is a palindrome by comparing characters from both ends
	        boolean isPalindrome = true;
	      
	        for (int i = 0; i < phrase.length() / 2; i++) {
	           
	        	if (phrase.charAt(i) != phrase.charAt(phrase.length() - i - 1)) {
	               
	            	isPalindrome = false;
	              
	                break;
	            }
	        }
	        
	        //Output result
	        if (isPalindrome) {
	            
	        	System.out.println("Your phrase is a palindrome");
	       
	        } else {
	          
	        	System.out.println("Your phrase is not a palindrome");
	        }
	    }
	}

/*
TestCase1: 
Please enter your phrase: dad
Your phrase is a palindrome

TestCase2: 
Please enter your phrase: money
Your phrase is not a palindrome
*/