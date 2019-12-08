package InheritanceAndPolymorphism;

public class clothingTesterAhmed {
	// Md Ahmed

	public static void main(String[] args) {

		// Test super class only
		clothing suit = new clothing();
		clothing jersey = new clothing("medium", "blue");
		System.out.println("Clothing 1: " + suit);
		System.out.println("Clothing 2: " + jersey);
		System.out.println();
		// Test shirt class
		clothing blueShirt = new shirt("null", "medium", "blue");
		shirt pinkshirt = new shirt("short sleeves");
		pinkshirt.setColor("Pink");
		pinkshirt.setSize("M");
		System.out.println("BlueShirt" + blueShirt);
		System.out.println("Pinkshirt" + pinkshirt);
		System.out.println();
		// Test pants class
		pants blackPants = new pants();
		blackPants.setColor("Black");
		blackPants.setSize("M");
		System.out.println("blackPants " + blackPants);
		System.out.println();
		// Test socks class
		clothing purpleSocks = new socks("9=10", "Purple");
		socks greenSocks = new socks("7-8", "Green", false);
		System.out.println("purpleSocks " + purpleSocks);
		System.out.println("greenSocks " + greenSocks);
	}

}
