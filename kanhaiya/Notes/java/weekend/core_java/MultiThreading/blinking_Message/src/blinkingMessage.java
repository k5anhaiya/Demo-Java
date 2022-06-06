import javax.swing.*;
import java.awt.*;

public class blinkingMessage 
{
	JFrame fr=new JFrame("Blinking Message");
	JLabel la=new JLabel("Welcome to the Cetpa Infotech");
	public blinkingMessage()
	{
		fr.setSize(400,400);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		fr.add(la);
		la.setFont(new Font("lucida calligraphy",Font.BOLD,20));
		new blinkThread().start(); //it will create object and also start the thread
		fr.setVisible(true);
	}
	class blinkThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				la.setVisible(true);  //blinking means to set the programme visible and invisible
				try {
					Thread.sleep(100);
				} catch (Exception e) {}
				la.setVisible(false);
				try {
					Thread.sleep(100);
				} catch (Exception e) {}
			}
			
		}
	}
	public static void main(String[] args) 
	{
		new blinkingMessage();
	}

}
