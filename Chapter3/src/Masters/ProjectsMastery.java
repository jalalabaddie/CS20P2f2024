package Masters;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

 
public class ProjectsMastery 
{

	public static void main(String[] args)	
	{

		Scanner userInput = new Scanner(System.in);
		
		//Formatting numbers up to 2 decimal places.
		DecimalFormat formatter = new DecimalFormat("#.##");
		
		//Creating the decimal for the following variables and their percentages.
		double des, cod, deb, tes, despercent, codpercent, debpercent, tespercent, totalTime;
		
		//Promt the user to enter their desired minutes and store it based on the variable.
		System.out.print("Please enter the amount of minutes you took for designing:");
		des = userInput.nextInt();
		
		System.out.print("Please enter the amount of minutes you took for coding:");
		
		cod = userInput.nextInt();
		
		System.out.print("Please enter the amount of minutes you took for debugging:");
		
		deb = userInput.nextInt();
		
		System.out.print("Please enter the amount of minutes you took for testing:");
		
		tes = userInput.nextInt();
		
		//The sum of all the time the user has entered.
		totalTime = des + cod + deb + tes;
		
		//Calculating the percentages of each time spent on the activity's(designing, coding, debugging, testing)
		despercent = (des/totalTime) *100 ;
		
		codpercent = (cod/totalTime)  *100;
		
		debpercent = (deb/totalTime) *100 ;
		
		tespercent = (tes/totalTime) *100;
		
		//formatted table that displays the percentage of time spent based on what activity you were doing
		System.out.println("Task       %Time");
		
		System.out.println("‎ ‎ ‎ ");
		
		System.out.println("designing: " + formatter.format(despercent) + "%");
		
		System.out.println("coding: " + formatter.format(codpercent) + "%");
		
		System.out.println("debugging:" + formatter.format(debpercent) + "%");
	
		System.out.println("testing:" + formatter.format(tespercent) + "%");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}