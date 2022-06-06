import java.sql.*;
public class App 
{
	public static void main(String[] args) 
	{
		try 
		{
			//forName() method is used to load specified class in memory.
			//code to load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//code to create connection object
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/selfdatabase","root","mysql");
			System.out.println("conected...");
			String query="create table productinfo(pid int primary key,name varchar(30),price int)";
			//creating statement object
			Statement st=cn.createStatement();
			//executing query
			st.execute(query);
			//closing connection
			
			System.out.println("table created");
		}
		catch(Exception ex)
		{
			System.out.print(ex);
		}

	}

}
