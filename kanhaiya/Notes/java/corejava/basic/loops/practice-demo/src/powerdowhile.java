import java.util.Scanner;

public class powerdowhile 
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of x=");
	 int x=sc.nextInt();
	 System.out.println("Enter the value of y=");
	 int y=sc.nextInt();
	 int r=x;
	 int c=1;
	 do
	 {
		 r=r*x;
		 c++;
	 }
	 while(c<y);
	 System.out.println("Result="+r);
	}

}