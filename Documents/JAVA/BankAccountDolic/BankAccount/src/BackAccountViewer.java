import javax.swing.JFrame;

//Mirzet Dolic
public class BackAccountViewer {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(1000);
		JFrame frame = new BankAccountFrame(b);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
