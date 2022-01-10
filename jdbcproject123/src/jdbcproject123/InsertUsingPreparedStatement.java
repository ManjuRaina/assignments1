package jdbcproject123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class InsertUsingPreparedStatement {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manjudemo?user=root&password=root");
			prepareStatement = connection.prepareStatement("insert into pg values(?,?,?)");

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("enter the name");
			String s = sc.next();
			System.out.println("enter the rent");
			double d = sc.nextDouble();
			prepareStatement.setInt(1, id);
			prepareStatement.setString(2, name);
			prepareStatement.setDouble(3, rent);
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println("executeUpdate");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
