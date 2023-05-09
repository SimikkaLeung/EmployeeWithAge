import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeController {
	
	public void addEmployee (Connection con, int id, String name, int age) throws SQLException {
		//Connection con = WileyConnection.getConnection();
		
		PreparedStatement pstAddEmployee = con.prepareStatement("insert into employeewithage values(?,?,?)");
		pstAddEmployee.setInt(1,id);
		pstAddEmployee.setString(2,name);
		pstAddEmployee.setInt(3,age);
		pstAddEmployee.executeUpdate();
		
		System.out.println("test");
		
	}
	

	
	
//	public static void main (String[] args) throws SQLException {
//		
//
//	}
	
}
