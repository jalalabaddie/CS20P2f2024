package Masters;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectionMasters {

	public static void main(String[] args) {
		
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		  //preparing code to not exceed the output past the hundredths
			DecimalFormat deca = new DecimalFormat("#.##");
		 
		 // Declaring variables based on useroutput
		
		  System.out.println("Voting results from Calgary");
		  System.out.print("Rasheed Allaudin: ");
		  int all1 = in.nextInt();
		  System.out.print("Connor McDavid: ");
		  int mcd1 = in.nextInt();
		
		  System.out.println("Voting results from Edmonton");
		  System.out.print("Rasheed Allaudin: ");
		  int all2 = in.nextInt();
		  System.out.print("Connor McDavid: ");
		  int mcd2 = in.nextInt();
		 
		 
		  System.out.println("Voting results from Brtish Columbia");
		  System.out.print("Rasheed Allaudin: ");
		  int all3 = in.nextInt();
		  System.out.print("Connor McDavid: ");
		  int mcd3 = in.nextInt();
		 
		  
		  
		  
		  
		  //Combining variables into single variables
		  int alltotal= (all1 + all2 + all3);
		
		  int mcdtotal = (mcd1 + mcd2 + mcd3);
		 
		  int total = (alltotal + mcdtotal);
		  //using double to get decimal format and calculating
		  double per1 = (Double.valueOf(alltotal) / Double.valueOf(total))*100;
		  double per2 = (Double.valueOf(mcdtotal) / Double.valueOf(total))*100;
		 
		  //outputting desired variables
		  System.out.println("‎ ‎ ‎ ‎ ‎ ");
		  
		  System.out.println("Candidate  Votes 	Percentage");
		
		  System.out.println("Allaudin:    "    + alltotal + " 	          " + deca.format(per1) + "%" );
		  
		  System.out.println("Mcdavid:     "    + mcdtotal + " 	          " + deca.format(per2) + "%" );
		  System.out.println("Total Votes From Provinces:  " + total);
		  System.out.println("Thank you!");

		
		
		

	}

}
