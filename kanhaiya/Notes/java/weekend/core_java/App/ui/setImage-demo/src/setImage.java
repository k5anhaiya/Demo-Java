import javax.swing.*;
import java.awt.*;

public class setImage 
{
	JFrame frame=new JFrame("Kanhaiya Kumar");
	JButton bt=new JButton();
	
	public setImage()
	{
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3);
		setbutton();
		frame.setVisible(true);
	}
	private void setbutton()
	{
		bt.setBounds(50,50,250,250);
		frame.add(bt);
	}
	public static void main(String[] args) 
	{
		new setImage();
	}
}
