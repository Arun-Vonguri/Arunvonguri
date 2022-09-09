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

       public static void main(String[] args)
       {
    	   DBOperations db = new DBOperations();
    	   Scanner sc = new Scanner(System.in);
    	   
    	   Employee em = new Employee();
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
    	   sc.close();
    	   db.insertDataWithStatement(em);
    	   
    	   
       }
	
}