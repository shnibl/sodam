package sodam;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DrawingMode extends JFrame {
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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawingMode frame = new DrawingMode();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DrawingMode() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creates players
		Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
		
		JButton btnBackToMenu = new JButton("Back to Menu");
		//btnBackToMenu.setEnabled(false);
		btnBackToMenu.setFocusable(false);
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
		
		JLabel cursor = new JLabel("");
		cursor.setIcon(new ImageIcon("images/cursor.png"));
		cursor.setBounds(265, 275, 29, 29);
		contentPane.add(cursor);
		setTitle("Drawing Mode");
		setSize(600, 600);
		
		//Check for keyboard input
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ev) {
				System.out.println(cursor.getX() + " " + cursor.getY());
				int keycode = ev.getKeyCode();
				// Move Up
				if (keycode == KeyEvent.VK_W) {
					cursor.setLocation(cursor.getX(), cursor.getY() - 10);
				}
				//Move Left
				if (keycode == KeyEvent.VK_A) {
					cursor.setLocation(cursor.getX() - 10, cursor.getY());
				}
				//Move Down
				if (keycode == KeyEvent.VK_S) {
					cursor.setLocation(cursor.getX(), cursor.getY() + 10);
				}
				//Move Right
				if (keycode == KeyEvent.VK_D) {
					cursor.setLocation(cursor.getX() + 10, cursor.getY());
				}
				//Shooting function, adds a dart to the board
				if (keycode == KeyEvent.VK_SPACE) {
					//Create dart graphic and dart at cursor location
					JLabel newDart = new JLabel("");
					newDart.setBounds(cursor.getX(), cursor.getY(), 30, 30);
					newDart.setIcon(new ImageIcon("images/pixel.png"));
					getContentPane().add(newDart);
				}
			}
		});
	}
	
	//Method to properly close the window
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}