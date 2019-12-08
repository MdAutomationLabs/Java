import java.util.Scanner;

public class VowelFoundAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		final String SENTINEL = "exit";
		int vowelCounter = 0;
		String word = "";
		Scanner in = new Scanner(System.in);
		System.out.print("This is a vowel found program. To look how many vowel exists in your sentences."
				+ "\nPlease enter sentences or type exit to quit: ");
		if (in.hasNext()) {
			word = in.nextLine().toLowerCase();
		} else {
			System.out.println("Error");
		}
		while (!word.equals(SENTINEL)) {

			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
						|| word.charAt(i) == 'i' || word.charAt(i) == 'o'
						|| word.charAt(i) == 'u' || word.charAt(i) == 'y')
					vowelCounter++;
				else if (word.charAt(i) == ' ')
					continue;
			}
			System.out.println("Total vowel found: "+vowelCounter);
			if (vowelCounter == 0) {
				System.out.println("You have made a spelling mistake somewhere.");
			}
			System.out.print("Please enter another sentences or type exit to quit: ");
			if (in.hasNext()) {
				word = in.nextLine().toLowerCase();
			} else {
				System.out.println("Error");
			}
		}
	}
}
