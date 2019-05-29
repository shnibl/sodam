package sodam;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Dart> darts;
	private int score;
	private int numDarts;
	
	public Player(String name, ArrayList<Dart> darts) {
		this.name = name;
		this.darts = darts;
		this.numDarts = darts.size();
		this.score = 0;
	}
	
	public boolean throwDart() {
		if (darts.size() - 1 > 0) {
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
