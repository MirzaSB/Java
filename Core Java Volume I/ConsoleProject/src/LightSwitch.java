
public class LightSwitch {
	
	String sColor = "Red";
	int i = 0;
	
	public LightSwitch() {
		System.out.println("Constructing the light switch");
	}
	public void On() {
		System.out.println("ON");
		System.out.println("Default Color Now on --> Red");
	}
	
	public void Off() {
		System.out.println("OFF");
	}
	
	 public static void waiting (int n){
	        
	        long t0, t1;

	        t0 =  System.currentTimeMillis();

	        do{
	            t1 = System.currentTimeMillis();
	        }
	        while ((t1 - t0) < (n * 1000));
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
		
		//Wait for 10 seconds before light is changed
		waiting(10);
		System.out.println("Current Color is " + sColor);
		
	}
	
}
