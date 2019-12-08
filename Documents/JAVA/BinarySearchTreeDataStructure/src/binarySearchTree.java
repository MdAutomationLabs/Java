public class binarySearchTree {
	node root;

	public void addNode(int id, String name) {
		// create a new node with two parameter to set the name and id
		node newNode = new node(id, name);
		if (root == null) { // if root node is null
			root = newNode; // root going to be new node
		} else {
			node firstNode = root; // if root id not null firstnode will be the
									// root
			node parent; // parent node created to
			while (true) { // when firstnode is root node
				parent = firstNode; // now parent node is firstnode
				if (id <= firstNode.getiData()) { // checking the upcoming id is
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

	public void inOrderPrint() {

		inOrderPrint(root);  // calling private method
	}

	private void inOrderPrint(node bigen) {
		if (bigen != null) { // root not null
			inOrderPrint(bigen.leftChild); // first node will execute the left
			System.out.println("Placement: " + bigen.getiData() + " Name: "
					+ bigen.getsData());
			inOrderPrint(bigen.rightChild); // right node will executed 
		}
	}

	public node findNode(int id) {
		node firstNode = root;// initialize first node to root node
		// While we haven't found the Node keep looking
		while (firstNode.getiData() != id) {
			if (id < firstNode.getiData()) {
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
