import java.sql.*;
import java.util.Scanner;
public class App2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
	
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","mysql");
			System.out.println("Connected...");
			String query="update productinfo set name=?,price=? where pid=?";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter product id:");
			String v1=sc.nextLine();
			System.out.println("Enter product new name:");
			String v2=sc.nextLine();
			System.out.println("Enter product  new price:");
			String v3=sc.nextLine();
			ps.setString(1, v2);
			ps.setString(2, v3);
			ps.setString(3, v1);
			ps.executeUpdate();
			System.out.println("Record updated....");
		} 			
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}
}
