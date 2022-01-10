package com.te.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection=null;
		CallableStatement callStatement=null;
		
		try{
			connection = DriverManager.getConnection(url, "root", "root");
			callStatement=connection.prepareCall("call put(?,?,?,?)");
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter the id of the sweet");
			int id=sc.nextInt();
			if(id==0) {
				break;
			}
			System.out.println("enter the sweet name");
			String name=sc.next();
			 
			System.out.println("enter the price of the sweet");
            double price= sc.nextDouble();
            System.out.println("enter the quantity of the sweet");
            int kg=sc.nextInt();
            
			
			// assign values to table
            callStatement.setInt(1, id);
            callStatement.setString(2, name);
            callStatement.setDouble(3, price);
            callStatement.setInt(4,kg);
            
            
            //Execute the statement
            callStatement.execute();
			
		}	
		
		}	catch(SQLException e)	{
			e.printStackTrace();
		}
		
	
	}

}
