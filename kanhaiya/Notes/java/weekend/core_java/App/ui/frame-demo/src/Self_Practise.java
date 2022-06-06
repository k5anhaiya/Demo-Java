import javax.swing.*;
public class Self_Practise 
{
	//write code to create the objects here
	JFrame fr=new JFrame("Test");
	//write code to display the frame inside the constructor
	public Self_Practise()
	{
		fr.setLocation(800,100);
		fr.setSize(400,500);
		fr.setVisible(true);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		
	}
	public static void main(String[] args) 
	{
		new Self_Practise();

	}

}
