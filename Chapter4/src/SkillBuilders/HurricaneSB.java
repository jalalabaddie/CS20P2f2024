
package SkillBuilders;

import java.util.*;

public class HurricaneSB {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Prompt the user to enter the hurricane category (1-5)
        System.out.print("Enter hurricane category (1-5): ");
        int category = userInput.nextInt();
        
        // Call the method to display wind speeds based on the category
        displayWindSpeeds(category);
    }

    // Method to display wind speeds in different units
    private static void displayWindSpeeds(int category) {
        switch (category) {
           
        case 1:
               
        	System.out.println("Category 1:");
               
        	System.out.println("Wind Speed: 74-95 mph");
               
        	System.out.println("Knots: 64-82 kts");
               
        	System.out.println("Kilometers per hour: 119-153 km/h");
                break;
            
        case 2:
               
        	System.out.println("Category 2:");
               
        	System.out.println("Wind Speed: 96-110 mph");
                
        	System.out.println("Knots: 83-95 kts");
                
        	System.out.println("Kilometers per hour: 154-177 km/h");
                break;
           
        case 3:
               
        	System.out.println("Category 3:");
               
        	System.out.println("Wind Speed: 111-130 mph");
               
        	System.out.println("Knots: 96-113 kts");
               
        	System.out.println("Kilometers per hour: 178-209 km/h");
                break;
            
        case 4:
               
        	System.out.println("Category 4:");
               
        	System.out.println("Wind Speed: 131-155 mph");
               
        	System.out.println("Knots: 114-135 kts");
              
        	System.out.println("Kilometers per hour: 210-249 km/h");
                break;
            
        case 5:
                
        	System.out.println("Category 5:");
               
        	System.out.println("Wind Speed: Greater than 155 mph");
               
        	System.out.println("Knots: Greater than 135 kts");
               
        	System.out.println("Kilometers per hour: Greater than 249 km/h");
                break;
            
            
            default:
                System.out.println("Invalid category. Please enter a category between 1 and 5.");
        }
    }
}