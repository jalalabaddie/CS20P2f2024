package Masterys;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LunchOrder {

	public static void main(String[] args) {
		
		//creating new Scanner, Food, and DecimalFormat object
		Scanner input = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.##");
		Food order = new Food();
		
		//Asking user for amount of Hamburgers, french fries, sodas, and salads and providing the nutritional info for each item
		System.out.print("Enter number of hamburgers: ");
	
		//Entering the value for the amount of Fat, Carbs, and fiber for each item
		order.addHamburgers(input.nextInt(), 9, 33, 1);
		
		//Make a blank line for space for more organized output
		System.out.println("");
		
		System.out.print("Enter number of salads: ");
		
		order.addSalads(input.nextInt(), 1, 11, 5);
		
		System.out.println("");
		
		System.out.print("Enter number of french fries: ");
		
		order.addFrenchFries(input.nextInt(), 11, 36, 4);
		
		System.out.println("");
		
		System.out.print("Enter number of sodas: ");
		
		order.addSodas(input.nextInt(), 0, 38, 0);
		
		System.out.println("");
		
		//outputs total amount of money user owes for the food by accessing it through total method
		System.out.println("Your order comes to: $" + formatter.format(order.getTotalPrice()));
	

	}

}
