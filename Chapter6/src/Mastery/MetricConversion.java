/*
 Program: MetricConversion.java          Last Date of this Revision: November 5, 2024

Purpose: An application that promts the user to choose the type of metric conversion they want and then output the results of the conversion.

Author: Rasheed Allaudin, 
School: CHHS
Course: Computer science 20
 
 
 */
package Mastery;

import java.util.Scanner;

public class MetricConversion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 9) {
            displayMenu();
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 8) {
               
            	System.out.print("Enter your value!: ");
               
                double value = scanner.nextDouble();
               
                double result = convert(choice, value);
                
                System.out.println("Result is: " + result);
            } 
          
        }
     
    }

    public static void displayMenu() {
       
    	System.out.println("Metric Conversion Menu/Chart!:");
      
        System.out.println("1. inches to centimeters");
       
        System.out.println("2. centimeters to inches");
       
        System.out.println("3. feet to centimeters");
      
        System.out.println("4. centimeters to feet");
       
        System.out.println("5. yards to meters");
      
        System.out.println("6. meters to yards");
       
        System.out.println("7. miles to kilometers");
      
        System.out.println("8. kilometers to miles");
      
        System.out.print("Please choose your desired option number 1-8: ");
    }

    public static double convert(int choice, double value) {
        switch (choice) {
           
        case 1: return value * 2.54; // Inches to Centimeters
            
        case 2: return value / 2.54; // Centimeters to Inches
           
        case 3: return value * 30.48; // Feet to Centimeters
           
        case 4: return value / 30.48; // Centimeters to Feet
           
        case 5: return value * 0.9144; // Yards to Meters
           
        case 6: return value / 0.9144; // Meters to Yards
           
        case 7: return value * 1.6093; // Miles to Kilometers
           
        case 8: return value / 1.6093; // Kilometers to Miles
           
        
        }
		return value;
    }
}

/*
TestCase1:
Metric Conversion Menu/Chart!:
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters
6. meters to yards
7. miles to kilometers
8. kilometers to miles
Please choose your desired option number 1-8: 8
Enter your value!: 45
Result is: 27.962468153855713

TestCase2:
Metric Conversion Menu/Chart!:
1. inches to centimeters
2. centimeters to inches
3. feet to centimeters
4. centimeters to feet
5. yards to meters
6. meters to yards
7. miles to kilometers
8. kilometers to miles
Please choose your desired option number 1-8: 5
Enter your value!: 21
Result is: 19.2024
*/