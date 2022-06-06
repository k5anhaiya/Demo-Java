import javax.swing.*;
public class App 
{
	//write code to create objects here
	JFrame fr=new JFrame();
     //	write code to display frame inside constructor
	public App()
	{	
		fr.setSize(500,500);
		fr.setLocation(500,100);
		fr.setVisible(true);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		//fr.setDefaultCloseOperation(0);
	}
	public static void main(String[] args) 
	{
		new App();
	}

}
