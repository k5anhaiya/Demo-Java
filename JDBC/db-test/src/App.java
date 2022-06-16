import java.sql.*;
public class App 
{
	public static void main(String[] args) 
	{
		try 
		{
			//loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","mysql");
			System.out.println("Connected...");
			String query="create table productinfo(pid int primary key,name varchar(30),price int)";
			//creating statement object
			Statement st=con.createStatement();
			//executing query
			st.execute(query);
			//closing connection
			con.close();
			System.out.println("table created...");
		} 			
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}
}
