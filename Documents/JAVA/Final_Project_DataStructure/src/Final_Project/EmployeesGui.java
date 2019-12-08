package Final_Project;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EmployeesGui extends JFrame {
	
	/** Final project GUI
	 * Created by Md Ahmed
	 */
	private static final long serialVersionUID = 1L;
	   // text box text field  and label 
	JTextArea  employeesTextArea = new JTextArea();
	JLabel idLabel  = new JLabel ("    ID: ");
	JTextField idTextField  = new JTextField  (15);
	JLabel FnameLabel  = new JLabel ("FirstName: ");
	JTextField FnameTextField  = new JTextField  (15);
	JLabel LnameLabel  = new JLabel ("LastName: ");
	JTextField LnameTextField  = new JTextField  (15);
	  // all the button 
	JButton addButton = new JButton ("Add");
	JButton updateButton = new JButton ("Update");
	JButton sortButton = new JButton ("Sort");
	JButton deleteButton = new JButton ("Delete");
	JButton refreshButton = new JButton ("Refresh");
	JButton exitButton = new JButton ("Exit");
	JLabel InfoLabel  = new JLabel (" ID                     FirstName             LastName ");
	
	private LinkedList<node>employees = new LinkedList<node>();

      // to check upcoming id is same as previous or not 
	private boolean isEmployees(String id){
    	  boolean isIDUnique = false;
			for (node emp : employees ){
					if (emp.getId().compareToIgnoreCase(id) == 0)
						{
						isIDUnique = true;
						}
				}
			return isIDUnique;
    	  
      }
	public EmployeesGui(){
		JPanel flow1Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel flow3Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel flow4Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel flow2Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
		JPanel flow5Panel = new JPanel (new FlowLayout (FlowLayout.LEFT));
		JPanel gridPanel = new JPanel (new GridLayout (5,5));
		
		employeesTextArea.setEditable(false); // to avoid edit of text box 
		
		flow1Panel.add(idLabel);
		flow1Panel.add(idTextField);
		flow3Panel.add(FnameLabel);
		flow3Panel.add(FnameTextField);
		flow4Panel.add(LnameLabel);
		flow4Panel.add(LnameTextField);
		
		flow2Panel.add(addButton);
		flow2Panel.add(updateButton);
		flow2Panel.add(sortButton);
		flow2Panel.add(deleteButton);
		flow2Panel.add(refreshButton);
		flow2Panel.add(exitButton);
		flow5Panel.add(InfoLabel);
	
		gridPanel.add (flow1Panel);
		gridPanel.add (flow3Panel);
		gridPanel.add (flow4Panel);
		gridPanel.add (flow2Panel);
		gridPanel.add (flow5Panel);
		add (gridPanel, BorderLayout.NORTH);
		add (employeesTextArea, BorderLayout.CENTER);
		// add button listener 
		addButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(idTextField.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Error: entry Id " );
				}else if(FnameTextField.getText().isEmpty()&&
							LnameTextField.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Error: fill all the field" );
				}else{
				if (isEmployees(idTextField.getText()) == true){
				   JOptionPane.showMessageDialog(null, "Error: Id alreary exist" );
				}else{
					employees.add (new node (idTextField.getText(), 
							FnameTextField.getText(),
							LnameTextField.getText()));
					employeesTextArea.setText("");
					for (node emp : employees ){
						employeesTextArea.append(emp + "\n");
					}
				}	
				
			}
		}
		});
		// update button listener 
	updateButton.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e) {
			try{
				
				String value1 = FnameTextField.getText();
				String value2 = LnameTextField.getText();
				FnameTextField.setText(value1);
				LnameTextField.setText(value2);
			}catch(Exception e1){
				JOptionPane.showMessageDialog(null, e1);
			}
		}	
		});
	// sort button listener
	sortButton.addActionListener(new ActionListener(){
  // I had planning to use min heap sort 
		public void actionPerformed(ActionEvent e) {
			String name[]= idTextField.getText().split("\n");
			// here I used selection sort it should work  
			employeesTextArea.setText("");
			for (int x =0; x<name.length; x++){
				if (name[x].compareTo(name[x+1])>0){
					String a = name[x];
					name[x]=name[x+1];
					name[x+1]=a;
					String n = name[x];
					name[x] = name[x+1];
					name[x+1]= n;
				}
			}
		for (int a = 0; a<name.length; a++){
			employeesTextArea.append(name[a]+"\n");
		}
		}	
		});
	// delete button listener
	deleteButton.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e) {
			if (isEmployees(idTextField.getText()) == false){
				   JOptionPane.showMessageDialog(null, "Error: Id is not exist" );
				}else{
					for (int i = 0; i < employees.size(); i++ ){
						String currentId = employees.get(i).getId();
						if (currentId.compareToIgnoreCase(idTextField.getText()) == 0)
							{
							employees.remove(i);
							JOptionPane.showMessageDialog(null, "Id is removed. Please Refresh" );
							}
					}
				}
		}
		});
	// refresh button listener
	refreshButton.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e) {
			employeesTextArea.setText("");
			for (node emp : employees ){
				employeesTextArea.append(emp + "\n");
			}
		}	
		});
	// exit button listener
	exitButton.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}	
		});
	}
	public static void main(String[] args) {
		
		EmployeesGui app = new EmployeesGui();
		app.setVisible(true);
		app.setSize(500, 700);
		app.setLocation(400, 50);
	}

}