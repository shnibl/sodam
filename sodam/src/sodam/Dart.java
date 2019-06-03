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
	
	private int scoreArea;
	
	public Dart() {
		//Initialize x and y from the cursor's position
		
		//Initialize charge as a multiple between 0 and 2 depending on the charge bar
		
		//Multiply x1 and x1 by the charge to get x2 and y2
		
		//Get the distance from the middle
		distanceFromMid = calcDistance(xMid, x2, yMid, y2);
		//Check to see how many points the player gets from the dart throw
		scoreArea = areaLanded();
		
	}
	
	public static double calcDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public int areaLanded() {
		if (distanceFromMid < 25) {
			return 0;
		} else if (distanceFromMid < 50) {
			return 1;
		} else if (distanceFromMid < 75) {
			return 2;
		} else if (distanceFromMid < 100) {
			return 3;
		} else if (distanceFromMid < 125) {
			return 4;
		} else if (distanceFromMid < 150) {
			return 5;
		} else {
			return -1;
		}
	}
}
