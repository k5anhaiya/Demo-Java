import java.sql.*;
public class App 
{
	public static void main(String[] args) 
	{
		try 
		{
			//code to load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//code to create connection object
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","mysql");
			System.out.println("Connected...");
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}
}
