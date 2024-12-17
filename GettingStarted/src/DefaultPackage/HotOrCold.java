package DefaultPackage;

// Add Phidgets Library
import com.phidget22.*;

public class HotOrCold {
   public static void main(String[] args) throws Exception {
       // Create TemperatureSensor, DigitalOutput objects for red and green LEDs
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalOutput redLED = new DigitalOutput();
       DigitalOutput greenLED = new DigitalOutput();
      
       // Assign the correct HubPort for each LED (example: red LED on port 1, green LED on port 4)
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
      
       // Open the sensor and LEDs (with timeout of 1000ms)
       temperatureSensor.open(1000);
       redLED.open(1000);
       greenLED.open(1000);
      
       // Continuously check the temperature and control LEDs
       while(true) {
           // Get the current temperature
           double currentTemperature = temperatureSensor.getTemperature();

           // Print the current temperature
           System.out.println("Temperature: " + currentTemperature + " °C");

           // Check if the temperature is between 20°C and 24°C
           if (currentTemperature >= 20 && currentTemperature <= 24) {
               // Turn on the green LED and turn off the red LED
               greenLED.setState(true);   // Green LED ON
               redLED.setState(false);    // Red LED OFF
           } else {
               // Turn on the red LED and turn off the green LED
               redLED.setState(true);     // Red LED ON
               greenLED.setState(false);  // Green LED OFF
           }

           // Pause for 150ms
           Thread.sleep(150);
       }
   }
}

