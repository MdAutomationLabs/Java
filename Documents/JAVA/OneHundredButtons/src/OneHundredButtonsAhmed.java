import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OneHundredButtonsAhmed {

	public static void main(String[] args) {
		// Md Ahmed

		JLabel label = new JLabel("Md Ahmed");
		JPanel panel = new JPanel();
		panel.add(label);
		for (int i = 1; i < 101; i++) {
			String buttonLabel = String.valueOf(i);
			JButton button = new JButton(buttonLabel);
			panel.add(button);
		}

		

		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setSize(700, 400);
		frame.setTitle("A frame with a repeating components ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
