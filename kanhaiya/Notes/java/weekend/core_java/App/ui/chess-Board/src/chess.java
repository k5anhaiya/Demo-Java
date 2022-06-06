import java.awt.*;
import java.util.*;
import javax.swing.*;


public class chess 
{
	JFrame fr=new JFrame("Chess Board");
	//bt array will hold button class object
	JButton [][] bt=new JButton[8][8];
	public chess()
	{
		fr.setSize(800,600);
		fr.setLocation(100,40);
		fr.setDefaultCloseOperation(3);
		fr.setResizable(false);
		addButtons();
		fr.setVisible(true);
	}
	//Method to add buttons into frame
	private void addButtons()
	{
		GridLayout layout=new GridLayout(8,8);
		fr.setLayout(layout);
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				bt[i][j]=new JButton();
				fr.add(bt[i][j]);
				if((i+j)%2==0)
				{
					bt[i][j].setBackground(Color.white);
				}
				else
				{
					bt[i][j].setBackground(Color.red);
				}	
			}
		}
		setImages();
	}
	//Method to set image into button.
	private void setImages()
	{
		//getClass() methods returns object of class class, this is implict object
		//getResource is a method of class class, it returns url.
		ImageIcon icon3=new ImageIcon(getClass().getResource("image/bp.gif"));
		ImageIcon icon4=new ImageIcon(getClass().getResource("image/wp.gif"));
		for(int i=0;i<8;i++)
		{
		ImageIcon icon1=new ImageIcon(getClass().getResource("image/b"+i+".gif"));
		bt[0][i].setIcon(icon1);
		bt[1][i].setIcon(icon3);
		ImageIcon icon2=new ImageIcon(getClass().getResource("image/w"+i+".gif"));
		bt[7][i].setIcon(icon2);
		bt[6][i].setIcon(icon4);
		}
	}
	
	public static void main(String[] args) 
	{
		new chess();
	}

}
