
import java.util.Scanner;


public class LunchOrder 
{
	public static void main(String[] args) 
	{
       
		//Initialize food items with their price and nutrition information
      
		Food burger = new Food(1.85, 9, 33, 1);
       
		Food greenSalad = new Food(2.00, 1, 11, 5);
      
		Food fries = new Food(1.30, 11, 36, 4);
      
		Food cola = new Food(0.95, 0, 38, 0);

        
        //Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Prompt user for the quantity of each item
        System.out.print("Please insert the amount of hamburgers you would like: ");
       
        int burgerCount = input.nextInt();
       
        System.out.print("Please insert the amount of salads would you like: ");
       
        int greenSaladCount = input.nextInt();
      
        System.out.print("Please insert the amount of French Fries you would like: ");
      
        int friesCount = input.nextInt();
     
        System.out.print("please enter the amount of sodas you would like: ");
       
        int colaCount = input.nextInt();

        //Calculate the total price of the order
       double totalCost = (burger.getPrice() * burgerCount) +
                           (greenSalad.getPrice() * greenSaladCount) +
                           (fries.getPrice() * friesCount) +
                           (cola.getPrice() * colaCount);

        //Calculate the nutrition values for each item
        int burgerFat = burger.getFat() * burgerCount;
       
        int burgerCarbs = burger.getCarbs() * burgerCount;
      
        int burgerFiber = burger.getFiber() * burgerCount;
       
        int saladFat = greenSalad.getFat() * greenSaladCount;
       
        int saladCarbs = greenSalad.getCarbs() * greenSaladCount;
       
        int saladFiber = greenSalad.getFiber() * greenSaladCount;
      
        int friesFat = fries.getFat() * friesCount;
      
        int friesCarbs = fries.getCarbs() * friesCount;
       
        int friesFiber = fries.getFiber() * friesCount;
      
        int colaFat = cola.getFat() * colaCount;
     
        int colaCarbs = cola.getCarbs() * colaCount;
      
        int colaFiber = cola.getFiber() * colaCount;

        //Print the order details for each item
        System.out.println("\nYour Order Summary:");
       
        System.out.println("\nBurger:");
      
        System.out.println("  Fat: " + burgerFat + "g");
       
        System.out.println("  Carbs: " + burgerCarbs + "g");
      
        System.out.println("  Fiber: " + burgerFiber + "g");

      
        System.out.println("\nGreen Salad:");
      
        System.out.println("  Fat: " + saladFat + "g");
      
        System.out.println("  Carbs: " + saladCarbs + "g");
      
        System.out.println("  Fiber: " + saladFiber + "g");

      
        System.out.println("\nFrench Fries:");
      
        System.out.println("  Fat: " + friesFat + "g");
     
        System.out.println("  Carbs: " + friesCarbs + "g");
     
        System.out.println("  Fiber: " + friesFiber + "g");

        System.out.println("\nCola:");
      
        System.out.println("  Fat: " + colaFat + "g");
      
        System.out.println("  Carbs: " + colaCarbs + "g");
      
        System.out.println("  Fiber: " + colaFiber + "g");

        //Print total cost and nutrition values
        System.out.printf("\nTotal cost: $%.2f%n", totalCost);
       
        System.out.println("Total fat: " + (burgerFat + saladFat + friesFat + colaFat) + "g");
       
        System.out.println("Total carbs: " + (burgerCarbs + saladCarbs + friesCarbs + colaCarbs) + "g")
       
        System.out.println("Total fiber: " + (burgerFiber + saladFiber + friesFiber + colaFiber) + "g");

    
    }

}
