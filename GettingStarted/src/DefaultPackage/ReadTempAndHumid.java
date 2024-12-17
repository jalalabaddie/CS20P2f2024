package DefaultPackage;

//Add Phidgets Library.
import com.phidget22.*;

public class ReadTempAndHumid {
    
    public static void main(String[] args) throws Exception{

        // Create objects for the HumiditySensor and TemperatureSensor
        HumiditySensor humiditySensor = new HumiditySensor();
       
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //open the sensors and establish connection
        humiditySensor.open(1000);
      
        temperatureSensor.open(1000);

        //read data continuously.
        while(true){
            
            //get the current humidity and temperature.
           
        	double humidity = humiditySensor.getHumidity();
          
        	double temperature = temperatureSensor.getTemperature();

            //print humidity only if it is above 30 percent, otherwise print "humidity is low".
            if (humidity > 30) {
               
            	System.out.println("Humidity: " + humidity + " %RH");
           
            } else {
                
            	System.out.println("Humidity is low");
            }

            //print the temperature only if the room is above 21 degrees celcius, otherwise print "room is too cold".
            if (temperature > 21) {
                
            	System.out.println("Temperature: " + temperature + " °C");
           
            } else {
               
            	System.out.println("Room is too cold");
            }

            //take a pause for 150ms.
            Thread.sleep(150);
        }
    }
}
