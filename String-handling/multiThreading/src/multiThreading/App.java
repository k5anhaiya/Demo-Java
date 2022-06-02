package multiThreading;

public class App implements Runnable
{
	public void run()
	{
		int num=2;
		for(int i=1;i<=10;i++)
		{
			int ta=0;
			ta=2*i;
			System.out.print(ta+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		App a1=new App();
		Thread th1=new Thread(a1);
		th1.start();
		Thread th2=new Thread(a1);
		th2.start();
		Thread th3=new Thread(a1);
		th3.start();
		
	}
	

}
