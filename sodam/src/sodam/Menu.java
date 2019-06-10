package sodam;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Menu extends JFrame {
	
	private JFrame frame;
	
	//Create the application.
	public Menu() {
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel = new JLabel("Sodam Drunken Darts");
		
		JButton btnNewButton = new JButton("Classic Mode");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Swap to classic mode screen
				close();
		        ClassicMode classic = new ClassicMode();
		        classic.setSize(600, 600);
		        classic.setResizable(false);
		        classic.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Sugar Rush Mode");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Swap to sugar rush mode screen
				close();
		        SugarRushMode sugar = new SugarRushMode();
		        sugar.setSize(600, 600);
		        sugar.setResizable(false);
		        sugar.setVisible(true);
			}
		});
		
		JButton btnHowToPlay = new JButton("How to Play");
		btnHowToPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				//Swap to classic mode screen
				close();
		        HowToPlay howtoplay = new HowToPlay();
		        howtoplay.setSize(600, 600);
		        howtoplay.setResizable(false);
		        howtoplay.setVisible(true);
			}
		});
		
		JButton drawButton = new JButton("Drawing Mode");
		drawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
		        DrawingMode draw = new DrawingMode();
		        draw.setSize(600, 600);
		        draw.setResizable(false);
		        draw.setVisible(true);
			}
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(56)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(drawButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnHowToPlay, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(44)
					.addComponent(btnNewButton_1)
					.addGap(69))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(178)
					.addComponent(btnHowToPlay)
					.addGap(61)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(lblNewLabel)
						.addComponent(btnNewButton))
					.addGap(39)
					.addComponent(drawButton)
					.addContainerGap(192, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		initialize();
	}
	
	//Method to properly close the window
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}

	//Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		frame.setVisible(false);
		frame.setSize(600, 600);
	}
}
