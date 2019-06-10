package sodam;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
class BullseyePanel extends JPanel
{
	final int MAX_WIDTH = 300, NUM_RINGS = 5, RING_WIDTH = 25;
   //-----------------------------------------------------------------
   //  Paints a bullseye target.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      int x = 0, y = 0, diameter;

      setBackground (Color.red);

      diameter = MAX_WIDTH;
      page.setColor (Color.white);

      for (int count = 0; count < NUM_RINGS; count++)
      {
         if (page.getColor() == Color.black)  // alternate colors
            page.setColor (Color.white);
         else
            page.setColor (Color.black);

         page.fillOval (x, y, diameter, diameter);

         diameter -= (2 * RING_WIDTH);
         x += RING_WIDTH;
         y += RING_WIDTH;
      }

      // Draw the red bullseye in the center
      page.setColor (Color.red);
      page.fillOval (x, y, diameter, diameter);
   }
   
   public int getNumRings() {
	   return this.NUM_RINGS;
   }
}