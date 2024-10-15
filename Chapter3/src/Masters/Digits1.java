package Masters;

import java.util.Random;
import java.util.Scanner;

public class Digits1 
{
	


	public static void main(String[] args)
	{
		
		
		
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("please enter a 3 digit number: ");
		
		
		
		int number = userInput.nextInt();
		
		int HundredsPlace = (number / 100);
		int TensPlace = (number / 10) % 10;
		int OnesPlace = number % 10;
		
		
		
		System.out.println("The hundreds place is: " + HundredsPlace);  
		System.out.println("The tens place is: " + TensPlace);
		System.out.println("The ones place is: " + OnesPlace);
		
	}
}

