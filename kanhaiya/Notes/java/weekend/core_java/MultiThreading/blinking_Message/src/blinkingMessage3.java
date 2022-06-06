import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class blinkingMessage3 
{
	JFrame fr=new JFrame("Blinking Message");
	JLabel la=new JLabel("Welcome to the Cetpa Infotech");
	blinkThread th=new blinkThread();
	public blinkingMessage3()
	{
		fr.setSize(400,400);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		fr.add(la);
		la.setFont(new Font("lucida calligraphy",Font.BOLD,20));
		la.addMouseListener(new blinkListener());
		th.start(); //it will create object and also start the thread
		fr.setVisible(true);
	}
	class blinkThread extends Thread
	{
		int ctr=0;
		int time=50;
		public void run()
		{
			while(true)
			{
				la.setVisible(true);  //blinking means to set the programme visible and invisible
				try {
					Thread.sleep(time);
				} catch (Exception e) {}
				la.setVisible(false);
				try {
					Thread.sleep(time);
				} catch (Exception e) {}
				ctr++;
				if(ctr%10==0)
				{
					time+=1;
				}
				if(time>=100)
				{
					la.setVisible(true);
					break;
				}
			}
			
		}
	}

	class blinkListener extends MouseAdapter //use mouse adapter method from java.awt.event.*;
	{
		public void mouseEntered(MouseEvent ev)
		{
			//code to suspend thread
			th.suspend();
		}
		public void mouseExited(MouseEvent ev)
		{
			//code to resume thread
			th.resume();
		}
	}
	public static void main(String[] args) 
	{
		new blinkingMessage3();
	}

}
