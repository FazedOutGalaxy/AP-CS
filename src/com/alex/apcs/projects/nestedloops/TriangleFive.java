package com.alex.apcs.projects.nestedloops;

import com.alex.apcs.utils.random.UtilRandomBoolean;
import com.alex.apcs.utils.random.UtilRandomChar;
import com.alex.apcs.utils.random.UtilRandomNumbers;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class TriangleFive {

	private char letter;
	private int amount;
	
	public TriangleFive() {
		if (UtilRandomBoolean.getRandomBoolean())
			setLetter(UtilRandomChar.getRandomChar('A', 'Z'));
		else
			setLetter(UtilRandomChar.getRandomChar('a', 'z'));
		setAmount(UtilRandomNumbers.getRandomInteger(1, 5));
	}
	
	public TriangleFive(char letter, int amount) {
		setLetter(letter);
		setAmount(amount);
	}
	
	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String to = "";
		char letter = this.letter;
		int amount = this.amount;
		for (int times = 0; times < amount; times++) {
			for (int i = 0; i < amount; i++) {
				for (int a = amount; a > i; a--) {
					to += (char) (letter + i);
				}
				to += " ";
			}
			amount--;
			to += "\n";
		}
		return to;
	}
}
