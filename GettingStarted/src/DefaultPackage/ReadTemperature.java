package DefaultPackage;

import com.phidget22.*;

public class ReadTemperature {

    public static void main(String[] args) throws Exception {

        //create the temperature sensor object
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //open the temperature sensor
        temperatureSensor.open(1000);

        //use the Phidgets to continuously read temperature.
        while (true) {
            
        	//get the temperature in Celsius.
            double celsius = temperatureSensor.getTemperature();
            
            //convert Celsius to Fahrenheit using the formula.
            double fahrenheit = (celsius * 1.8) + 32;

            //print Fahrenheit temperature.
           
            System.out.println("Temperature: " + fahrenheit + " °F");

            //sleep for 150ms before reading the temperature again.
            Thread.sleep(150);
        }
    }
}
