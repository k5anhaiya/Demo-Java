import javax.swing.*;
import java.awt.*;
import java.util.*;

public class stopWatch 
{
	JFrame fr=new JFrame("Stop Watch");
	JLabel la=new JLabel("00:00:00");
	int h=0,m=0,s=0;
	public stopWatch()
	{
		fr.setSize(400,400);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		fr.add(la);
		la.setFont(new Font("lucida calligraphy",Font.BOLD,20));
		new watchThread().start();
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
				
				try {
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
		public static void main(String[] args) 
	{
		new stopWatch();
	}

}
