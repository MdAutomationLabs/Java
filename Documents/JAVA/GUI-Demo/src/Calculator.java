import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;


public class Calculator {

	private JFrame frame;
	private JTextField info1;
	private JTextField info2;
	private JTextField sumField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(UIManager.getColor("CheckBox.light"));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalculation = new JButton("Add");
		btnCalculation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
			 try{
				 num1 = Integer.parseInt(info1.getText());
				 num2 = Integer.parseInt(info2.getText());
				 ans = num1+num2;
				sumField.setText(Integer.toString(ans));
			 }catch(Exception e1){
			}
			}
		});
		btnCalculation.setForeground(UIManager.getColor("Button.shadow"));
		btnCalculation.setBackground(UIManager.getColor("TabbedPane.shadow"));
		btnCalculation.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnCalculation.setBounds(75, 127, 109, 31);
		frame.getContentPane().add(btnCalculation);
		
		info1 = new JTextField();
		info1.setBounds(75, 22, 101, 38);
		frame.getContentPane().add(info1);
		info1.setColumns(10);
		
		info2 = new JTextField();
		info2.setBounds(220, 20, 109, 43);
		frame.getContentPane().add(info2);
		info2.setColumns(10);
		
		JButton btnNewButton = new JButton("Deduct");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				 try{
					 num1 = Integer.parseInt(info1.getText());
					 num2 = Integer.parseInt(info2.getText());
					 ans = num1-num2;
					sumField.setText(Integer.toString(ans));
				 }catch(Exception e1){
				}
			}
		});
		btnNewButton.setBounds(228, 127, 89, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel sum = new JLabel("Sum");
		sum.setBounds(68, 187, 126, 50);
		frame.getContentPane().add(sum);
		
		sumField = new JTextField();
		sumField.setBounds(155, 187, 200, 50);
		frame.getContentPane().add(sumField);
		sumField.setColumns(10);
	}
}
