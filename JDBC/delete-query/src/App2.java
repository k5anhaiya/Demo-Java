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
			String query="delete from productinfo where pid=?";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter product id:");
			String v1=sc.nextLine();
			ps.setString(1, v1);
			int n=ps.executeUpdate(); //this method will return 0 or -1 if the product id will not match
			if(n>=1)
				System.out.println("Record updated....");
			else {
				System.out.println("Record doesnot exist");
			}
		} 			
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}
}
