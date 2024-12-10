package SkillBuilders;
import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		//Declaring variable.
		int numStudents;
		
		//Prompting user for how many students are in class. 
		System.out.print("Please enter how many students are in the class: ");
		
		numStudents = input.nextInt();
		
		//Creating list that can store name of every student in the class.
		String[] students = new String[numStudents + 1];
		
		//For loop to go through every class member to get their name and put it in the list.
		for(int i = 1; i<= numStudents; i++) {
			
			System.out.print("Please enter student " + i + "'s name: ");
			
			students[i] = input.next();
		}
		
		//Outputting student roster to let user know program is going to output them.
		System.out.println("");
		
		System.out.println("Student Roster: ");
	
		//For loop to output every students number and their name.
		for(int i = 1; i<= numStudents; i++) {
			
			System.out.println("Student" + i + ": " + students[i]);
		}
		
	}

}