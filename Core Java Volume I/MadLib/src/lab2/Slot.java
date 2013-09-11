package lab2;

class Slot implements MadLibEntry {
	
	private String sSlotElement;
	private String sSlotReplacement;
	
	public Slot (String sSlot) {
		this.sSlotElement = sSlot;
		templateString();
	}
	
	public String templateString() {
		/** @return the value of this entry in a template **/
		if (sSlotElement.indexOf("<") == -1) {
			sSlotElement = "<" + sSlotElement + ">";
		}
		return sSlotElement;
	}

	public String madLibString() {
		/** @return the value of this entry in an actual madlib **/
		
		if (sSlotElement.indexOf("<") > -1)
			sSlotReplacement = sSlotElement.substring(0, sSlotElement.indexOf('<')) + sSlotReplacement + sSlotElement.substring(sSlotElement.indexOf('>')+1);
		
		return sSlotReplacement;
	}

	public void doLib(UserInterface ui) {
		
		if (sSlotReplacement == null) {
			sSlotReplacement = ui.promptUser("Please enter the " + sSlotElement + ":");
			madLibString();
		}	
		
	}
	
}