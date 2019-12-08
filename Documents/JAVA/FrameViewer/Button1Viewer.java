import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Button1Viewer extends JFrame {
	final int FIELD_WIDTH = 10;
	private JButton button;
	private JLabel label;
	private JTextField textField;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;

	public Button1Viewer() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	private void createComponents() {
		button = new JButton("Click me!");
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		label = new JLabel(" ");
		
		textField = new JTextField(FIELD_WIDTH);
		
		JPanel panel = new JPanel(); // need a panel to hold components
		panel.add(button); // add to the panel
		panel.add(label);
		panel.add(textField);
		
		add(panel); // add panel to the Frame
	
	}

	public class ClickListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String input = textField.getText();
			int EFScale = 0; 
			try {
			  EFScale = Integer.parseInt(input); 
			  label.setText("I was clicked to get " + EFScale);
			} catch (NumberFormatException e1){
				label.setText("invalid input");
			}
			
		}
	}
}
