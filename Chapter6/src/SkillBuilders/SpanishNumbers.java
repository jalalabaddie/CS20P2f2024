package SkillBuilders;

public class SpanishNumbers {
        
		public static void main(String[] args) {
		     
			//Go through the numbers 1-10 ad state restrictions
		       for (int i = 1; i <= 10; i++) {
		         
		    	   //method to display the Spanish word for the number
		           displaySpanishNumber(i);
		       }
		   }
		  
		//method to display the Spanish word for the number passed
		   public static void displaySpanishNumber(int number) {
		       String spanishWord = null;
		       switch (number) {
		           case 1:
		               spanishWord = "Uno";
		               break;
		           case 2:
		               spanishWord = "Dos";
		               break;
		           case 3:
		               spanishWord = "Tres";
		               break;
		           case 4:
		               spanishWord = "Cuatro";
		               break;
		           case 5:
		               spanishWord = "Cinco";
		               break;
		           case 6:
		               spanishWord = "Seis";
		               break;
		           case 7:
		               spanishWord = "Siete";
		               break;
		           case 8:
		               spanishWord = "Ocho";
		               break;
		           case 9:
		               spanishWord = "Nueve";
		               break;
		           case 10:
		               spanishWord = "Diez";
		               break;
		  
		       }
		       // Display the number and its Spanish equivalent
		       System.out.println(number + " in Spanish is: " + spanishWord);
		   }
		}


