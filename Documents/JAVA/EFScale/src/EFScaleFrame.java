import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EFScaleFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	final int FIELD_WIDTH = 10;
	EFScale account;
	EFScaleComponent poly1;
	
	JLabel amount = new JLabel("Please enter a windspeed:");
	JTextField amountField = new JTextField(FIELD_WIDTH);
	JButton deposit = new JButton("Submit:");
	
	 JLabel efScale = new JLabel();
	
	
	public EFScaleFrame(EFScale b) {
		account = b;
		poly1 = new EFScaleComponent(new int[]{150,250,325,375,275,100}, new int[]{150,100,125,225,250,375,300},Color.BLUE);
		depositListener d = new depositListener();
		deposit.addActionListener(d);
		
		JPanel controlPanel = new JPanel();
		controlPanel.add(amount);
		controlPanel.add(amountField);
		controlPanel.add(deposit);
		//controlPanel.add(pBar);
		controlPanel.add(efScale) ;
		controlPanel.add(poly1);
		
		add(controlPanel);
		setSize(400,200);
		setTitle("EFScale");
}
class depositListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			
			String a = amountField.getText();
			  
			try{
				efScale.setText("");
				int deposit = Integer.parseInt(a);
			if (deposit <65){
				efScale.setText("Windspeed must be greater than 64.");
			 }
			 else if (deposit <= 85){
				 efScale.setText("EF rating is 0");
			 }
			 else if (deposit <= 110){
				 efScale.setText("EF rating is 1");
			 }
			 else if (deposit <= 135){
				 efScale.setText("EF rating is 2");
			 }
			 else if (deposit <= 165){
				 efScale.setText("EF rating is 3.");
			 }
			 else if (deposit <= 200){
				 efScale.setText("EF rating is 4");
			 }
			 else if (deposit > 200){
				 efScale.setText("EF rating is 5");
			 }
			}catch (NumberFormatException e1) {
				efScale.setText("Please enter a number.");
				 
			}
			
	}
	}
}