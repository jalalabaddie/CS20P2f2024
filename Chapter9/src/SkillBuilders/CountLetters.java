package SkillBuilders;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        
        //Initialize an array to count occurrences of each letter.
        int[] letterCounts = new int[26];
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a phrase: ");
       
        String phrase = input.nextLine().toUpperCase();
        
        //Loop through each character in the phrase.
        for (char letter : phrase.toCharArray()) {
          
        	if (Character.isLetter(letter)) {
              
            	letterCounts[letter - 'A']++;
            }
        }
        
        //Print the count of each letter.
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            
        	System.out.println(letter + ": " + letterCounts[letter - 'A']);
        }
    }
}