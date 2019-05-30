package sodam;

import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Dart> darts;
	private int score;
	private int numDarts;
	
	public Player(String name, int numDarts) {
		ArrayList<Dart> darts = new ArrayList<Dart>();
		this.name = name;
		this.numDarts = numDarts;
		this.score = 0;
	}
	
	public void throwDart() {
		double newX = cursor.getX();
		double newY = cursor.getY() * chargeBar.getCharge();
		Dart tempDart = new Dart(newX, newY);
		darts.add(tempDart);
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
