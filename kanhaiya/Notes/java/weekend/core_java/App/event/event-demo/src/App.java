import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App 
{
	JFrame frame=new JFrame("Event Demo");
	JPanel pa=new JPanel();
	JButton bt1=new JButton("Red Background");  //bt1 will be event source
	JButton bt2=new JButton("Green Background");  //bt2 will be event source
	
	public App()
	{
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(3);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(pa);
		pa.setBackground(Color.yellow);
		pa.add(bt1);
		pa.add(bt2);
		//Giving object of RedListener class to button bt1.this is called registration
		bt1.addActionListener(new RedListener());
		//Giving object of GreenListener class to button bt2.this is called registration
		bt2.addActionListener(new GreenListener());
		frame.setVisible(true);
	}
	//Defining event listener
	class RedListener implements ActionListener
	{
		//we do not need to write code to call this method
		//This method will be called by event source (component with which event listener is registered)
		//in this method caller will pass object of ActionEvent class
		public void actionPerformed(ActionEvent evt) 
		{
			pa.setBackground(Color.red);	
		}	
	}
	class GreenListener implements ActionListener
	{
		//we do not need to write code to call this method
		//This method will be called by event source (component with which event listener is registered)
		//in this method caller will pass object of ActionEvent class
		public void actionPerformed(ActionEvent evt) 
		{
			pa.setBackground(Color.green);	
		}	
	}
	public static void main(String[] args) 
	{
		new App();
	}

}
