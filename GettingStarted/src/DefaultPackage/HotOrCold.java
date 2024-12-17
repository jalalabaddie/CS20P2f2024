package DefaultPackage;

//add Phidgets Library
import com.phidget22.*;

public class HotOrCold {
  
	public static void main(String[] args) throws Exception {
      
		//create TemperatureSensor, DigitalOutput objects for red and green LEDs.
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
      
       //Assign the correct HubPort for each LED 
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
      
       //Open the sensor and LEDs (with timeout of 1000ms)
       temperatureSensor.open(1000);
       redLED.open(1000);
       greenLED.open(1000);
      
       //continuously check the temperature and control LEDs
       while(true) {
          
    	   //get the current temperature
           double currentTemperature = temperatureSensor.getTemperature();

           //print the current temperature
           System.out.println("Temperature: " + currentTemperature + " °C");

           //check if the temperature is between 20°C and 24°C
           if (currentTemperature >= 20 && currentTemperature <= 24) {
               // Turn on the green LED and turn off the red LED
               greenLED.setState(true);   // Green LED ON
               redLED.setState(false);    // Red LED OFF
           } else {
               //turn on the red LED and turn off the green LED
               redLED.setState(true);     // Red LED ON
               greenLED.setState(false);  // Green LED OFF
           }

           //pause for 150ms
           Thread.sleep(150);
       }
   }
}

