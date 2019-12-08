import java.util.Scanner;

public class PasswordValidationAhmed {

	public static void main(String[] args) {
		// Md Ahmed
		String pass = passwordValidation();

	}

	/**
	 * Create password validation.
	 * 
	 * @param password
	 *            get password from users
	 * @return changed password
	 */
	public static String passwordValidation() {
		boolean valid = false;
		boolean condition1 = false;
		boolean condition2 = false;
		boolean condition3 = false;
		boolean condition4 = false;
		String pass;

		Scanner in = new Scanner(System.in);
		System.out.println("A password must meet the following critaria\n"
				+ "must be at least 8 chatacters\n"
				+ "must contain at least one uppercase letter\n"
				+ "must contain at least one lowercase letter\n"
				+ "must contain at least one number: ");

		do {
			System.out.println("Please enter a password: ");
			pass = in.nextLine();
			while (pass.length() < 8) {
				System.out.println("Password must be 8 characters in length.");
				System.out.println("Please enter a password: ");
				pass = in.nextLine();
			}

			String upperCaseChars = "(.*[A-Z].*)";
			if (!pass.matches(upperCaseChars)) {
				System.out
						.println("Password should contain at least one upper case alphabet");
			} else {
				condition1 = true;
			}
			String lowerCaseChars = "(.*[a-z].*)";
			if (!pass.matches(lowerCaseChars)) {
				System.out
						.println("Password should contain at least one lower case alphabet");
			} else {
				condition2 = true;
			}
			String numbers = "(.*[0-9].*)";
			if (!pass.matches(numbers)) {
				System.out
						.println("Password should contain at least one number.");

			} else {
				condition3 = true;
			}

			if (condition1 && condition2 && condition3) {
				valid = true;
				System.out.println("Please confirm password again: ");
				String npass = in.nextLine();
				if (!pass.matches(npass)) {
					System.out.println("Password should be same in typed.");
					System.out.println("Please enter a password: ");
					pass = in.nextLine();
				} else {
					condition4 = true;
				}
			}

		} while (!valid);
		System.out.print("Pasword is changed");

		return pass;
	}
}
