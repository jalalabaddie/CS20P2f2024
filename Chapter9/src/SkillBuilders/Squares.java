package SkillBuilders;

public class Squares {

	public static void main(String[] args) {
		
		//Creating a list to store 5 components.
		int[] indexSquares = new int[5];
		
		//Storing the sqaure of each index's number in that index for the 5 elements.
		for(int i = 0; i < 5; i++) {
			
			indexSquares[i] = (int) Math.pow(i, 2);
		}
		
		
		//Printing out every element's index's value which results in the index number squared.
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Square of index " + i + ": " + indexSquares[i]);
		}
	}

}