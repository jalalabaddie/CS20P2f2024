/*
 Program: DigitExtractor.java          Last Date of this Revision: december 4th 2024

Purpose: An application that gives an option to the user to show the ones place number, tens place number,
hundreds place number, it loops until the user enters the quit option.

Author: Rasheed Allaudin, 
School: CHHS
Course: Computer Science 20
 
 */

package Masterys;
import java.util.Scanner;

public class DigitExtractor {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        
        //Create a Num object
        Num num = new Num(userInput);
        char choice;
        
        do {
            //Display formatted menu options
            System.out.println("show (W)hole number.");
          
            System.out.println("show (O)nes place number.");
          
            System.out.println("show (T)ens place number.");
          
            System.out.println("show (H)undreds place number.");
         
            System.out.println("(Q)uit");
            
            System.out.print("Enter your choice: ");
            
            //Convert input to lowercase
            choice = scanner.next().toLowerCase().charAt(0);  
            
            //Process user choice
            switch (choice) {
                case 'w':
                    System.out.println("The whole number is: " + num.getNumber());
                    break;
                
                case 'o':
                    System.out.println("The ones place digit is: " + num.getOnesDigit());
                    break;
                
                case 't':
                    System.out.println("The tens place digit is: " + num.getTensDigit());
                    break;
                
                case 'h':
                    System.out.println("The hundreds place digit is: " + num.getHundredsDigit());
                    break;
                
                case 'q':
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 'q');
        
     
    }
}

/*
TestCase1:
Enter an integer: 456
show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is: 4
show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: 

TestCase2:
Enter an integer: 33432
show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: w
The whole number is: 33432
show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice: 

*/