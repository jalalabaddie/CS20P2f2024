package Masters;

import java.util.*;

public class GuessingGameMastery {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Generate a secret number between 1 and 20
        Random random = new Random();
       
        int secretNumber = random.nextInt(20) + 1;

        // Prompt the player to guess a number
        System.out.print("Guess a number between 1 and 20: ");
      
        int playerGuess = userInput.nextInt();

        // Display the player's guess and the secret number
        System.out.println("Your guess: " + playerGuess);
       
        System.out.println("Secret number: " + secretNumber);

        // Check if the player's guess is correct
        if (playerGuess == secretNumber) {
        	System.out.println("You won!");
        } else {
            System.out.println("Wrong! Try again next time!!");
        }

       
    }
}
