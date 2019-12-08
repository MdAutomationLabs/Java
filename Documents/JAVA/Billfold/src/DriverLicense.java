
import java.time.LocalDate;


public class DriverLicense extends Card {
private String dlNumber;
 private LocalDate expirationDate;
public DriverLicense() {
	super();
}
public DriverLicense(String n, String dln, LocalDate e) {
	super(n);
	setDlNumber(dln);
	setExpirationDate(e);
}
public String getDlNumber() {
	return dlNumber;
}
public void setDlNumber(String dlNumber) {
	this.dlNumber = dlNumber;
}
public LocalDate getExpirationDate() {
	return expirationDate;
}
public void setExpirationDate(LocalDate expirationDate) {
	this.expirationDate = expirationDate;
}
public boolean isExpired(){
	if (this.getExpirationDate().isBefore(LocalDate.now())){
		return true;
	}else{
		return false;
	}
}
public String format(){
	return  super.format()+", DL number: "+this.dlNumber+" Expiration Date: "+this.expirationDate ;
 }
}
