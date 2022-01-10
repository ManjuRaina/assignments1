package com.te.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		Connection connection =null;
		PreparedStatement prepareStatement=null;
		
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manjudemo?user=root&password=root");
			 prepareStatement = connection.prepareStatement("Insert into mypg values(?,?,?)");
			 
			 Scanner sc= new Scanner(System.in);
			 System.out.println("enter the id");
			 int id=sc.nextInt();
			 System.out.println("enter the name");
			 String name=sc.next();
			 System.out.println("enter the rent");
			 double rent=sc.nextDouble();
			 
			 prepareStatement.setInt(1, id);
			 prepareStatement.setString(2, name);
			 prepareStatement.setDouble(3, rent);
			 
			 int executeUpdate = prepareStatement.executeUpdate();
			 System.out.println(executeUpdate);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
