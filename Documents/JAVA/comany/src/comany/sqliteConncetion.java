package comany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqliteConncetion {
     private static Connection con;
     private static boolean hasData = false;
     public ResultSet displayUsers() throws ClassNotFoundException, SQLException{
    	 if (con == null){
    		 getConnection();
    	 }
    	 Statement state = con.createStatement();
    	 ResultSet res = state.executeQuery("select fname, lname from user");
    	 return res;
     }
	private void getConnection() throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("org.sqlite.jdbc");
		con = DriverManager.getConnection("jdbc:sqlite:sqliteConncetion1.db");
		initialise();
	}
	private void initialise() throws SQLException {
		// TODO Auto-generated method stub
		if (hasData){
			hasData = true;
			Statement state = con.createStatement();
			ResultSet res = state.executeQuery("selectname from sqlite_master where type = 'table'AND name = 'user'");
		if (!res.next()){
			System.out.println("Bulding the user table with populated values.");
			Statement state2 = con.createStatement();
		    state2.executeQuery("CREATE TABLE USER(id integer," + "fname varchar(30)," + "lname varchar(30)," + "primary key(id));");
		  
		   PreparedStatement prep = con.prepareStatement("INSERT INTO user values(?,?,?);");
		   prep.setString(2, "Jhon");
		   prep.setString(3, "Mad");
		   prep.execute();
		
		   PreparedStatement prep2 = con.prepareStatement("INSERT INTO user values(?,?,?);");
		   prep.setString(2, "Paul");
		   prep.setString(3, "Smith");
		   prep.execute();
		}
		}  
	
	}
public void addUser(String firstname, String lastname)throws ClassNotFoundException, SQLException{
	if (con == null){
		getConnection();
	}
	PreparedStatement prep = con.prepareStatement("INSERT INTO user values(?,?,?);");
	prep.setString(2, firstname);
	   prep.setString(3, lastname);
	   prep.execute();


}
}
