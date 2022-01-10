package com.te.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Crud {

	public static void main(String[] args) {
		Connection connection=null;
		Statement createStatement=null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manjudemo?user=root&password=root");
			 createStatement = connection.createStatement();
			//createStatement.execute("create table mypg(id int,name varchar(40),rent double)");
			 createStatement.execute("insert into mypg values(1,'manju',6000.00)");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if(createStatement!=null) {
				try {
					createStatement.close();
				} catch (SQLException e) {
		
					e.printStackTrace();
				}
			}
		}
	}

}
