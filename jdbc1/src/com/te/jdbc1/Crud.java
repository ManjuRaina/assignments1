package com.te.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.mysql.jdbc.Driver;

public class Crud {

	public static void main(String[] args) {
		Connection connection=null;
		 Statement statement=null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest?user=root&password=root");
			  statement = connection.createStatement();
			  
			 //  statement.execute("create table pg(id int,name varchar(40),rent double)");
			   boolean execute2 = statement.execute("insert into pg values(1,'manju',4500.00)");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				
				try {
					statement.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
		}

	}

}
