package sodam;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;

public class Orb extends JPanel implements KeyListener {
	
	private int x = 0, y = 0, velY = 10, height = 10;
	private double charge = 0;
	
	public Orb() {
		setSize(new Dimension(100, 100));
		setPreferredSize(new Dimension(100, 100));
		setFocusable(false);
		addKeyListener(this);
		setLayout(null);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.RED);
		g.fillRect(x, y, 100, height);
		
		repaint();
	}
	
	public void space() {
		y += velY;
		if (y < 0 || y > getHeight() - height) {
			velY = -velY;
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		charge = (y - getY()) / 100;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public double getCharge() {
		return this.charge;
	}
}




