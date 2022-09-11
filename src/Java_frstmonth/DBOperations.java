package Java_frstmonth;

import java.sql.*;
import java.util.Scanner;

public class DBOperations {
	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public DBOperations()
	{
		connection = MySqlConnection.getInstance();
	}
	public int insertDataWithStatement(Employee emp)
	{
		int result = 0;
		String query = "insert into employee values(" +emp.getId()+ ",'" +emp.getName()+ "',"+emp.getSalary()+ ",'"+emp.getAddress()+"')";
		
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int deleteData(Employee emp) {
		int result = 0;
		String query = "delete from Employee where id= "+emp.getId()+"";
		
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int updateData(Employee emp) {
		int result = 0;
		String query = "update Employee set name = '" + emp.getName() + "', salary = " + emp.getSalary() + ", address ='" + emp.getAddress() + "' where id = "+emp.getId()+";";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public static void main(String[] args) {
	
		DBOperations db = new DBOperations();
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("please enter your choice = \n" + "1.insert employee data \n" + "2.delete employee data \n" + "3.Update employee data");
			int n = sc.nextInt();
			Employee em = new Employee();
			switch(n) {
			case 1 :
				System.out.println("Please enter emp id");
				em.setId(sc.nextInt());
				
				sc.nextLine();
				
				System.out.println("Please enter emp name");
				em.setName(sc.nextLine());
				
				
				System.out.println("Please enter salary");
				em.setSalary(sc.nextDouble());
				sc.nextLine();
				
				System.out.println("Please enter address");
				em.setAddress(sc.nextLine());
				
				
				db.insertDataWithStatement(em);
			break;
			case 2 :
				System.out.println("Please enter a id to delete");
				em.setId(sc.nextInt());
				db.deleteData(em);
			break;
			
			case 3 :
				System.out.println("Please enter emp name");
				em.setName(sc.next());
				
				System.out.println("Please enter salary");
				em.setSalary(sc.nextDouble());
				sc.nextLine();
				
				System.out.println("Please enter address");
				em.setAddress(sc.nextLine());
				
				System.out.println("Please enter emp id");
				em.setId(sc.nextInt());
					
				db.updateData(em);
			break;
			
			}
		}
	}
}
	
	
	