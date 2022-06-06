
public class App
{
	public static void main(String[] args) 
	{
		Task task=new Task();
		//code to create thread
		Thread th1=new Thread(task);
		Thread th2=new Thread(task);
		Thread th3=new Thread(task);
		//code to starts all thread
		th1.start();
		th2.start();
		th3.start();

	}

}
