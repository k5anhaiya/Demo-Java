import java.awt.*;
import javax.swing.*;
public class LoginForm 
{
	JFrame fr=new JFrame("LOGIN FORM");
	JLabel la1=new JLabel("Enter user id:");
	JLabel la2=new JLabel("Enter password:");
	JTextField tb1=new JTextField();
	JPasswordField tb2=new JPasswordField();
	JButton bt=new JButton("Login");
	
	public LoginForm()
	{
		fr.setSize(400,500);  //to set the size we pass width & height
		fr.setLocation(400,100);    //to set the location we pass x-axis & y-axis
		fr.setDefaultCloseOperation(3);  //to close the operation on x click
		fr.setResizable(false);      //to disable the resizable features
		fr.setLayout(null);            //whenever we add component we set this as null
		addComponents();             //to run the method addComponents
		fr.setVisible(true);      //to make frame visible
		makeStylish();
	}
	private void makeStylish()   //changing of font
	{
		Font font=new Font("Lucida calligraphy",0,15);   //("fontName",plainBoldItalic,fontSize);
		la1.setFont(font);
		la2.setFont(font);
		Font font1=new Font("Arial", 0, 18);
		tb1.setFont(font1);
		tb2.setFont(font1);
		Font font2=new Font("verdana",0,20);
		bt.setFont(font2);
		Color c1=new Color(0, 0,255);  //this is for blue color
		la1.setForeground(c1);
		la2.setForeground(Color.red);  //this is predefined color
		fr.getContentPane().setBackground(Color.yellow);  //to get to change the background
		bt.setBackground(Color.PINK);   //to change the color of the login button
		bt.setForeground(Color.black);
		
	}
	private void addComponents()
	{
		//call method to set the location and size of the component
		la1.setBounds(50,80,150,30);   //to give size to the label1(x,y,width, height)
		//call method to add component inside frame
		fr.add(la1);        		 //to add label1 to frame
		tb1.setBounds(200,80,160,30);	//to give size to textbox1(x,y,width,height)
		fr.add(tb1);					//to add textbox1 to frame        
		la2.setBounds(50,140,150,30);
		fr.add(la2);
		tb2.setBounds(200,140,160,30);
		fr.add(tb2);
		bt.setBounds(150,210,100,30);
		fr.add(bt);
	}
	public static void main(String[] args) 
	{
		new LoginForm();
	}
}
