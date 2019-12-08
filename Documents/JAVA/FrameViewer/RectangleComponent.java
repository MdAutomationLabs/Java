import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
  public void paintComponent(Graphics g)
  {
    // Drawing instructions go here
	  g.setColor(Color.BLUE);
	  g.fillRect(0, 10, 200, 10);
	  g.setColor(Color.GREEN);
	  g.fillRect(200, 10, 400, 10);
	  g.setColor(Color.CYAN);
	  g.drawString("Message", 50, 100);
	 
  }
}
