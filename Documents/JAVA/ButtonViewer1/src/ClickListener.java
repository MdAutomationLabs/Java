import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

	int clicked = 0;

	public void actionPerformed(ActionEvent e) {

		clicked++;
		System.out.println("You have clicked " + clicked + " times.");
	}
}
