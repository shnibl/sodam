import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;

public class HowToPlay extends JFrame {

	public HowToPlay() {
		
		JLabel lblSodamDrunkenDarts = new JLabel("SODAM Drunken Darts - How to Play");
		
		JLabel lblUseTheArrow = new JLabel("Use the Arrow Keys to move the cursor.");
		
		JLabel lblPressAndHold = new JLabel("Press and hold the spacebar to charge your throw.");
		
		JLabel lblGameEndsAfter = new JLabel("Game ends after each player has thrown 10 darts.");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSodamDrunkenDarts)
						.addComponent(lblUseTheArrow)
						.addComponent(lblPressAndHold)
						.addComponent(lblGameEndsAfter))
					.addContainerGap(329, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSodamDrunkenDarts)
					.addGap(18)
					.addComponent(lblUseTheArrow)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPressAndHold)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblGameEndsAfter)
					.addContainerGap(464, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
}