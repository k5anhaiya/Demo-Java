import java.util.Scanner;

public class convert 
{
	public static String [] x= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteeen","nineteen"};
	public static String [] y= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	public static void call(int n)
	{
		if(n>=1 && n<=19)
		{
			System.out.print(x[n]+" ");
		}
		if(n>=20 && n<=99)
		{
			System.out.print(y[n/10]+" "+x[n%10]+" ");
		}
		if(n>=100 && n<=999)
		{
			call(n/100);
			System.out.print("hundred"+" ");
			call(n%100);
		}
		if(n>=1000 && n<=99999)
		{
			call(n/1000);
			System.out.print("thousand"+" ");
			call(n%1000);
		}
		if(n>=100000 && n<=9999999)
		{
			call(n/100000);
			System.out.print("lakh"+" ");
			call(n%100000);
		}
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter any number=");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n>=10000000 && n<=999999999)
		{
			call(n/10000000);
			System.out.print("crore"+" ");
			call(n%10000000);
		}
		else 
		{
			call(n);
		}
	}
}
