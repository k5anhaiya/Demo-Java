import java.util.Scanner;

public class tableMulti2 
{
	public static void main(String[] args) 
	{
	int ta, num;
	System.out.print("Please enter any number to print the table=");
	Scanner obj=new Scanner(System.in);
	num=obj.nextInt();
	for (int c=1;c<=10;c++)
	{
	ta=num*c;
	System.out.println(num+"*"+c+"="+ta);
	}
	}

}
