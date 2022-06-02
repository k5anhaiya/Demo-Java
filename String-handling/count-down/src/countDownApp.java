import javax.swing.*;
import java.awt.*;
import java.util.*;

public class countDownApp
{
	JFrame frame=new JFrame();
	JLabel label=new JLabel("10");
	public countDownApp()
	{
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,100,150));
		frame.add(label);
		new countThread().start();
		label.setFont(new Font("arial",Font.BOLD,25));
		frame.setVisible(true);
	}
	class countThread extends Thread
	{
		public void run()
		{
			for(int num=10;num>=1;num--)
			{
				label.setText(String.valueOf(num)); //String.valueof is used to convert int to string
				try 
				{
					Thread.sleep(1000);
				} catch (Exception e) 
				{System.out.println(e);}
			}
			label.setText("let's play....");
			try 
			{
				Thread.sleep(2000);
			} catch (Exception e) {System.out.println(e);}
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new countDownApp();
		
	}
}
