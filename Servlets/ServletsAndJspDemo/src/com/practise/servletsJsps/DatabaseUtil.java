package com.practise.servletsJsps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseUtil {
	
	
	static {
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
	}
	public void executeSQL(String sql){
		

         
        try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.1.227:1521/orcl", "system", "oracle")){
             
        		Statement statement = conn.createStatement();
        		statement.executeQuery(sql);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
    
	
        }
	
	}
}
