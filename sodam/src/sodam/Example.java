package sodam;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Example extends JFrame {

	public Example() {
		setTitle("Test");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		ex.setVisible(true);
	}
}
