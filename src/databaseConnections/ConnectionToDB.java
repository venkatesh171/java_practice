package databaseConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionToDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/practice";
		String userName = "root";
		String password = "*131#ven";
		
		try {
			
			String prepStatement = "INSERT INTO employee_details (id, name, email) VALUES (?, ?, ?)";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement statement = connection.prepareStatement(prepStatement);
			statement.setInt(1, 3);
			statement.setString(2, "hehe");
			statement.setString(3, "hehe@vm.com");
			
			statement.executeUpdate();
			
			connection.close();
			
		} catch (Exception e) {
			System.err.println(e);
		} 
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employee_details");
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
			
			connection.close();
			
		} catch (Exception e) {
			System.err.println(e);
		} 
		
	}

}
