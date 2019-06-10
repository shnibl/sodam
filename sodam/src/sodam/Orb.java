package sodam;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Orb extends JPanel {
	
	private int x, velY, height, y, yMid;
	
	public Orb() {
		setSize(new Dimension(100, 100));
		setPreferredSize(new Dimension(100, 100));
		setFocusable(false);
		setLayout(null);
		
		x = 0;
		velY = -5;
		height = 10;
		y = getY() + getHeight() - height;
		yMid = y + (height / 2);
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
		yMid = y + (height / 2);
		if (y <= 0 || y >= getHeight() - height) {
			velY = -velY;
		}
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
	
	public int getYMid() {
		return this.yMid;
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




