package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Display options
    System.out.println("time conversion options:");
    
    System.out.println("1. hours to minutes");
    
    System.out.println("2. days to hours");
   
    System.out.println("3. minutes to hours");
   
    System.out.println("4. hours to days");
   
    System.out.print("choose one option (1-4): ");
    
    int choice = scanner.nextInt();
   
    System.out.print("enter the value: ");
    
    double value = scanner.nextDouble();
    
    double result = 0;

    if (choice == 1) {
        result = value * 60; // Hours to minutes
        System.out.println(value + " hours = " + result + " minutes.");
   
  
    } else if (choice == 2) {
        result = value * 24; // Days to hours
        System.out.println(value + " days = " + result + " hours.");
  
 
    } else if (choice == 3) {
        result = value / 60; // Minutes to hours
        System.out.println(value + " minutes = " + result + " hours.");
   
 
    } else if (choice == 4) {
    	result = value / 24; // Hours to days
        System.out.println(value + " hours = " + result + " days.");
   
    } 
    
    }


}
