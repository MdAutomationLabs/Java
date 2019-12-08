package FinalProjectDataStructure;

import Final_Project.node;

public class data {
	node head = null;
	int size;
	int max = 10;

	public void insert(int id, String firstName, String lastName,
			String position, int salary, String startDate, String address,
			String city, int zip) {

		node newNode = new node(id, firstName, lastName, position, salary,
				startDate, address, city, zip);
		
		if (head == null) { // if root node is null
			head = newNode; // root going to be new node
		} else {
			node firstNode = head; // if root id not null firstnode will be the
									// root
			node parent; // parent node created to
			while (true) { // when firstnode is root node
				parent = firstNode; // now parent node is firstnode
				if (id <= firstNode.getId()) { // checking the upcoming id is
													// large or small to located
													// either left or right
					firstNode = firstNode.leftChild; // if less then root node go left
					if (firstNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					firstNode = firstNode.rightChild;// if more then root node go right
					if (firstNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	

	public node delete() {
		node removeNode = null;
		try {
			if(size!=0){ 
			if(head == null)  // if no element exist then execute this
				System.out.println("Queue is empty");
			else{
				removeNode = head;
				head = head.next;
				removeNode.next=null;
			}
			}
			size--;
		} catch (ArrayIndexOutOfBoundsException d) { // exception handler 
			System.out.println("out of size");
		}
		return removeNode;
	}

	public void inOrderPrint() {

		inOrderPrint(head);  // calling private method
	}

	private void inOrderPrint(node add) {
		if (add != null) { // root not null
			inOrderPrint(add.leftChild); // first node will execute the left
			System.out.println("Employee: " + add.getId() + add.getFirstName()
					+ add.getLastName() + add.getPosition()
					+ add.getSalary() + add.getStartDate()
					+ add.getAddress() + add.getCity() + add.getZip());
			inOrderPrint(add.rightChild); // right node will executed 
		}
	}
	/*public void print() {
		node add = head;
		if (add == null){
			System.out.println("Queue is empty");
		}else{
			while (add != null) { // if any node exist
				System.out.println("Employee: " +add.getId()+ add.getFirstName()
						+ add.getLastName() + add.getPosition()
						+ add.getSalary() + add.getStartDate()
						+ add.getAddress() + add.getCity() + add.getZip());
				add = add.next;
				
			}
			}
		
		System.out.println("");
	}*/
	public boolean isEmpty() { // empty method
		return (head == null);
	}

	public boolean isFull() {
		return (size == max);
	}

	public int size() { // to get the element in size
		return size;
	}

	
	public node findNode(int id) {
		node firstNode = head;// initialize first node to root node
		// While we haven't found the Node keep looking
		while (firstNode.getId() != id) {
			if (id < firstNode.getId()) {
				// move node to the left
				firstNode = firstNode.leftChild;
			} else {
				// move node to the left
				firstNode = firstNode.rightChild;
			}
			if (firstNode == null)
				return null;
		}
		return firstNode;
	}

}
private void addemployees(){
	boolean isIDUnique = true;
for (node emp : employees ){
		
		if (emp.getId().compareToIgnoreCase(idTextField.getText()) == 0)
			{
			isIDUnique = false;
			}
	}
if (isIDUnique == false){
   JOptionPane.showMessageDialog(null, "Error: Id alreary exist" );
}else{
	employees.add (new node (idTextField.getText(), 
			FnameTextField.getText(),
			LnameTextField.getText()));
	employeesTextArea.setText("---");
	for (node emp : employees ){
		employeesTextArea.append(emp + "\n");
	}
}	
}