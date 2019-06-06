package sodam;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Dart {
	private int x1;
	private int y1;
	private double charge;
	private int x2;
	private int y2;
	private double distanceFromMid;
	
	private int xMid;
	private int yMid;
	private double width;
	private int numRings;
	private double ringWidth;
	
	private int scoreArea;
	private int score;
	
	public Dart(double x, double y) {
		ClassicMode dimensions = new ClassicMode();
		
		//Initialize variables
		xMid = dimensions.getXMid();
		yMid = dimensions.getYMid();
		width = dimensions.getWidth();
		numRings = 5; //5 rings on the dartboard
		ringWidth = (width / 2) / (numRings + 1);
		
		
		//Initialize x and y from the cursor's position
		x1 = x;
		y1 = y;
		
		//Initialize charge as a multiple between 0 and 2 depending on the charge bar
		charge = y2; //placeholder; will eventually be something like chargebar.getCharge();
		
		//Multiply x1 and x1 by the charge to get x2 and y2
		x2 = x1;
		y2 = charge;
		
		//Get the distance from the middle
		distanceFromMid = calcDistance(xMid, yMid, x2, y2);
		
		//Check to see how many points the player gets from the dart throw
		scoreArea = areaLanded();
		score = getScore(scoreArea);
		System.out.println("You landed in " + scoreArea + " and scored " + score + " points");
	}
	
	public static double calcDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public int areaLanded() {
		for (int i = 0; i < (numRings + 1); i++) {
			if (distanceFromMid < ringWidth * (i + 1)) {
				return i;
			}
		}
		return -1;
	}
	
	public int getScore(int scoreArea) {
		switch (scoreArea) {
			case 0:
				return 100;
			case 1:
				return 75;
			case 2:
				return 50;
			case 3:
				return 25;
			case 4:
				return 10;
			case 5:
				return 5;
			default:
				return 0;
		}
	}
	
	public int getX() {
		return this.x1;
	}
	
	public int getY() {
		return this.y1;
	}
	
	public void setX(int x) {
		this.x2 = x;
	}
	
	public void setY(int y) {
		this.y2 = y;
	}
}
