package sodam;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class HowToPlay extends JFrame {

	public HowToPlay() {
		
		JLabel lblSodamDrunkenDarts = new JLabel("SODAM Drunken Darts - How to Play");
		
		JLabel lblUseTheArrow = new JLabel("Use the WASD Keys to move the cursor.");
		
		JLabel lblPressAndHold = new JLabel("Press and hold the spacebar to charge your throw.");
		
		JLabel lblGameEndsAfter = new JLabel("Game ends after each player has thrown 10 darts.");
		
		JLabel lblClassicModeRules = new JLabel("Classic Mode Rules");
		
		JLabel lblThePlayerWith = new JLabel("The Player with the highest score wins.");
		
		JLabel lblSugarRushMode = new JLabel("Sugar Rush Mode Rules");
		
		JLabel lblCurrentlyUnderDevelopment = new JLabel("Currently under development, check back at a later date.");
		
		JLabel lblPlayersTakeTurns = new JLabel("Players take turns throwing darts.");
		
		JButton btnBackToMenu = new JButton("Back to Menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
		        Menu menu = new Menu();
		        menu.setSize(600, 600);
		        menu.setResizable(false);
		        menu.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSodamDrunkenDarts)
								.addComponent(lblUseTheArrow)
								.addComponent(lblPressAndHold)
								.addComponent(lblClassicModeRules)
								.addComponent(lblPlayersTakeTurns)
								.addComponent(lblGameEndsAfter)
								.addComponent(lblThePlayerWith)
								.addComponent(lblSugarRushMode)
								.addComponent(lblCurrentlyUnderDevelopment)))
						.addComponent(btnBackToMenu, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(298, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(btnBackToMenu, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSodamDrunkenDarts)
					.addGap(18)
					.addComponent(lblUseTheArrow)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPressAndHold)
					.addGap(18)
					.addComponent(lblClassicModeRules)
					.addGap(18)
					.addComponent(lblPlayersTakeTurns)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblGameEndsAfter)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblThePlayerWith)
					.addGap(18)
					.addComponent(lblSugarRushMode)
					.addGap(18)
					.addComponent(lblCurrentlyUnderDevelopment)
					.addContainerGap(281, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	//Method to properly close the window
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
}