import javax.swing.*;
import java.awt.*;

public class blinking_Message 
{
	JFrame frame=new JFrame();
	JLabel label=new JLabel("Kanhaiya Kumar");
	public blinking_Message()
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
		public void run()
		{
			while(true)
			{
				label.setVisible(true);
				try 
				{
					Thread.sleep(100);
				} 
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
				label.setVisible(false);
				try {
					Thread.sleep(100);
				} 
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		new blinking_Message();
		
	}
}
