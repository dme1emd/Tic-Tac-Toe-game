package tp1;

public class Case {
	public void remplir(char content) {
		if(content == 111 || content == 120) {
			this._content = content;
			this._full = true;
			return;
		}
		System.out.println("only x and o are valid");
	}
	public boolean isFull() {
		return this._full;
	}
	public char getContent() {
		return this._content;
	}
	private boolean _full = false;
	private char _content = '.';
}
