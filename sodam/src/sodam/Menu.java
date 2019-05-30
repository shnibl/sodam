package sodam;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

public class Menu extends JFrame {

	private BufferedImage menuImage;
	private JFrame frame;
	
	//Create the application.
	public Menu() {
    	try {
    		menuImage = ImageIO.read(new File("images/menu.jpg"));
    	} catch (IOException ex) {
    		System.out.println(ex);
    	}
    	
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Classic Mode");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("ULTRA EXTREME MODE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(menuImage));
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
