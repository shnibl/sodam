package sodam;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Menu extends JFrame {

	//Images
	private BufferedImage menuImage;
	
	//Driver constructor
    public Menu() {
    	//Read images with required try and catch
    	try {
    		menuImage = ImageIO.read(new File("images/menu.jpg"));
    	} catch (IOException ex) {
    		System.out.println(ex);
    	}
    	
    	//Create window
        initUI();
    }

    public final void initUI() {

       //Creates new panel
       JPanel panel = new JPanel();
       getContentPane().add(panel);

       //Allows to position buttons freely
       panel.setLayout(null);

       //Classic Mode Button
       JButton classicMode = new JButton("Classic Mode");
       classicMode.setBounds(50, 60, 200, 30);
       classicMode.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               System.exit(0);
          }
       });
       
       JButton quitButton = new JButton("Quit");
       quitButton.setBounds(50, 60, 80, 30);
       quitButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               System.exit(0);
          }
       });
       
       //Adds buttons to panel
       panel.add(quitButton);
       panel.add(classicMode);

       //Add an image
       JLabel picLabel = new JLabel(new ImageIcon(menuImage));
       add(picLabel);
       
       //Creates game window
       setTitle("Sodam Drunken Darts");
       setSize(600, 600);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
    }
    
    public void setVisible() {
    	this.setVisible(true);
    }
    
    public void setInvisible() {
    	this.setVisible(false);
    }
}