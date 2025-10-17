package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jwebdb";
		String user = "javauser";
		String passwd = "pwjava";
		
		try {
			Connection conn = DriverManager.getConnection(url,user,passwd);
			System.out.println(conn + " DB접속 성공 ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
