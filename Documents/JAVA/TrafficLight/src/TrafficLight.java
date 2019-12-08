import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TrafficLight extends JFrame implements ActionListener{

	public static final long serialVersionUID = 1L;
		
		private JFrame jframe;
		private JPanel jpanel;
		private JButton jbutCycle;
		private TrafficPanel trafficPanel;
		
		public TrafficLight(){
			jframe = new JFrame("Traffic Light");
			jpanel = new JPanel();
			jbutCycle = new JButton("Switch");}
			
			public void launchApp(){
				jframe.setSize(300, 500);
				jpanel.add(jbutCycle);
				jbutCycle.addActionListener(this);
				trafficPanel = new TrafficPanel();
				jframe.getContentPane().add(trafficPanel);
				jframe.getContentPane().add(jpanel,BorderLayout.SOUTH);
				jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
				jframe.setVisible(true);
				
			}
			public static void main(String args[]){
				TrafficLight trafficLight = new TrafficLight();
				trafficLight.launchApp();
			}
			public void actionPerformed(ActionEvent e){
				if (e.getSource()== jbutCycle){
					trafficPanel.changeColor();
				}
			}
			}
	

	

