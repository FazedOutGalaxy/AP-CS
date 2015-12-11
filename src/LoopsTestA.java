
public class LoopsTestA {
	
	private String word;
	
	public LoopsTestA() {
		setWord("AlexIzSwag");
	}
	
	public LoopsTestA(String word) {
		setWord(word);
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	@Override
	public String toString() {
		String to = "";
		byte l = (byte) word.length();
		for (char c : word.toCharArray()) {
			for (byte i = 0; i < l; i++) {
				to += c;
			}
			l--;
			to += "\n";
		}
		return to;
	}
}
