import java.awt.Graphics;

import javax.swing.JPanel;

public class Render extends JPanel{

	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		FlappyBird.flappyBird.repaint(g);
	}
}
