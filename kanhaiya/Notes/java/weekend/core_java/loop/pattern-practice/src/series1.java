//print   1,3,2,4,3,5,4,6,5,7
public class series1 
{
	public static void main(String[] args) 
	{
		int num1,num2,num3,res;
		num1=1;
		num2=2;
		num3=0;
		for(int i=1;i<=10;i++)
		{
		System.out.print(res+" ");
		res=num1+num2;
		num3=res-num1;
		num1=res;
		}
	}

}
