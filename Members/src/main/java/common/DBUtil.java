package common;

import java.sql.DriverManager;
import java.sql.Connection;


public class DBUtil {

private static	String URL = "jdbc:mysql://localhost:3306/jwebdb";
private static	String USER = "javauser";
private static	String PASSWORD = "pwjava";
	

	public static Connection getConnection() {
		
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USER, PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}		
		
	}

}
