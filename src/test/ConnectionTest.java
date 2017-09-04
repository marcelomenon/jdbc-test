package test;

import java.sql.Connection;
import java.sql.SQLException;

import jdbctest.ConnectionFactory;

// Class to test if the database connection is opened
public class ConnectionTest {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Database Connection is opened");
		connection.close();
	}
}