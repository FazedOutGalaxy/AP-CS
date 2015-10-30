package com.alex.apcs.projects.ifelse;

public class WordFun {

	private String word;
	
	public WordFun(String word) {
		setWord(word);
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public void makeUppercase() {
		word = word.toUpperCase();
	}
	
	public void addHyphen() {
		word = word.replace(' ', '-');
	}
	
	@Override
	public String toString() {
		return word + "\n";
	}
}
