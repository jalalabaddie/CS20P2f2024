package SkillBuilders;

public class Reverse {

    public static void main(String[] args) {
    
        //Initialize an array with values from 0 to 9
        int[] numberOrder = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        //Display a message to indicate that a countdown will follow
        System.out.println("Countdown");
        
        //Loop through the array in reverse order starting from the last index 9 down to index 0
        for (int i = 9; i >= 0; i--) {
            
            //Print the value at the current index
            System.out.println(numberOrder[i]);
        }
    }
}