package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {


	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the base number from the user
	        System.out.print("Enter the base number: ");
	        double base = scanner.nextDouble();

	        // Get the exponent from the user
	        System.out.print("Enter the exponent: ");
	        double exponent = scanner.nextDouble();

	        // Calculate the result
	        double result = base;
	        for (int i = 1; i < exponent; i++) {
	            result *= base; // Multiply base for exponent times
	        }

	        // Show the result
	        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

	        scanner.close();
	    }
	}