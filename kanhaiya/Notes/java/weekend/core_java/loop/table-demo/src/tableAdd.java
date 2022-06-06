import java.util.Scanner;
public class tableAdd 
{
	public static void main(String[] args) 
	{
	int ta=0, num;
	System.out.print("Please enter any number to print the table=");
	Scanner obj=new Scanner(System.in);
	num=obj.nextInt();
	for (int c=1;c<=10;c++)
	{
	ta=num+ta;
	System.out.println(num+"*"+c+"="+ta);
	}
	}

}
