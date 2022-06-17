import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertApp 
{
	public static void main(String[] args) 
	{
		try 
		{
			//loading driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Creating connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","mysql");	
			//Query
			System.out.println("Connection Established...");
			String query="create table idcardDetails(idnumber int primary key,name varchar(30),Branch varchar(30),Year varchar(20),phone varchar(10))";
			//creating statement object here we need to create statement object interface objects
			Statement st=con.createStatement();
			st.execute(query);
			System.out.println("Table created....");
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
		
	}

}
