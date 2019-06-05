

package sodam;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.border.BevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Cursor;

public class Orb extends JPanel {

	private boolean isGoingUp = true;
	private int x;
	private int y;
	
	/**
	 * Create the panel.
	 */
	public Orb() {
		setBackground(Color.LIGHT_GRAY);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel_1.setBackground(Color.RED);
		panel_1.setForeground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(205, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(320)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//the logic behind the chargebars movement
		/*public static void paint(Graphics g) {
			g.fillRect(0, 0, 200, 300);
			repaint();
		}*/
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				int key = evt.getKeyCode();
				repaint();
				if (key == KeyEvent.VK_E) {
					System.out.println("Key event has been checked");
					if( (panel_1.getY() < panel.getY() ) && (isGoingUp== true) ) {
					panel_1.setLocation(panel_1.getLocation().x, panel_1.getLocation().y+1);
					repaint();
					}
					else if( panel_1.getY() == panel.getY()) {
						isGoingUp = false;
					repaint();
						
					}
					else if(panel_1.getY() < panel.getY() && isGoingUp ==false) {
						panel_1.setLocation(panel_1.getLocation().x, panel_1.getLocation().y-1);
						repaint();
					}
				}
			}
	});
}
}


