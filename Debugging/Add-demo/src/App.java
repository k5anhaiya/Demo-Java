import java.sql.*;
import java.util.Scanner;
public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","mysql");
			System.out.println("Driver connected....");
			String query="insert into idcarddetails values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter id card number= ");
			int idcardnumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name=");
			String name=sc.nextLine();
			System.out.println("Enter Branch=");
			String Branch=sc.nextLine();
			System.out.println("Enter year=");
			String year=sc.nextLine();
			System.out.println("Enter the Mobile number=");
			String phone=sc.nextLine();
			ps.setString(1, String.valueOf(idcardnumber));
			ps.setString(2, name);
			ps.setString(3, Branch);
			ps.setString(4, year);
			ps.setString(5, phone);
			ps.executeUpdate();
			System.out.println("Record updated....");
			con.close();
			
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
		}
	}
}
