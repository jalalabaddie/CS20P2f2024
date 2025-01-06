package DefaultPackage;

// Add Phidgets Library
import com.phidget22.*;

public class SmartPhidget {

    public static void main(String[] args) throws Exception {

        
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
                System.out.println("Humidity: " + e.getHumidity() + "%RH");
            }
        });

        
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                double currentTemperature = e.getTemperature(); // Get current temperature
                // Check if the temperature is above or below 21°C
                if (currentTemperature >= 21) {
                    System.out.println("Temperature: " + currentTemperature + "°C");
                } else {
                    System.out.println("Room is too cold");
                }
            }
        });

      
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

      
        while (true) {
            Thread.sleep(1000);  // Sleep for 150ms to prevent CPU overload
        }
    }
}

