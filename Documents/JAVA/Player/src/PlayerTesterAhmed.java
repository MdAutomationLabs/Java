public class PlayerTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		BaseballPlayer bp1 = new BaseballPlayer(2143, "Mike", "front", 5);
		BaseballPlayer bp2 = new BaseballPlayer(143, "Shon", "front", 5.8);
		BasketballPlayer bp3 = new BasketballPlayer(143, "Anna", "front", 8);
		BasketballPlayer bp4 = new BasketballPlayer(143, "Daish", "front", 6);
	       
		System.out.println(bp1.toString());
		System.out.println(bp2.toString());
		System.out.println(bp3.toString());
		System.out.println(bp4.toString());
		System.out.println();
		
		 Roster kell = new Roster("Baseball Team Roster:\n");
		 kell.addToTeam(bp1);
	       kell.addToTeam(bp2);
	       System.out.println(kell.displayRoster());
	       System.out.println();
	       
	       Roster kel = new Roster("Basketball Team Roster:\n");
			 kel.addToTeam(bp3);
		       kel.addToTeam(bp4);
		       System.out.println(kel.displayRoster());
		       System.out.println();
	}

}
