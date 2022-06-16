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
			String query="insert into productinfo values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter product id:");
			String v1=sc.nextLine();
			System.out.println("Enter product name:");
			String v2=sc.nextLine();
			System.out.println("Enter product price:");
			String v3=sc.nextLine();
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
