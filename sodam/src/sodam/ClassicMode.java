package sodam;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.*;

public class ClassicMode extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_WIDTH = 400;
	public static final int DEFAULT_HEIGHT = 400;
	private JPanel contentPane;
	
	//Dimensions of the bullseye
	private double xMid;
	private double yMid;
	private double width;
	private int numRings;

	/**
	 * Create the frame.
	 */
	public ClassicMode() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creates players
		Player player1 = new Player("Player 1", 10);
        Player player2 = new Player("Player 2", 10);
		
		JButton btnBackToMenu = new JButton("Back to Menu");
		btnBackToMenu.setBounds(0, 0, 111, 23);
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				close();
		        Menu menu = new Menu();
		        menu.setSize(600, 600);
		        menu.setResizable(false);
		        menu.setVisible(true);
			}
		});
		contentPane.add(btnBackToMenu);
		
		BullseyePanel panel = new BullseyePanel();
		panel.setBounds(128, 137, 300, 300);
		contentPane.add(panel);
		
		Orb panel_1 = new Orb();
		panel_1.setBounds(141, 173, 517, 251);
		contentPane.add(panel_1);
		setTitle("Classic Mode");
		setSize(600, 600);
		
		xMid = panel.getX() + (width / 2);
		yMid = panel.getY() + (width / 2);
		width = panel.getWidth();
		numRings = panel.getNumRings();
	}
	
	public double getXMid() {
		return this.xMid;
	}
	
	public double getYMid() {
		return this.yMid;
	}
	
	public double width() {
		return this.width;
	}
	
	public int getNumRings() {
		return this.numRings;
	}
	
	//Method to properly close the window
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}