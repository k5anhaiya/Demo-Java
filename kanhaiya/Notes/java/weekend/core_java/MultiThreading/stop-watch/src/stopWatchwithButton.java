import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class stopWatchwithButton 
{
	JFrame fr=new JFrame("Stop Watch");
	JLabel la=new JLabel("00:00:00");
	JButton bt=new JButton("START");
	watchThread th;
	int h=0,m=0,s=0;
	public stopWatchwithButton()
	{
		fr.setSize(400,400);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,180,100));
		fr.add(la);
		fr.add(bt);
		la.setFont(new Font("lucida calligraphy",Font.BOLD,20));
		bt.addActionListener(new watchListener());
		fr.setVisible(true);
	}
	class watchThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				String time=(h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
				la.setText(time);
				
				try 
				{
					Thread.sleep(1000);
				} catch (Exception ex) {}
				s++;
				if(s==60)
				{
					s=0;
					m++;
					if(m==60)
					{
						m=0;
						h++;
					}
				}
			}
		}
	}
	class watchListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			
			if(bt.getText().equals("START"))
			{
			th=new watchThread();
			th.start();
			bt.setText("STOP");
			}
			else
			{
				th.stop();
				bt.setText("START");
				h=m=s=0;
			}
			
		}
		
	}
		public static void main(String[] args) 
	{
		new stopWatchwithButton();
	}

}
