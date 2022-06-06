import javax.swing.*;
import java.awt.*;
import java.util.*;

public class timeApp 
{
	JFrame fr=new JFrame("Blinking Message");
	JLabel la=new JLabel();
	public timeApp()
	{
		fr.setSize(400,400);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		fr.add(la);
		la.setFont(new Font("lucida calligraphy",Font.BOLD,20));
		new timeThread().start();
		fr.setVisible(true);
	}
	private void setTime()
	{
		String x="AM";
		Date dt=new Date();
		int h=dt.getHours();
		if(h>12)
		{
			h-=12;
			x="PM";
		}
		int m=dt.getMinutes();
		int s=dt.getSeconds();
		//to add 0 to the hours minutes and seconds
		//this is the use of ternary operator
		String time=h+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
		la.setText(time+" "+x);
	}
	class timeThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				setTime();
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {}
			}
		}
	}
		public static void main(String[] args) 
	{
		new timeApp();
	}

}
