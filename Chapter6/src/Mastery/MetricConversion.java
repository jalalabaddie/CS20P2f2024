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