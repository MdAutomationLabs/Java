
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
public class TicketCounterFrame extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	private TicketCounters ticketCounter ;
	private JLabel statement = new JLabel("Enter how many tickets you'd like to purchase (1-6)");
	private JTextField ticketField = new JTextField(10);
	private JButton purchaseTickets = new JButton("Purchase Tickets: ");
	private JLabel remainingTickets = new JLabel();
	private JLabel sold = new JLabel(); 
	private JLabel exception = new JLabel();
	private JLabel customers = new JLabel();
	private JProgressBar pBar = new JProgressBar();
	
	public TicketCounterFrame() {
		ticketCounter = new TicketCounters();
		pBar.setMinimum(0);
		pBar.setMaximum(75);
	purchaseTicketsListener d = new purchaseTicketsListener();
	purchaseTickets.addActionListener(d);

	JPanel controlPanel = new JPanel();
	controlPanel.add(statement);
	controlPanel.add(ticketField);
	controlPanel.add(purchaseTickets);
	controlPanel.add(remainingTickets);
	controlPanel.add(sold);
	controlPanel.add(exception);
	controlPanel.add(customers);
	controlPanel.add(pBar);
	add(controlPanel);
	setSize(600, 200);
	}

	class purchaseTicketsListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
	String  ticket = ticketField.getText();
	int ticConvert = 0;
	try {
		exception.setText("Please enter a number only, one can buy maximum 6 tickets. ");
		ticConvert =  Integer.parseInt(ticket);
	if ( ticConvert < 1) {
		exception.setText("You can't purchase less than 1 ticket.  ");	   
   	}
	if(ticketCounter.getTOTAL_TICKET() == 0){
		sold.setText("Ticket sold");
	}
   	if (ticConvert> ticketCounter.getTOTAL_TICKET()){
   		exception.setText("You can't buy more than " +ticketCounter.getTOTAL_TICKET());
   	}
   	if (ticConvert> 6){
   		exception.setText("You can't buy more than 6 tickets.  ");
   	}
   	ticketCounter.setTicketToBuy(ticConvert);
    remainingTickets.setText("Remaining Tickets: "+(ticketCounter.getTOTAL_TICKET() - ticketCounter.getTixBought()) );
    
	  pBar.setValue(ticketCounter.getTixBought());
	  customers.setText("Number of ticket sold: "+ticketCounter.getTixBought());
	  
	  if (ticketCounter.getTOTAL_TICKET() == 0 && ticketCounter.getTixBought() == 75 ){
		  sold.setText("All ticket sold"); 
	  }
	} catch (NumberFormatException erd) {
	exception.setText("Error, Please try any number.  ");
	}
    
	}

	}
}
