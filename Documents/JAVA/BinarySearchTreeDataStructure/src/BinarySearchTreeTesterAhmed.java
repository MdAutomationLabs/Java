public class BinarySearchTreeTesterAhmed {

	public static void main(String[] args) {
             // Md Ahmed
		binarySearchTree boys = new binarySearchTree(); // Create an object of
														// binary tree
		// values are entered to the binary tree
		boys.addNode(50, "Noah");
		boys.addNode(70, "Liam");
		boys.addNode(10, "Mason");
		boys.addNode(100, "Jacob");
		boys.addNode(35, "William");
		boys.addNode(20, "Ethan");
		boys.addNode(45, "James");
		boys.addNode(5, "Alexander");
		boys.addNode(60, "Alexander");
		boys.addNode(80, "Alexander");
		System.out.println("---In order Search----");
		boys.inOrderPrint();// calling in order print method to print all items
							// entered
		System.out.println("Finding a specefic placement Id"
				+ boys.findNode(100)); // searching a item through its id or
										// placement
		System.out.println("---search a id which is not in girls tree---");
		System.out.println("Finding a specefic placement Id: "
				+ boys.findNode(30)); // searching a item out of tree
		binarySearchTree girls = new binarySearchTree();
		girls.addNode(50, "Emma");
		girls.addNode(72, "Olivia");
		girls.addNode(10, "Sophia");
		girls.addNode(100, "Ava");
		girls.addNode(35, "Isabella");
		girls.addNode(45, "Mia");
		girls.addNode(80, "Abigail");
		girls.addNode(55, "Emily");
		girls.addNode(20, "Charlotte");
		girls.addNode(90, "Harper");
		System.out.println("---In order Search----");
		girls.inOrderPrint();
		System.out.println("Finding a specefic placement Id: "
				+ girls.findNode(72)); // Locking for certain item in tree
		System.out.println("---search a id which is not in girls tree---");
		System.out.println("Finding a specefic placement Id: "
				+ girls.findNode(71));

	}
}
