package Skillbuilders;

import java.util.Scanner;

public class Digits {


public static void main(String[] args)
{
	
	
	double first, second, third, totalDist;
	
	
	Scanner userInput = new Scanner(System.in);
	System.out.print("please eneter a 3 digit number: ");
	
	
	
	int number = userInput.nextInt();
	
	int HundrethsPlace = (number / 100);
	int TensPlace = (number / 10) % 10;
	int OnesPlace = number % 10;
	
	
	
	
	System.out.println("The ones place is: " + OnesPlace);
	
	System.out.println("The tens place is: " + TensPlace);
	
	System.out.println("The hundreths place is: " + HundrethsPlace);

	
	
	
	
}
	}