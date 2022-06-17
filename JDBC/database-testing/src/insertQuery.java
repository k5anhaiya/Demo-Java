import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.Scanner;
public class insertQuery 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","mysql");
			System.out.println("Connection Established...with server");
			String query="insert into idcarddetails values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Please enter idnumber=");
			int v1=sc.nextInt();
			System.out.println("Please enter name:");
			String v2=sc.nextLine();
			System.out.println("please enter branch name:");
			String branch=sc.nextLine();
			System.out.println("Enter year of passing:");
			String year=sc.nextLine();
			System.out.println("Enter Mobile number:");
			String phone=sc.nextLine();
			ps.setString(1, String.valueOf(v1));
			ps.setString(2, v2);
			ps.setString(3, branch);
			ps.setString(4, year);
			ps.setString(5, phone);
			ps.executeUpdate();
			System.out.println("Record inserted into table....");
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}

}
