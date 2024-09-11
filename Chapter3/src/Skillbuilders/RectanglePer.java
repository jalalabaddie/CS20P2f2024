package Skillbuilders;


import java.util.*;

public class RectanglePer 
{

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		
		//Declaration and initialization
		
		System.out.print("Please Enter A Length Value: ");
		int length = userInput.nextInt();
		
		System.out.print("Please Enter A Width Value: ");
		int width = userInput.nextInt();
		
		int area = length * width;
		
		System.out.print("The Area Of The Triangle Is: "+ area);
		
		

	}

}
