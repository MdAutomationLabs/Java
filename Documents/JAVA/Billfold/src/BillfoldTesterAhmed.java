

import java.time.LocalDate;

public class BillfoldTesterAhmed {

	public static void main(String[] args) {
		// md Ahmed
		Billfold myBillfold = new Billfold();
		
		DriverLicense dl1 = new DriverLicense("Kelli", "0098778", LocalDate.of(2016, 5, 23));
		DriverLicense dl2 = new DriverLicense("Kelli", "0098778", LocalDate.of(2014, 5, 23));
		DriverLicense dl3 = new DriverLicense("Kelli", "0098778", LocalDate.of(2014, 5, 23));
		//DriverLicense dl4 = new DriverLicense("Kelli", "0098778", LocalDate.of(2016, 5, 23));
		
		System.out.println(dl1.format());
		myBillfold.addCard(dl1);
		System.out.println(dl2.format());
		myBillfold.addCard(dl2);
		System.out.println(dl3.format());
		myBillfold.addCard(dl3);
		//System.out.println(dl4.format());
		//myBillfold.addCard(dl4);
		System.out.println("Expired card count: " +myBillfold.getExpiredCardCount());
		YMCACard me = new YMCACard("Kelli", "1QAZXSW");
		YMCACard husband = new YMCACard("Kelli", "1QAZXSW");
		System.out.println("Checking YMCA cards, are both equal or not. "  );
		System.out.println(me.equals(husband));
		System.out.println("Yes, both are equal."  );
		
	}

}
