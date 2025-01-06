package DefaultPackage;

import com.phidget22.*;

public class Button {
    public static void main(String[] args) throws Exception {
        
        DigitalInput redButton = new DigitalInput();
        
        DigitalInput greenButton = new DigitalInput();

        redButton.setIsHubPortDevice(true);
       
        redButton.setHubPort(0);

        greenButton.setIsHubPortDevice(true);
       
        greenButton.setHubPort(5);

        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            
        	public void onStateChange(DigitalInputStateChangeEvent e) {
               
        		if (e.getState()) {
                   
        			System.out.println("Red Button Pressed");
               
        		} else {
                    
        			System.out.println("Red Button Not Pressed");
                }
            }
        });

        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
          
        	public void onStateChange(DigitalInputStateChangeEvent e) {
               
        		if (e.getState()) {
                   
        			System.out.println("Green Button Pressed");
              
        		} else {
                  
        			System.out.println("Green Button Not Pressed");
                }
            }
        });

        redButton.open(1000);
        
        greenButton.open(1000);

        int[] sleepTimes = {10, 1000, 5000};

        for (int sleepTime : sleepTimes) {
           
        	System.out.println("Sleeping for " + sleepTime + "ms...");
           
        	while (true) {
                
        		Thread.sleep(sleepTime);              }
        }
    }
}

  