package sodam;

public class BullseyeFrame {
	public BullseyeFrame() {
		setTitle("Bullseye");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		BullseyePanel panel = new BullseyePanel();
		getContentPane().add(panel);
	}
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 400;
}

