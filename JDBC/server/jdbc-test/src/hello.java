import java.sql.*;


public class hello 
{
	public static void main(String[] args) 
	{
	 try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","mysql");
		
		System.out.println("connection established..");
		
	} 
	catch (Exception e) 
	{
		// TODO: handle exception
	}	
	}

}
