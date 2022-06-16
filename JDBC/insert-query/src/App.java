import java.sql.*;
public class App 
{
	public static void main(String[] args) 
	{
		try 
		{
	
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","mysql");
			System.out.println("Connected...");
			String query="insert into productinfo values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			String v1="101";
			String v2="Laptop";
			String v3="45000";
			ps.setString(1, v1);
			ps.setString(2, v2);
			ps.setString(3, v3);
			ps.executeUpdate();
			System.out.println("Record inserted...");
		} 			
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}
}
