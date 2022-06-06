import java.util.Scanner;

public class square 
{
	int num;
	int answer;
	Scanner scanner=new Scanner(System.in);
	public square(int v)
	{
		this.num=v;
		squareLogic();
	}
	protected void squareLogic()
	{
		for(int i=0;i<=num;i++)
		{
			answer=i*i;
			System.out.println(answer+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		square a1=new square(25);
	}

}
