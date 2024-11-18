/*
 Program: AddCoins.java          Last Date of this Revision: November 1, 2024

Purpose: An application that gets the number of pennies, nickels, dimes, quarters from the user and adds them all up for the total.

Author: Rasheed Allaudin, 
School: CHHS
Course: Computer science 20
 
 
 */
package Mastery;
import java.util.Scanner;
public class AddCoins {
   
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       // Prompt the user for the number of pennies, nickels, dimes, and quarters
       System.out.print("Enter the amount of pennies: ");
       int pennies = scanner.nextInt();
      
       System.out.print("Enter the amount of nickels: ");
       int nickels = scanner.nextInt();
      
       System.out.print("Enter the amount of dimes: ");
       int dimes = scanner.nextInt();
      
       System.out.print("Enter the amount of quarters: ");
       int quarters = scanner.nextInt();
    
       // Call the getDollarAmount method and display the total dollar amount
       String totalAmount = getDollarAmount(pennies, nickels, dimes, quarters);
       
       System.out.println("total dollar amount: " + totalAmount);
     
   }
  
	// Method to calculate the total dollar amount of coins
   public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
      
	   // Calculate the dollar value of each coin type
       double total = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
       
       // Format the result as a String with a currency sign and 2 decimal places
       return String.format("$%.2f", total);
   }
}

/*
TestCase1:
Enter the amount of pennies: 4
Enter the amount of nickels: 3
Enter the amount of dimes: 3
Enter the amount of quarters: 2
total dollar amount: $0.99

TestCase2:
Enter the amount of pennies: 4
Enter the amount of nickels: 5
Enter the amount of dimes: 3
Enter the amount of quarters: 9
total dollar amount: $2.84


*/