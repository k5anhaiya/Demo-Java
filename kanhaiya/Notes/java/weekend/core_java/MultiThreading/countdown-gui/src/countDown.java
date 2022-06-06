import javax.swing.*;
import java.awt.*;

public class countDown 
{
	JFrame fr=new JFrame("CountDown");
	JLabel la=new JLabel("10");
	public countDown()
	{
		fr.setSize(400,400);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		fr.add(la);
		la.setFont(new Font("lucida calligraphy",Font.BOLD,40));
		new numberThread().start(); //it will create object and also start the thread
		fr.setVisible(true);
	}
	class numberThread extends Thread
	{
		public void run()
		{
			for(int num=10;num>=1;num--)
			{
				la.setText(String.valueOf(num));  //String.valueof is used to convert int to String.
				try 
				{
					Thread.sleep(1000);	
				} 
				catch (InterruptedException ex) 
				{
					System.out.println(ex);
				}
			}
			la.setText("Lets's Play....");
			try 
			{
				Thread.sleep(2000);	
			} 
			catch (InterruptedException ex) 
			{
				System.out.println(ex);
			}
			//Exit method of System class will terminate jvm
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new countDown();
	}

}
