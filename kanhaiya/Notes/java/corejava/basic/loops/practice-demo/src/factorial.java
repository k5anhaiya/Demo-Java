import java.util.Scanner;
class factorial 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Please enter the value to find the factorial=");
	int num=sc.nextInt();
	int r=1;
	for(int ctr=1;ctr<=num;ctr++)
		{
		r=ctr*r;
		}
	System.out.println("Factorial result for "+num+" = "+r);
	}

}
