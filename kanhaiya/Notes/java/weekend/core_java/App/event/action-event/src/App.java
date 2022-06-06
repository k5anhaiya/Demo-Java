import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App 
{
	JFrame frame=new JFrame("Event Demo");
	JPanel pa=new JPanel();
	JButton bt1=new JButton("Red");
	JButton bt2=new JButton("Green");
	JButton bt3=new JButton("Blue");
	JButton bt4=new JButton("Black");
	
	public App()
	{
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(3);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(pa);
		pa.setBackground(Color.yellow);
		ColorListener listener=new ColorListener();
		bt1.addActionListener(listener);
		bt2.addActionListener(listener);
		bt3.addActionListener(listener);
		bt4.addActionListener(listener);
		pa.add(bt1);
		pa.add(bt2);
		pa.add(bt3);
		pa.add(bt4);
		frame.setVisible(true);
	}
	class ColorListener implements ActionListener
	{
		//object of ActionEvent class hold reference of the button that will be clicked by user
		public void actionPerformed(ActionEvent evt) 
		{
			Object source=evt.getSource();
			//getSource() method returns button's reference
			//when red button is clicked
			if(source==bt1)
			pa.setBackground(Color.red);
			//when green button is clicked
			if(source==bt2)
			pa.setBackground(Color.green);
			//when blue button is clicked
			if(source==bt3)
			pa.setBackground(Color.blue);
			//when black button is clicked
			if(source==bt4)
			pa.setBackground(Color.black);
		}	
	}
	
	public static void main(String[] args) 
	{
		new App();
	}

}
