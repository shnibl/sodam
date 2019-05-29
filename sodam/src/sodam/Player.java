package sodam.src.sodam;

public class Player {
	private String name;
	private int numDarts;
	private int score;
	
	public Player(String name, int numDarts) {
		this.name = name;
		this.numDarts = numDarts;
		this.score = 0;
	}
	
	public boolean throwDart() {
		if (numDarts > 0) {
			Dart currentDart = new Dart();
			numDarts--;
			return true;
		} else {
			return false;
		}
	}
	
	public int getScore() {
		return this.score;
	}
	
	public int getDarts() {
		return this.numDarts;
	}
	
	public void setDarts(int numDarts) {
		this.numDarts = numDarts;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
