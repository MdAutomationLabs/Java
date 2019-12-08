import javax.swing.JOptionPane;

public class HelloUserAhmed {
	public static void main(String[] args) {

		String name;
		int age;
		name = JOptionPane.showInputDialog("What is " + "your name");
		age = Integer.parseInt(JOptionPane.showInputDialog("What is " + "your age"));
		String output = name.substring(0, 1).toUpperCase();
		// System.out.print(name.toUpperCase());

		JOptionPane.showMessageDialog(null, "Howdey, " + name
				+ " next year you will be " + ++age + " years old");
		System.out.println(age);
		
		System.exit(0);
	}
}
