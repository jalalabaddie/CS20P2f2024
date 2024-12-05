/*
 Program: DigitExtractor.java          Last Date of this Revision: december 4th 2024

Purpose: An application that gives an option to the user to either add a penny,nickel,dime,quarter, show total in bank, 
or take money out of bank. User exits the program by entering 0.

Author: Rasheed Allaudin, 
School: CHHS
Course: Computer Science 20
 
 */

package Masterys;

import java.util.Scanner;

import java.text.DecimalFormat;

public class MySavings {

	
		public static <piggyBank> void main(String[] args) {
			
			//links piggyBank to mySavings
			PiggyBank pb = new PiggyBank();
			
			Scanner in = new Scanner(System.in);
		     
			  DecimalFormat deca = new DecimalFormat("#.##");
		   
		        
		        int choice = 0;
		        
		        do {
		        //prompt user to enter a number to pick which type of metric conversion they want
		            System.out.println("1. Show total in bank");
		           
		            System.out.println("2. Add a penny");
		           
		            System.out.println("3. Add a nickel");
		          
		            System.out.println("4. Add a dime");
		          
		            System.out.println("5. Add a quarter");
		          
		            System.out.println("6. Take money out of your bank");
		            
		            System.out.println("Enter 0 to quit");
		           
		            System.out.print("Enter your choice: ");
		           
		            choice = in.nextInt();
		        
		            
		           
		         //switch case to handle different user choices.
		            switch (choice) {
		            
		            //Show total in bank when user picks 1.
		                case 1:
		                    System.out.println("Total in bank: $" + deca.format(pb.bankTotal()));
		                    break;
		                    
		                  //Add a penny to the bank.
		                case 2:
		              
		                	pb.penny(1);
		                    System.out.println("Added 1 penny");
		                    break;
		                    
		                  //Add a nickel when user picks 3.
		                case 3:
		                 
		                	pb.nickel(1);
		                    System.out.println("Added 1 nickel");
		                    break;
		                    
		                  //Add a dime when user picks 4.
		                case 4:
		        
		                	pb.dime(1);
		                    System.out.println("Added 1 dime");
		                    break;
		                    
		                  //Add a quarter when user picks 5.
		                case 5:
		                 
		                	pb.quarter(1);
		                    System.out.println("Added 1 quarter");
		                    break;
		                    
		                  //Take money out of piggy bank when user picks 6.
		                case 6:
		                 
		                    System.out.println("You took $" + deca.format(pb.bankTotal()) + " out of the bank" );
		                    pb.takeOut();
		                    break;
		                    
		                  //option to quit/leave the code.
		                case 0:
		                  System.out.println("Quit successful");
		                    break;

		            }
		        }
		        while ( choice != 0);
			
			
			
			
			
		            }
		            
		        }
	       
/*
 TestCase1:
 1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 5
Added 1 quarter
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 1
Total in bank: $0.25
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 
 
 TestCase2:
 
 
 */


