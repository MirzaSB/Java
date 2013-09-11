import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/** 
 * This program demonstrates the use of inner classes
 */

public class InnerClassTest {
	
	public static void main(String[] args) {
		
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		//Keep program running until user selects "ok"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock {
	/**
	 * Constructs a talking clock
	 */
	
	public TalkingClock (int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * Starts the clock
	 */
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	private int interval;
	private boolean beep;
	
	public class TimePrinter implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			if (beep)
				Toolkit.getDefaultToolkit().beep();
		}
	}
}