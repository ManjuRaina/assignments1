package com.te.batchquery;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement {


	public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
	FileReader fileReader;
	Connection connection=null;
	Statement stmt=null;

	try {
		fileReader=new FileReader("C:\\Users\\91935\\Desktop\\dbfile.txt");
		Properties properties=new Properties();
		 properties.load(fileReader);
		connection =DriverManager.getConnection(url, properties);
		stmt = connection.createStatement();
		stmt.addBatch("insert into employees values(101,'kumar')");
		stmt.addBatch(" update employees set name='manju' where id=101)"); 
		stmt.addBatch("insert into  employees values(102,'allu')");
		stmt.executeBatch();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	}

}
