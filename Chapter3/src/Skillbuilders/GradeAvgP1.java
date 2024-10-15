package Skillbuilders;

import java.util.Scanner;

public class GradeAvgP1 
{

	
	public static void main(String[] args) 
	{

		Scanner userInput = new Scanner(System.in);
	
		System.out.print("PLease Enter your first grade: ");
		int firstGrade = userInput.nextInt();
		
		System.out.print("PLease Enter your second grade: ");
		int secondGrade = userInput.nextInt();
		
		System.out.print("PLease Enter your thrid grade: ");
		int thirdGrade = userInput.nextInt();
		
		System.out.print("PLease Enter your fourth grade: ");
		int fourthGrade = userInput.nextInt();
		
		System.out.print("PLease Enter your fith grade: ");
		int fifthGrade = userInput.nextInt();

int grades = (firstGrade + secondGrade + thirdGrade + fourthGrade + fifthGrade);
 int Divide = 5;

int Total = grades/Divide;

	System.out.println("The average of your grades is: " + Total);


	}
	
}



