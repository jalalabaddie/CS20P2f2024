/*
 Program: CourseGrades.java          Last Date of this Revision: december 9th 2024

Purpose: An application that asks the user for test grades for 12 students. The program calculates the 
average of the 5 test for the 12 students and displays it.
Author: Rasheed Allaudin, 
School: CHHS
Course: Computer Science 20
 
 */
package Masterys;
import java.util.Scanner;
public class CourseGrades {
  
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       //Number of students and tests
       int students = 12;
       int tests = 5;

 //Create a GradeBook object
       GradeBook gradeBook = new GradeBook(students, tests);
      
       //Input grades for all students and tests
       for (int student = 0; student < students; student++) {
         
    	   System.out.println("Please Enter Test Grades For Student " + (student + 1) + ":");
         
    	   for (int test = 0; test < tests; test++) {
             
    		   System.out.print("Test " + (test + 1) + ": ");
             
    		   int grade = scanner.nextInt();
              
    		   gradeBook.setGrade(student, test, grade);
           }
       }
       //Display all grades
       gradeBook.showGrades();
      
       //Calculate and display average grades for each student
       for (int student = 0; student < students; student++) {
          
    	   System.out.println("The Average grade for Student " + (student + 1) + ": " +
                 
        		   gradeBook.studentAvg(student));
       }
       //Calculate and display average grades for each test
       for (int test = 0; test < tests; test++) {
          
    	   System.out.println("The Average grade for Test " + (test + 1) + ": " +
                  
    			   gradeBook.testAvg(test));
       }
	}
}
/*
TestCase1:
Please Enter Test Grades For Student 1:
Test 1: 45
Test 2: 65
Test 3: 78
Test 4: 98
Test 5: 78
Please Enter Test Grades For Student 2:
Test 1: 52
Test 2: 34
Test 3: 87
Test 4: 63
Test 5: 45
Please Enter Test Grades For Student 3:
Test 1: 62
Test 2: 95
Test 3: 85
Test 4: 90
Test 5: 89
Please Enter Test Grades For Student 4:
Test 1: 98
Test 2: 96
Test 3: 34
Test 4: 67
Test 5: 76
Please Enter Test Grades For Student 5:
Test 1: 87
Test 2: 98
Test 3: 64
Test 4: 84
Test 5: 91
Please Enter Test Grades For Student 6:
Test 1: 45
Test 2: 71
Test 3: 89
Test 4: 78
Test 5: 84
Please Enter Test Grades For Student 7:
Test 1: 75
Test 2: 87
Test 3: 93
Test 4: 78
Test 5: 87
Please Enter Test Grades For Student 8:
Test 1: 97
Test 2: 89
Test 3: 78
Test 4: 56
Test 5: 45
Please Enter Test Grades For Student 9:
Test 1: 78
Test 2: 798
Test 3: 56
Test 4: 78
Test 5: 56
Please Enter Test Grades For Student 10:
Test 1: 45
Test 2: 98
Test 3: 89
Test 4: 77
Test 5: 66
Please Enter Test Grades For Student 11:
Test 1: 76
Test 2: 56
Test 3: 87
Test 4: 68
Test 5: 56
Please Enter Test Grades For Student 12:
Test 1: 78
Test 2: 6
Test 3: 56
Test 4: 90
Test 5: 90
Grades:
Student 1: 45 65 78 98 78 
Student 2: 52 34 87 63 45 
Student 3: 62 95 85 90 89 
Student 4: 98 96 34 67 76 
Student 5: 87 98 64 84 91 
Student 6: 45 71 89 78 84 
Student 7: 75 87 93 78 87 
Student 8: 97 89 78 56 45 
Student 9: 78 798 56 78 56 
Student 10: 45 98 89 77 66 
Student 11: 76 56 87 68 56 
Student 12: 78 6 56 90 90 
The Average grade for Student 1: 72.8
The Average grade for Student 2: 56.2
The Average grade for Student 3: 84.2
The Average grade for Student 4: 74.2
The Average grade for Student 5: 84.8
The Average grade for Student 6: 73.4
The Average grade for Student 7: 84.0
The Average grade for Student 8: 73.0
The Average grade for Student 9: 213.2
The Average grade for Student 10: 75.0
The Average grade for Student 11: 68.6
The Average grade for Student 12: 64.0
The Average grade for Test 1: 69.83333333333333
The Average grade for Test 2: 132.75
The Average grade for Test 3: 74.66666666666667
The Average grade for Test 4: 77.25
The Average grade for Test 5: 71.91666666666667

TestCase2:
*/