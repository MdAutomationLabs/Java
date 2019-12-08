import java.awt.Container;

import javax.swing.JFrame;


public class CounterViewer {
	private static void createAndShowGUI() {

	    JFrame frame = new JFrame("Counter");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	    addComponentsToPane(frame.getContentPane());

	    frame.pack();
	    frame.setVisible(true);
	}

	private static void addComponentsToPane(Container contentPane) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	            createAndShowGUI();
	        }
	    });
	}
	}

