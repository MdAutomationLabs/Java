

public class DebitCard extends Card{
private String cardNumber;
private String pin;

public DebitCard() {
	super();
}
public DebitCard(String n, String id, String pin)
{  
	super();
   setCardNumber(id); //use your setIdNumber method – check the capitalization
   setPin(pin);
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String id) {
	this.cardNumber = id;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public String formatCards(){
	return super.format()+ ", Card number: "+cardNumber+" Pin: "+pin ;
 }
}
