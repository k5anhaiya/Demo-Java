import java.sql.*;
public class App2 
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
			String query="insert into productinfo values(?,?,?)";
			//creating statement object
			PreparedStatement st=cn.prepareStatement(query);
			//executing query
			String v1="101";
			String v2="Laptop";
			String v3="45000";
			st.setString(1, v1);
			st.setString(2, v2);
			st.setString(3, v3);
			st.executeUpdate();
			
		
			System.out.println("table created");
			System.out.println("Record inserted");
			
		}
		catch(Exception ex)
		{
			System.out.print(ex);
		}

	}

}
