package Masterys;

public class Food {

    //Variable to keep track of the total cost of the order
    private double totalPrice;

    //Constructor to initialize the total price to zero
    public Food() {
        totalPrice = 0;
    }

    //Method to calculate the cost and nutritional information for hamburgers
    public void addHamburgers(int quantity, double fatContent, double carbsContent, double fiberContent) {
       
    	//Add the cost of hamburgers to the total price
        totalPrice += (quantity * 1.85);
        
        //Display the nutritional info for each hamburger
        System.out.println("Each hamburger contains " + fatContent + "g of fat, "
               
        		+ carbsContent + "g of carbs, and " + fiberContent + "g of fiber.");
    }

    //Method to calculate the cost and nutritional information for salads
    public void addSalads(int quantity, double fatContent, double carbsContent, double fiberContent) {
      
    	// Add the cost of salads to the total price
        totalPrice += (quantity * 2.00);
        
        //Display the nutritional info for each salad
        System.out.println("Each salad contains " + fatContent + "g of fat, "
               
        		+ carbsContent + "g of carbs, and " + fiberContent + "g of fiber.");
    }

    //Method to calculate the cost and nutritional information for french fries
    public void addFrenchFries(int quantity, double fatContent, double carbsContent, double fiberContent) {
      
    	// Add the cost of french fries to the total price
        totalPrice += (quantity * 1.30);
        
        //Display the nutritional info for each serving of fries
        System.out.println("Each serving of french fries contains " + fatContent + "g of fat, "
               
        		+ carbsContent + "g of carbs, and " + fiberContent + "g of fiber.");
    }

    //Method to calculate the cost and nutritional information for sodas
    public void addSodas(int quantity, double fatContent, double carbsContent, double fiberContent) {
       
    	//Add the cost of sodas to the total price
        totalPrice += (quantity * 0.95);
        
        //Display the nutritional info for each soda
        System.out.println("Each soda contains " + fatContent + "g of fat, "
               
        		+ carbsContent + "g of carbs, and " + fiberContent + "g of fiber.");
    }

    //Method to return the total price of the order
    public double getTotalPrice() {
       
    	return totalPrice;
    }
}

