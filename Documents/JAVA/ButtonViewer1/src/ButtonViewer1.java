import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButtonViewer1 {

	public static void main(String[] args) {
		// Md Ahmed
		    JFrame frame = new JFrame();
			
			
			JButton button = new JButton("Click me!");
			JButton button2 = new JButton("Click me!");
			ActionListener listener = new ClickListener();
			button.addActionListener(listener);	
			ActionListener listener2 = new ClickListener();
			button2.addActionListener(listener2);
			JLabel label = new JLabel("Hello, World!");
			JLabel label2 = new JLabel("Hello, World!");
			JPanel panel = new JPanel();
	
			panel.add(button);
			panel.add(label);
			panel.add(button2);
			panel.add(label2);
			frame.add(panel);
			
			frame.setSize(400, 400);
			frame.setTitle("FrameViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);


		}


	}
	


