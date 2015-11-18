package com.alex.apcs.projects.whileloops;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class LetterRemover {
	private String sentence;
	private char lookFor;

	public LetterRemover() {
		setRemover("413x 1z $w4g", ' ');
	}

	public LetterRemover(String sentence, char lookFor) {
		setRemover(sentence, lookFor);
	}
	
	public void setRemover(String sentence, char lookFor) {
		this.sentence = sentence;
		this.lookFor = lookFor;
	}

	public String removeLetters() {
		String cleaned = sentence;
		int loc = 0;
		while (loc != -1)/*do*/ {
			loc = cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
			loc = cleaned.indexOf(lookFor);
		} //while (loc != -1);
		return cleaned;
	}

	public String toString() {
		return sentence + " - letter to remove " + lookFor;
	}
	
	//@Override
	public void execute() {
		removeLetters();
	}
}