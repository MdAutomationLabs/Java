import java.util.Random;
import java.util.Scanner; 
public class RockPaperScissorsAhmed {

	public static void main(String[] args) {
				// Md Ahmed
				String personPlay; //User's play -- "R", "P", or "S" 
			    String computerPlay = ""; //Computer's play -- "R", "P", or "S" 
			    int computerInt; //Randomly generated number used to determine 
			                     //computer's play 


			    Scanner scan = new Scanner(System.in); 
			    Random generator = new Random(); 

			    System.out.println("Hey, let's play Rock, Paper, Scissors, lizard, Spock!\n" + 
			                       "Please enter a move.\n" + "Rock = R, Paper = P, and Scissors = S, \n" 
			    		                +" Lizard = L and Spock = SP\n");

			     
			    computerInt = generator.nextInt(5)+1; 

			    //Translate computer's randomly generated play to 
			    //string using if //statements 

			    if (computerInt == 1) 
			       computerPlay = "R"; 
			    else if (computerInt == 2) 
			       computerPlay = "P"; 
			    else if (computerInt == 3) 
			       computerPlay = "S";
			    else if (computerInt == 4) 
				       computerPlay = "L"; 
			    else if (computerInt == 5) 
				       computerPlay = "SP"; 
			    
			    //Get player's play from input-- note that this is 
			    // stored as a string 
			    System.out.print("Enter your play: "); 
			   if (scan.hasNext()) {
					 personPlay = scan.next();
			    
			   
			    //Make player's play uppercase for ease of comparison 
			    personPlay = personPlay.toUpperCase(); 
			    computerPlay = computerPlay.toUpperCase(); 

			    //Print computer's play 
			    System.out.println("Computer's play is: " + computerPlay); 

       if (personPlay.equals("R"))
       {
			   
			    if (computerPlay.equals("R")){
			        System.out.println("Its tie, play again!");
			    }else if (computerPlay.equals("P")){
			    	System.out.println("Rock loses to paper, you lose!");
			    }else if (computerPlay.equals("S")){
			    	System.out.println("Rock beats scissors, you Win!");
			    }else if (computerPlay.equals("L")){
			    	System.out.println("Rock crushes lizard, you Win!");
			    }else if (computerPlay.equals("SP")){
			    	System.out.println("Rock vaporized by spock, you lose!");
			    }
         }
        else if 	(personPlay.equals("P"))
        {
    	        if (computerPlay.equals("R")){
		             System.out.println("Paper beats rock, you win!");
		        }else if (computerPlay.equals("P")){
		    	     System.out.println("Its a tie, play again!");
		        }else if (computerPlay.equals("S")){
		    	     System.out.println("Scissors cut paper, you lose!");
		    }else if (computerPlay.equals("L")){
		    	System.out.println("Lizard eats paper, you lose!");
		    }else if (computerPlay.equals("SP")){
		    	System.out.println("paper disproves spock, you win!");
		    }
        }
        else if 	(personPlay.equals("S"))
        {
    	        if (computerPlay.equals("R")){
		             System.out.println("Scissors loses rock, you lose!");
		        }else if (computerPlay.equals("P")){
		    	     System.out.println("Scissors cut paper, you lose!");
		        }else if (computerPlay.equals("S")){
		    	     System.out.println("Its a tie, play again!");
		    }else if (computerPlay.equals("L")){
		    	System.out.println("Lizard is decapitated by scissors, you win!");
		    }else if (computerPlay.equals("SP")){
		    	System.out.println("Spock smashes scissors, you lose!");
		    }
        }else if 	(personPlay.equals("L"))
        {
	        if (computerPlay.equals("R")){
	             System.out.println("Rock crushes lizard, you lose!");
	        }else if (computerPlay.equals("P")){
	    	     System.out.println("Lizard eats paper, you win!");
	        }else if (computerPlay.equals("S")){
	    	     System.out.println("Lizard is decapitated by scissors, you lose!");
	    }else if (computerPlay.equals("L")){
	    	System.out.println("Its a tie, play again!");
	    }else if (computerPlay.equals("SP")){
	    	System.out.println("Lizard posions spock, you win!");
	    }
    }else if 	(personPlay.equals("SP"))
    {
        if (computerPlay.equals("R")){
             System.out.println("Spock vaporizes rock, you win!");
        }else if (computerPlay.equals("P")){
    	     System.out.println("Paper disproves spock, you lose!");
        }else if (computerPlay.equals("S")){
    	     System.out.println("Spock smashes scissors, you win!");
    }else if (computerPlay.equals("L")){
    	System.out.println("Lizard posions spock, you lose!");
    }else if (computerPlay.equals("SP")){
    	System.out.println("Its a tie, play again!");
       }
} 
			     else 
			          System.out.println("Invalid user input."); 
			    scan.close();
	}
}
}



