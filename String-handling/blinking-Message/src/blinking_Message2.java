import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutionException;

public class blinking_Message2 
{
	

	JFrame frame=new JFrame();
	JLabel label=new JLabel("Kanhaiya Kumar");
	public blinking_Message2()
	{
		frame.setSize(500,500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		frame.add(label);
		label.setFont(new Font("lucida calligraphy",Font.BOLD,35));
		label.setForeground(Color.red);
		new blinkThread().start();
		frame.setVisible(true);
	}
	class blinkThread extends Thread
	{
		int ctr=50;
		public void run()
		{
			while(true)
			{
				label.setVisible(true);
				try 
				{
					Thread.sleep(ctr);
				} 
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
				label.setVisible(false);
				try {
					Thread.sleep(ctr);
				} 
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
				ctr--;
				if(ctr==0)
				{
					label.setVisible(true);
					break;
				}
				
			}
		}		
	}

	
	
	public static void main(String[] args) 
	{
		System.out.println("Execution starts.........");
		long starttime=System.currentTimeMillis();
		new blinking_Message2();
		long endtime=System.currentTimeMillis();
		long timetaken=endtime-starttime;
		System.out.println("Total timetaken :"+(double)timetaken/1000+" Seconds");
		System.out.println("Execution ends...........");
	
	}
}
