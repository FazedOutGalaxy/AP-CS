package com.alex.apcs.projects.references.list.runners;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.references.list.Words;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class WordsRunner extends ApcsProject {
	
	private static final WordsRunner instance = new WordsRunner();
	
	public static void main(String[] args) {
		instance.execute();
	}
	
	@Override
	public void execute() {
		Words test = new Words("one two three four five six seven alligator");
		printLine(test);
		printLine("word with 2 vowels = " + test.countWordsWithXVowels(2));
		printLine("word with 3 vowels = " + test.countWordsWithXVowels(3));
		printLine("word with 4 vowels = " + test.countWordsWithXVowels(4));
		printLine("word with 2 chars = " + test.countWordsWithXChars(2));
		printLine("word with 3 chars = " + test.countWordsWithXChars(3));
		printLine("word with 4 chars = " + test.countWordsWithXChars(4));
		printLine("word with 5 chars = " + test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3);
		printLine("\nafter removing words with 3 chars \n" + test);
		printLine("\nnumber of vowels in the words removed == "
				+ vowelsRemoved);
		printLine("\n\n");
	}
}