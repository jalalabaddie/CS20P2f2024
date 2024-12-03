package Masterys;

public class PiggyBank {

    // Instance variables to store the number of each type of coin
    private int pen;   // Number of pennies
   
    private int nic;   // Number of nickels
  
    private int dime;  // Number of dimes
  
    private int quart; // Number of quarters

    // Constructor to initialize the coin counts to 0
    public PiggyBank() {
      
    	
    	pen = 0;  // Initialize pennies to 0
      
    	nic = 0;  // Initialize nickels to 0
      
        dime = 0; // Initialize dimes to 0
      
        quart = 0; // Initialize quarters to 0
    }

    //Method to add pennies to the piggy bank
    public void penny(int num) {
      
    	pen += num;  //Increase the number of pennies by 'num'
    }

    // Method to add nickels to the piggy bank
    public void nickel(int num) {
      
    	nic += num;  //Increase the number of nickels by 'num'
    }

    //Method to add dimes to the piggy bank
    public void dime(int num) {
       
    	dime += num;  //Increase the number of dimes by 'num'
    }

    // Method to add quarters to the piggy bank
    public void quarter(int num) {
        
    	quart += num;  // Increase the number of quarters by 'num'
    }

    //Method to calculate the total value of the coins in the piggy bank
    public double bankTotal() {
       
    	//Returns the total value by multiplying the number of each coin with its value and summing them up
        return (pen * 0.01) + (nic * 0.05) + (dime * 0.1) + (quart * 0.25);
    }

    //Method to empty the piggy bank (remove all coins)
    public void takeOut() {
      
    	pen = 0;   //Reset the number of pennies to 0
       
    	nic = 0;   //Reset the number of nickels to 0
      
    	dime = 0;  //Reset the number of dimes to 0
      
    	quart = 0; //Reset the number of quarters to 0
    }

    //Method to return a string representation of the current coin counts in the piggy bank
    public String toString() {
       
    	//Returns a string with the counts of each type of coin
        String total = "Penny: " + pen + " Nickel: " + nic + " Dime: " + dime + " Quarters: " + quart;
       
        return total;
    }

  
       
    	 
    }

	
	
	




