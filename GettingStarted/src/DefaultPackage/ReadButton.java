package DefaultPackage;

import com.phidget22.*;

public class ReadButton {
    public static void main(String[] args) throws Exception {
        
        // Create a DigitalInput object for your button
        DigitalInput redButton = new DigitalInput();

        // Address for the button (connected to port 5)
        redButton.setHubPort(5);
        redButton.setIsHubPortDevice(true);

        // Open the connection to the button
        redButton.open(1000);

        // Initialize previous state variable to store the previous button state
        boolean previousState = redButton.getState();  // Get the initial state

        // Loop and vary the sleep time to observe different behaviors
        while (true) {
            // Get the current button state
            boolean currentState = redButton.getState();

            // Check if the button state has changed
            if (currentState != previousState) {
                // Print the new state if it has changed
                System.out.println("Button State Changed: " + currentState);
                
                // Update the previous state to the current state
                previousState = currentState;
            }
            
            // Sleep for 10ms before checking again
            Thread.sleep(10);

            // Sleep for 1000ms (1 second) for the next iteration
            Thread.sleep(1000);

            // Sleep for 5000ms (5 seconds) for the next iteration
            Thread.sleep(5000);
        }
    }
}