package Masters;

import java.util.*;

public class MathTutor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        // Generate two random single-digit numbers
        int num1 = random.nextInt(10);
      
        int num2 = random.nextInt(10);
        
        String operator = getRandomOperator(random);
        
        // Handle division to avoid division by zero
        if (operator.equals("/") && num2 == 0) {
            num2 = 1; // Change num2 to 1 to prevent division by zero
        }

        // Create and display the equation
        System.out.print("What is " + num1 + " " + operator + " " + num2 + "? ");
        
        // Calculate the correct answer
        int correctAnswer = calculateAnswer(num1, num2, operator);
        
        // Get user input
        System.out.println("Your answer: ");
        int userAnswer = userInput.nextInt();
        
        // Check the answer
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is: " + correctAnswer);
        }

        
    }
    //Private static method in java. One for calculating result and generating a random operater
	private static int calculateAnswer(int num1, int num2, String operator) {
		return 0;
	}

	private static String getRandomOperator(Random random) {
		return null;
	}
}
