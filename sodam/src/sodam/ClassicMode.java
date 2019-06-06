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
	private int p1Score;
	private int p2Score;
	private ArrayList<JLabel> dartGraphics;
	private ArrayList<Dart> darts;
	private boolean isplayer1turn = true;
	private boolean isplayer2turn = false;
	private int player1shots = 0;
	private int player2shots = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassicMode frame = new ClassicMode();
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
		cursor.setBounds(89, 375, 29, 29);
		contentPane.add(cursor);
		
		BullseyePanel panel = new BullseyePanel();
		panel.setBounds(128, 137, 300, 300);
		contentPane.add(panel);
		
		Orb panel_1 = new Orb();
		panel_1.setBounds(450, 112, 100, 350);
		contentPane.add(panel_1);
		
		JLabel lblPlayerScore = new JLabel("Player 1 Score: " + player1.getScore());
		lblPlayerScore.setBounds(89, 490, 156, 14);
		contentPane.add(lblPlayerScore);
		
		JLabel lblPlayerScore_1 = new JLabel("Player 2 Score: " + player2.getScore());
		lblPlayerScore_1.setBounds(367, 490, 156, 14);
		contentPane.add(lblPlayerScore_1);
		setTitle("Classic Mode");
		setSize(600, 600);
		
		width = panel.getWidth();
		xMid = panel.getX() + (width / 2);
		yMid = panel.getY() + (width / 2);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ev) {
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
				if (keycode == KeyEvent.VK_M) {
					if( (isplayer1turn == true) && (player1shots <11) ) {
						JLabel newDart = new JLabel("");
						newDart.setBounds(cursor.getX(), cursor.getY(), 20, 20);
						newDart.setIcon(new ImageIcon("images/p1dart.png"));
						getContentPane().add(newDart);
						Dart dart = new Dart(cursor.getX(), cursor.getY());
						//Adds to player's score
						player1.setScore(p1Score += dart.getScore(dart.areaLanded()));
						lblPlayerScore.setText("Player 1 Score: " + player1.getScore());
						player1shots++;
					}
					if(player1shots > 9) {
						isplayer2turn = true;
						isplayer1turn = false;
					}
					if( (isplayer2turn == true)&& (player2shots <11) ) {
					JLabel newDart = new JLabel("");
					newDart.setBounds(cursor.getX(), cursor.getY(), 20, 20);
					newDart.setIcon(new ImageIcon("images/p2dart.png"));
					getContentPane().add(newDart);
					Dart dart = new Dart(cursor.getX(), cursor.getY());
					//Adds to player's score
					player2.setScore(p2Score += dart.getScore(dart.areaLanded()));
					lblPlayerScore_1.setText("Player 2 Score: " + player2.getScore());
					player2shots++;
					//darts.add(dart);
					//dartGraphics.add(newDart);
					}
					if(player2shots > 9) {
						isplayer2turn = false;
						isplayer1turn = false;
					}
				}
			}
		});
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
	
	//Method to properly close the window
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}