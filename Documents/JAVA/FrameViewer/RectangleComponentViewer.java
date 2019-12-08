import javax.swing.JComponent;
import javax.swing.JFrame;

public class RectangleComponentViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(300, 400);
		frame.setTitle("Playing with components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent component = new RectangleComponent();
		frame.add(component);

		frame.setVisible(true);

	}

}
