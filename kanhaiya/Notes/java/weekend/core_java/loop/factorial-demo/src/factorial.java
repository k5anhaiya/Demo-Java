import java.util.Scanner;
public class factorial 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("please enter any number to find factorial=");
		int x=obj.nextInt();            //4!=4.3.2.1 or 1.1*1.2*1.3*1.4
		int z=1;
		for(int c=1;c<=x;c++)
			{
			z=z*c;
			}
		System.out.println(z);
			
	}

}