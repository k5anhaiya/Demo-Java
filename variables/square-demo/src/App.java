import java.util.Scanner;

public class App 
{
	int num;
	int answer;
	Scanner scanner=new Scanner(System.in);
	public App(int v)
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
		App a1=new App(25);
	}

}
