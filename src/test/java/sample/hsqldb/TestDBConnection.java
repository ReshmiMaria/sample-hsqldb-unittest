package sample.hsqldb;

import org.junit.Test;
import sample.hsqldb.DBConnection;

public class TestDBConnection {
	
	@Test
	public void testDbConn() { 
		DBConnection dbconn = new DBConnection();
		dbconn.getDBConnection();
        
  } 
}


  