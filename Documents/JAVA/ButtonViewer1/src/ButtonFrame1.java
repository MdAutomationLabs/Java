import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonFrame1 extends JFrame {
	

		private JButton button;
	
		private static final int FRAME_WIDTH = 300;
		private static final int FRAME_HEIGHT = 100;

		public void FilledFrame() {
			createComponents();
			setSize(FRAME_WIDTH, FRAME_HEIGHT);
		}

		private void createComponents() {
			button = new JButton("Click me!");
			this.add(button);
			
			

		}
	}



	
