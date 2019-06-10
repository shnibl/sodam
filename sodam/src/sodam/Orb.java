package sodam;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;

public class Orb extends JPanel implements KeyListener {
	
	private int x, velY, height, y;
	
	public Orb() {
		setSize(new Dimension(100, 100));
		setPreferredSize(new Dimension(100, 100));
		setFocusable(false);
		addKeyListener(this);
		setLayout(null);
		
		x = 0;
		velY = -5;
		height = 10;
		y = getY() + getHeight() - height;
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.GREEN);
		g.fillRect(0, getHeight() / 2 - 5, 100, 10);
		
		g.setColor(Color.RED);
		g.fillRect(x, y, 100, height);
		
		repaint();
	}
	
	public void space() {
		y += velY;
		if (y <= 0 || y >= getHeight() - height) {
			velY = -velY;
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	public int getRectX() {
		return this.x;
	}
	
	public int getRectY() {
		return this.y;
	}
	
	public int getRectHeight() {
		return this.height;
	}
	
	public int getVelY() {
		return this.velY;
	}
	
	public void setRectX(int x) {
		this.x = x;
	}
	
	public void setRectY(int y) {
		this.y = y;
	}
	
	public void setRectHeight(int height) {
		this.height = height;
	}
	
	public void setVelY(int velY) {
		this.velY = velY;
	}
}




