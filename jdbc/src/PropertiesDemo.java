import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class PropertiesDemo {

	public static void main(String[] args) {
		
		Connection connection;
		Statement statement;
		
		try {
			FileReader fileReader = new FileReader("C:\\Users\\91935\\Desktop\\dbfile.txt");
			Properties properties = new Properties();
			 properties .load(fileReader);
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo",properties);
			 statement=connection.createStatement();
			 statement.execute("delete from sweets where id=102");
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		}
		
		}