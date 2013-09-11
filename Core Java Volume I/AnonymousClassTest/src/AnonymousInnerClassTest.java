import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * this program demonstrates anonymous inner classes
 */

public class AnonymousInnerClassTest {
	
	public static void main (String[] args) {
		
		TalkingClock clock = new TalkingClock();
		clock.start(100, true);
		
		//Keep the program running until the user selects "Ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock {
	
	/**
	 * Starts the clock
	 * @param interval --> The interval between messages (in milliseconds)
	 * @param beep --> true if the clock should beep
	 */
	
	public void start (int interval, final boolean beep) {
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep) Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t = new Timer (interval, listener);
		t.start();
	}
}