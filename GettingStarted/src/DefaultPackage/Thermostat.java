package DefaultPackage;

// Add Phidgets Library
import com.phidget22.*;

public class Thermostat {

    public static void main(String[] args) throws Exception {

        //create TemperatureSensor DigitalOutput objects for red and green LEDs.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //create DigitalInput objects for the green and red buttons.
        DigitalInput greenButton = new DigitalInput();
        DigitalInput redButton = new DigitalInput();

        
        //assign the correct HubPort for each LED and button.
     
        redLED.setHubPort(1);  //assign red LED to Hub Port 1.
      
        redLED.setIsHubPortDevice(true);
      
        greenLED.setHubPort(4);  //assign green LED to Hub Port 4.
      
        greenLED.setIsHubPortDevice(true);
       
        greenButton.setHubPort(5);  //assign green button to Hub Port 5.
        
        greenButton.setIsHubPortDevice(true);
        
        redButton.setHubPort(0);    //assign red button to Hub Port 0.
       
        redButton.setIsHubPortDevice(true);

        //open the sensor LEDs and buttons  with timeout of 1000.
        temperatureSensor.open(1000);
      
        redLED.open(1000);
      
        greenLED.open(1000);
      
        greenButton.open(1000);
      
        redButton.open(1000);

        //initialize the set temperature in Celsius.
        double setTemperature = 21.0;  //set temperature starts at 21°C.
     
        //time tracking for 10-second print.
        long lastPrintTime = System.currentTimeMillis();  

        //continuously check the temperature and control LEDs.
        while (true) {

            //get the current temperature.
            double currentTemperature = temperatureSensor.getTemperature();

            //check if the green button is pressed to increase the set temperature.
            if (greenButton.getState()) {
               
            	setTemperature += 1; //increase the set temperature by 1°C
               
                System.out.println("Set Temperature Increased: " + setTemperature + " °C");
              
                while (greenButton.getState()) {
                   
                	
                	Thread.sleep(10); //wait to debounce the button press
                }
            }

            //check if the red button is pressed to decrease the set temperature
            if (redButton.getState()) {
              
            	setTemperature -= 1; //decrease the set temperature by 1°C
               
                System.out.println("Set Temperature Decreased: " + setTemperature + " °C");
               
                while (redButton.getState()) {
                   
                	Thread.sleep(10); //wait to debounce the button press
                }
            }

            //check if 10 seconds have passed to print the temperatures
            long currentTime = System.currentTimeMillis();
         
            if (currentTime - lastPrintTime >= 10000) {  //10000ms = 10 seconds
               
            	System.out.println("Current Temperature: " + currentTemperature + " °C");
               
                System.out.println("Set Temperature: " + setTemperature + " °C");
               
                lastPrintTime = currentTime;  //update the last print time
            }

            //check if the current temperature is within 2°C of the set temperature
            if (Math.abs(currentTemperature - setTemperature) <= 2) {
               
            	//turn on the green LED and turn off the red LED
                greenLED.setState(true);   //green LED ON.
               
                redLED.setState(false);    //red LED OFF.
            } else {
                
            	//turn on the red LED and turn off the green LED.
               
            	redLED.setState(true);     //red LED ON.
                
                greenLED.setState(false);  //green LED OFF.
            }

            //pause for 150ms before checking the temperature again.
            Thread.sleep(150);
        }
    }
}
