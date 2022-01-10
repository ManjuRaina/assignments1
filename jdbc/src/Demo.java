import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		Savepoint setSavepoint = null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			connection = DriverManager.getConnection(url, "root", "root");
			statement = connection.createStatement();
			statement.execute("insert into trans values(1,'unlocking by finger print')");
			statement.execute("insert into trans values(2,'entering the pin')");
			statement.execute("insert into trans values(3,'check balance')");
			System.out.println("balance is 100000000000");

			setSavepoint = connection.setSavepoint();

			statement.execute("insert into trans values(4,'debiting the amount')");

			statement.execute("insert into trans values(5,'transfor through network')");

			statement.execute("insert into trans values(6,'crediting the amount')");
			System.out.println("transaction completed");
            connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback(setSavepoint);
				 connection.commit();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
             System.out.println("transacton failed");
			e.printStackTrace();
		}

	}

}
