package lab2;

class TextEntry implements MadLibEntry {
	
	private String sTextElement;
	
	public TextEntry(String sText) {
		this.sTextElement = sText;
		templateString();
	}
	
	public String templateString() {
		/** @return the value of this entry in a template **/
		return sTextElement;
	}

	public String madLibString() {
		/** @return the value of this entry in an actual madlib **/

		return sTextElement;
	}

	public void doLib(UserInterface ui) {
		
		//ui.writeString(sTextElement);
		
	}
	
}