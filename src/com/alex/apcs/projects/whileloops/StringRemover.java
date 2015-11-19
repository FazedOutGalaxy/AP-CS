package com.alex.apcs.projects.whileloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class StringRemover {
	private String sentence;
	private String remove;
	
	public StringRemover() {}
	
	public StringRemover(String sentence, String remove) {
		setRemover(sentence, remove);
	}
	
	public void setRemover(String sentence, String remove) {
		this.sentence = sentence;
		this.remove = remove;
	}

	public String removeStrings() {
		String cleaned = sentence;
		int loc = cleaned.indexOf(remove);
		while (loc > 0) {
			cleaned = cleaned.substring(0, loc - 1) + cleaned.substring(loc + remove.length());
			loc = cleaned.indexOf(remove);
		}
		return cleaned;
		//return sentence.replaceAll("[.]" + remove.replace("-", "\\-"), "");
	}

	public String toString() {
		return sentence + " - String to remove " + remove + "\n" + removeStrings();
	}
}