import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeView {
	
	public static void addEmployeeView (Scanner keyboard, Connection con) throws SQLException {
		boolean isValid = false;
		String strId = "", name = "", strAge = "";
		int id = 0, age = 0;
		do {
			System.out.println("Please enter the id of the new employee: ");
			try {
				strId = keyboard.nextLine();
				id = Integer.parseInt(strId);
				isValid = true;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input! Please enter an integer.");
			}
		} while(!isValid);
		
		isValid = false;
		do {
			System.out.println("Please enter the name of the new employee: ");
			name = keyboard.nextLine();
			name = name.replaceAll("[^A-za-z]", " ");
			if (name.length() == 0) {
				System.out.println("Invalid input! Please enter at least one alphatic character.");
			}
			isValid = true;
		} while(!isValid);
		
		
		isValid = false;
		do {
			System.out.println("Please enter the age of the new employee: ");
			try {
				strAge = keyboard.nextLine();
				age = Integer.parseInt(strAge);
				age = Math.abs(age);
				isValid = true;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input! Please enter an integer.");
			}
		} while(!isValid);
		
		EmployeeController empController = new EmployeeController();
		empController.addEmployee(con,id,name,age);
		
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		
		
		Connection con = WileyConnection.getConnection();
		
		//Employee e1 = new Employee(1,"Henry",30);
		//EmployeeController empController = new EmployeeController();
		//empController.addEmployee(con,e1.getId(),e1.getName(),e1.getAge());
		
		addEmployeeView(keyboard,con);
		
		con.close();
		
		keyboard.close();
		
		
	}

}
