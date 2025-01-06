package DefaultPackage;

import com.phidget22.*;

public class ButtonAndLED {
    static int redButtonPressCount = 0;
    static int greenButtonPressCount = 0;

    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;

    public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        
        redButton.setHubPort(0);
       
        redButton.setIsHubPortDevice(true);
      
        greenButton.setHubPort(5);
       
        greenButton.setIsHubPortDevice(true);
       
        redLED.setHubPort(1);
      
        redLED.setIsHubPortDevice(true);
     
      
        greenLED.setHubPort(4);
      
        greenLED.setIsHubPortDevice(true);

        
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                
                if (e.getState()) {
                    redButtonPressCount++;
                  
                    System.out.println("Red Button Pressed, Press Count: " + redButtonPressCount);
                    turnGreenLEDOn = true;  
              
                } else {
                    turnGreenLEDOn = false; 
                }
            }
        });

        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           
        	public void onStateChange(DigitalInputStateChangeEvent e) {
                
                if (e.getState()) {
                   
                	greenButtonPressCount++; 
                   
                	System.out.println("Green Button Pressed, Press Count: " + greenButtonPressCount);
                    turnRedLEDOn = true;    
             
                } else {
                    turnRedLEDOn = false;   
                }
            }
        });

        redButton.open(1000);
       
        greenButton.open(1000);
      
        redLED.open(1000);
     
        greenLED.open(1000);

        while (true) {
           
            if (redButtonPressCount >= 10) {
                
            	System.out.println("Red Player Wins!");
               
            	redLED.setState(true);  
               
            	greenLED.setState(true);
               
            	break; 
           
            } else if (greenButtonPressCount >= 10) {
               
            	System.out.println("Green Player Wins!");
               
            	redLED.setState(true);  
              
            	greenLED.setState(true);
              
            	break;  
            }

            redLED.setState(turnRedLEDOn);
            greenLED.setState(turnGreenLEDOn);

           
            Thread.sleep(150);
        }
    }
}

