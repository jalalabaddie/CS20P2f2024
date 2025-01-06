package DefaultPackage;


import com.phidget22.*;

public class LEDBrightness {
    
    public static void main(String[] args) throws Exception {

        
        DigitalOutput redLED = new DigitalOutput();

       
        redLED.setHubPort(1);
       
        redLED.setIsHubPortDevice(true);

       
        redLED.open(1000);

       
        for (double dutyCycle = 0.0; dutyCycle <= 1.0; dutyCycle += 0.1) {
            redLED.setDutyCycle(dutyCycle);
            System.out.println("LED Duty Cycle: " + dutyCycle);
            Thread.sleep(500);  
        }

       
        for (double dutyCycle = 1.0; dutyCycle >= 0.0; dutyCycle -= 0.1) {
            
        	redLED.setDutyCycle(dutyCycle);
           
            System.out.println("LED Duty Cycle: " + dutyCycle);
           
            Thread.sleep(500);  
        }

        
        redLED.setDutyCycle(0.0);
        
        System.out.println("LED Duty Cycle: 0.0:  LED IS OFF");

        
        redLED.close();
    }
}

