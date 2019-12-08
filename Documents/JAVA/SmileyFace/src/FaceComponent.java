import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FaceComponent extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public void drawing() {
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		drawSmiley(g, 40, 30, 300);
	}

	private void drawSmiley(Graphics g, int x, int y, int s) {
		Graphics copy = g.create();
		copy.translate(x, y);
		copy.setColor((Color.YELLOW));
		copy.fillOval(0, 0, s, s);
		copy.setColor((Color.blue));
		copy.fillOval((int) (1 + s * .3), (int) (1 + s * .3), (int) (s * .10),
				(int) (s * .10));
		copy.fillOval((int) ((1 + s * .7) - (s * .10)), (int) (1 + s * .3),
				(int) (s * .10), (int) (s * .10));

		double width = s * 0.7;
		double height = s * 0.7;

		copy.drawArc((int) ((s - width) / 2d), (int) ((s - height) / 2d),
				(int) width, (int) height, 0, -180);
		copy.dispose();
	}
}
