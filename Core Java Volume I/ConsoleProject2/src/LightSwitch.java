import java.util.Timer;
import java.util.TimerTask;

public class LightSwitch extends TimerTask {
	
	String sColor = "Red";
	int i = 0;
	
	//Initialize timer
	Timer timer = new Timer();
	//Create a 5 second delay to use
	long delay = 5*1000;
	
	public void On() {
		
		System.out.println("ON");
		System.out.println("Default Color Now on --> Red");
		
		//Schedule the task to run based on the timer created (the task referred to here is the one where the user presses "Enter" to exit)
		timer.schedule(new Task(), 0, delay);
		//Run the ColorChange method recursively
		run();
	}
	
	public void Off() {
		System.out.println("OFF");
	}
	
	public void ColorChange() {
		
		if (sColor == "Red") {
			sColor = "Yellow";
			i++;
		}
		
		else {
		
			if (sColor == "Yellow") {
				if (i >= 1) {
				sColor = "Green";
				i--;
				}
				else {
					sColor = "Red";
					i = 0;
				}
			}
			
			else if (sColor == "Green") {
					sColor = "Yellow";
					i--;
			}
		}
		System.out.println("Current Color is " + sColor);
	}
	
	public void run() {
		//Keep changing the traffic light continuously with respect to 4 states
		while(true) {
			if (sColor == "OFF") {
				break;
			}
			if (sColor != "OFF") {
				for (int x = 0; x <= 3; x++) {
					ColorChange();
				}
			}

		}
	}
	
}
