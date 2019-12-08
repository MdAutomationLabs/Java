package TowersOfHanoi;

import java.util.Scanner;

public class towersOfHanoiTesterAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		towersOfHanoi hanoiTower = new towersOfHanoi(); // hanoi tower object
														// created
		System.out.print("Enter number of discs: "); // ask for number of discs
		Scanner in = new Scanner(System.in);
		int discs = in.nextInt();
		hanoiTower.tower(discs, "A", "B", "C"); // all discs will be moved on
		                                         // three slots in this instance
		in.close();
	}
}
