import java.util.Scanner;


public class VowelCountAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		Scanner beg = new Scanner (System.in);
	    System.out.print("Please enter a word: ");
	    String word = beg.next().toLowerCase();
	    int vowelCounter = 0;
	    
	    for (int i = 0; i < word.length(); i++)
	    {
	    	if (word.charAt(i) == 'a'|| word.charAt(i) == 'e'|| word.charAt(i) == 'i'|| word.charAt(i) == 'o'
	    			|| word.charAt(i) == 'u'|| word.charAt(i) == 'y')
	    		vowelCounter++;
	    		else if (word.charAt(i) == ' ')
	    			continue;
	    	}
	    System.out.println(vowelCounter+ " vowel in "+word);
		      if (vowelCounter == 0)
	    {
	    	System.out.println("You have made a spelling mistake somewhere.");
	    }
	}

}
