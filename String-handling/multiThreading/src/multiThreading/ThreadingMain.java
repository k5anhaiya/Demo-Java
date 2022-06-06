package multiThreading;

public class ThreadingMain extends Thread
{
	public void run()
	{
		long starttime=System.currentTimeMillis();
		System.out.println("Program start............");
		System.out.println("==================================================");
		System.out.println("This is the programme to print squares of number");
		System.out.println("==================================================");
		for(int i=0;i<=100;i++)
		{
			int k=i*i;
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Programme ends............");
		long endtime=System.currentTimeMillis();
		long timetaken=endtime-starttime;
		System.out.println();
		System.out.println();
		System.out.println("Total time taken to execute the programme="+(double)timetaken/1000+" Seconds");
	}
	public static void main(String[] args) 
	{
		ThreadingMain th1=new ThreadingMain();
		
		th1.start();
		
	}

}
