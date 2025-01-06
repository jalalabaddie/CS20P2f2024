package DefaultPackage;


import com.phidget22.*;

public class ClosingPhidgets {
    public static void main(String[] args) throws Exception {

       
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        
        temperatureSensor.open(1000);
       
        System.out.println("temperature: " + temperatureSensor.getTemperature() + " °C");

      
        temperatureSensor.close();
       
        System.out.println("temperature sensor closed.");

        
        Thread.sleep(1000);

        
        System.out.println("reopening the temperature sensor...");
       
        temperatureSensor.open(1000);

       
        System.out.println("temperature: " + temperatureSensor.getTemperature() + " °C");

       
       
    }
}
