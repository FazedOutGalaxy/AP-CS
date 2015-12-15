package com.alex.apcs.projects.test_unit8thru11;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class LoopsTestA {
	
	private String word;

	// complete the constructor to initialize instance variable to null
	public LoopsTestA() {
		setWord("Shotgun");
	}

	// complete the constructor to initialize instance variable
	// BY CALLING THE setLoops METHOD
	public LoopsTestA(String word) {
		setWord(word);
	}

	// complete the method below to set instance variable
	// equal to the parameter
	public void setWord(String word) {
		this.word = word;
	}

	// complete the method below which should return the value of
	// the instance variable (word)
	public String getWord() {
		return word;
	}

	// complete the toString() method below which should return
	// a string with all characters required for output shown
	// in the word document. HINT: Use two nested for loops
	// you may use either the substring or the charAt method
	// to build the output string
	public String toString() {
		String output = "";
		byte length = (byte) word.length();
		for (char c : word.toCharArray()) {
			for (int i = 0; i < length; i++) {
				output += c;
			}
			output += "\n";
			length--;
		}
		return output + "\n";
	}
}