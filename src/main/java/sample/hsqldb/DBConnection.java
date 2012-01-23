package sample.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	String sql = "create table Customer(id numeric,FirstName varchar,lastname varchar)";
	
	public void getDBConnection() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:testDB","sa","");
			
			Statement st = null;
	        ResultSet rs = null;

	        st = conn.createStatement();
	        rs = st.executeQuery(sql);

	    	/*while (rs.next()) {
	    	    System.out.println(rs.getString("title") + " (" +
	    			       rs.getString("url") + ")");
	    	    
	    	}*/	    		    	
	    	rs.close();
	    	st.close();
	    	conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR: failed to load HSQLDB JDBC driver.");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
