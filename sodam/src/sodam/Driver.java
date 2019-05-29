package sodam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Driver extends JFrame {

	//Example constructor
    public Driver() {
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
       classicMode.setBounds(200, 60, 200, 30);
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

       //Creates game window
       setTitle("Sodam Drunken Darts");
       setSize(600, 600);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
    }

    public static void main(String[] args) {
           Driver window = new Driver();
           window.setVisible(true);
    }
}