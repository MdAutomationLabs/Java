

import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

 
public class Counter   {

	
	    public static void addComponentsToPane(Container pane) {
	        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	    addAButton("Section 1", pane);
	    addAButton("Section 2", pane);
	    addAButton("Section 3", pane);
	    addAButton("Section 4", pane);
	    addAButton("Section 5", pane);
	    addAButton("Section 6", pane);
	    addAButton("Section 7", pane);
	    addAButton("Section 8", pane);
	    addAButton("Section 9", pane);
	}

	private static void addAButton(String text, Container container) {
	    JButton button = new JButton(text);
	    button.setAlignmentX(Component.CENTER_ALIGNMENT);
	    container.add(button);
	}

}


