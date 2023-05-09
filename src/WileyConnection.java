import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WileyConnection {
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc352","root","root123");
		
	}
}
