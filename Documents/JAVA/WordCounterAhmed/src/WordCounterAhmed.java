import java.util.Scanner;

public class WordCounterAhmed {

	public static void main(String[] args) {

		// Md Ahmed
		int i = 0;
		System.out.println("Total words: "+countWords("n"));
	}
   /**
    * Count words in a phrase.
    * @param str string variable
    * @return count 
    */
	public static int countWords(String str) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a phrase: ");
		str = in.nextLine();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
				while (str.charAt(i) != ' ' && i < str.length() - 1) {
					i++;
				}
			}
		}
		return count;

	}
}