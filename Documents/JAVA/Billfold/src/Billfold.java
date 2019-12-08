


public class Billfold {
	private Card card1;
	private Card card2;
	private Card card3;
	

public Billfold() {
	}
public void addCard(Card n){
	if (card1 == null){
		card1 = n;}
	else if (card2 == null){
         card2 = n;
	}else if (card3 == null){
        card3 = n;
	}
}
public int getExpiredCardCount(){
	int count = 0;
	if (card1.isExpired()){
		count++;
	}
	if (card2.isExpired()){
		count++;
	}
	if (card3.isExpired()){
		count++;
	}
	return count;
	
}
public String formatCards(){
	return "["+(card1.format())+(card2.format())+(card2.format())+"]";
	
}

}
