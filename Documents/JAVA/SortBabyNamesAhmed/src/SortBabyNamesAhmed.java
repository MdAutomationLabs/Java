import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SortBabyNamesAhmed {

	public static void main(String[] args) throws IOException {
		// Md Ahmed
		try {
			String address = "https://bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt";
			URL pageLocation = new URL(address);
			Scanner in = new Scanner(pageLocation.openStream());

			PrintWriter outBoys = new PrintWriter("Boys.txt");
			PrintWriter outGirls = new PrintWriter("Girls.txt");

			while (in.hasNextLine()) {
				String name = in.nextLine();
				if (name.contains("girl")) {
					name = name.substring(5, name.length());
					outGirls.println(name);
					outBoys.println("-------");
				} else
					name = name.substring(4, name.length());
				outBoys.println(name);
				outGirls.println("-------");
			}

			in.close();
			outBoys.close();
			outGirls.close();
		} catch (IOException ex) {
			System.out.println(ex.toString() + " is not available.");
		}
	}

}
