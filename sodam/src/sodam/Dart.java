package sodam;

public class Dart {
	private double x1;
	private double y1;
	private double charge;
	private double x2;
	private double y2;
	private double distanceFromMid;
	
	public Dart() {
		//Initialize x and y from the cursor's position
		
		//Initialize charge as a multiple between 0 and 2 depending on the charge bar
		
		//Multiply x1 and x1 by the charge to get x2 and y2
		
		//Get the distance from the middle
		distanceFromMid = calcDistance(x1, x2, y1, y2);
		//Check to see how many points the player gets from the dart throw
		
	}
	
	public static double calcDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public int areaLanded() {
		if (panel.getBounds().contains(x,y)) {
			return -1;
		}
	}
}
