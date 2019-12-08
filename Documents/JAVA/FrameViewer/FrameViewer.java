import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameViewer {


	public static void main(String[] args) {
	    JFrame frame = new JFrame();
		
		
		JButton button = new JButton("Click me!");
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);		
		JLabel label = new JLabel("Hello, World!");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		
		frame.setSize(300, 400);
		frame.setTitle("FrameViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);


	}


}
