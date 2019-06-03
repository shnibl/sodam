package sodam;

public class Dart {
	private double x1;
	private double y1;
	private double charge;
	private double x2;
	private double y2;
	private double distanceFromMid;
	
	private double xMid;
	private double yMid;
	private double width;
	private int numRings;
	private double ringWidth;
	
	private int scoreArea;
	
	public Dart(double x, double y) {
		xMid = 190; //frame.getXMid();
		yMid = 184; //frame.getYMid();
		width = 300; //frame.getWidth();
		numRings = 5; //frame.getNumRings();
		ringWidth = (width / 2) / (numRings + 1);
		//Initialize x and y from the cursor's position
		x1 = x;
		y1 = y;
		//Initialize charge as a multiple between 0 and 2 depending on the charge bar
		charge = 1;
		//Multiply x1 and x1 by the charge to get x2 and y2
		x2 = x1;
		y2 = y1 * charge;
		//Get the distance from the middle
		distanceFromMid = calcDistance(xMid, yMid, x2, y2);
		//Check to see how many points the player gets from the dart throw
		scoreArea = areaLanded();
		System.out.println("You landed in " + scoreArea);
	}
	
	public static double calcDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public int areaLanded() {
		if (distanceFromMid < ringWidth) {
			return 0;
		} else if (distanceFromMid < ringWidth * 2) {
			return 1;
		} else if (distanceFromMid < ringWidth * 3) {
			return 2;
		} else if (distanceFromMid < ringWidth * 4) {
			return 3;
		} else if (distanceFromMid < ringWidth * 5) {
			return 4;
		} else if (distanceFromMid < ringWidth * 6) {
			return 5;
		} else {
			return -1;
		}
	}
}
