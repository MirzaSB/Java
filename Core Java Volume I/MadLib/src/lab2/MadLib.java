package lab2;

import java.util.ArrayList;

public class MadLib extends MadLibTemplate {
		
	private ArrayList<MadLibEntry> mlList = new ArrayList<MadLibEntry>();
	private StringBuilder sb = new StringBuilder();
	private String mTitle;

	public MadLib(String title) {
		
		super(title);
		mTitle = title;
		
		System.out.println(mTitle + '\u0020' + "MadLib");
		
	}


	void addString(String text) {
	  /**
	   *
	   * Add boilerplate text to this.
	   *
	   **/

		mlList.add(new TextEntry(text));
		
	}


	void addSlot(String type) {
	  /**
	   *
	   * Add a slot of the given type to this.
	   *
	   **/
		
		mlList.add(new Slot(type));
	}

	
	void printAsTemplate(UserInterface ui) {
		
	  /**
	   *
	   * Print out the mad lib as a template.
	   *
	   * This is for debugging purposes; print out the mad lib with the
	   * slot type names substituted instead of slots. For example, a lib
	   * containing the text entry "Hi," followed by a slot with type name
	   * "proper noun" would print out ``Hi, -proper noun-''.
	   *
	   **/
		
		sb.setLength(0);
		
		for (int i = 0; i < mlList.size(); i++) {
			sb.append(mlList.get(i).templateString());
		}
		
		System.out.println(sb);

	}


	void doLib(UserInterface ui) {
	  /**
	   *
	   * Ask the user for words for each slot, in order, then substitute
	   * the words in, and print out the lib.
	   *
	   * This function should prompt the user 
	   *
	   **/
		
		sb.setLength(0);
		
		for (int i = 0; i < mlList.size(); i++) {
				mlList.get(i).doLib(ui);
		}
		
			
		for (int i = 0; i < mlList.size(); i++) {
			sb.append(mlList.get(i).madLibString());
		}
		
		System.out.println(sb);
			
	}
  
}


