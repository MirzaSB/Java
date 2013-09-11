import java.util.Scanner;
import java.util.TimerTask;

public class Task extends TimerTask {
	
	//Create temporary string variable to store System input
	String line = null;
	//Create a new LightSwitch object
	LightSwitch lightSwitch = new LightSwitch();
	
	//When timer from LightSwitch method executes, this code is run
	public void run() {
		Scanner keyIn = new Scanner(System.in);
		while ((line = keyIn.nextLine( )).length( ) == 0)    
        {   
			//Turn off the traffic light (call the method)
			lightSwitch.Off();
			//Close the process from JVM
			System.exit(-1);
        } 			
	}
}