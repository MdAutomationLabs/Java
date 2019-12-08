package comany;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args)  {
		
   sqliteConncetion test = new sqliteConncetion();
	  ResultSet rs;
		try {
			rs = test.displayUsers();
			while (rs.next()){
				System.out.println(("fname")+ " " + rs.getString("lname")) ;
			
	}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	}
