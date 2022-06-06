import java.awt.*;
import java.awt.event.*;
import java.nio.charset.CoderMalfunctionError;
import java.util.Random;

import javax.swing.*;
import javax.swing.text.ChangedCharSetException;


public class MouseMagic 
{
	JFrame frame=new JFrame("Mouse Magic");
	JLabel la=new JLabel("Touch me too see magic");
	Random ra=new Random();
	boolean move=true;
	public MouseMagic()
	{
		frame.setSize(1000,600);
		frame.setDefaultCloseOperation(3);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		la.setFont(new Font("elephant",0,25));
		la.setForeground(Color.blue);
		la.setBounds(200,100,300,35);
		frame.add(la);
		la.addMouseListener(new MagicListener());
		frame.addKeyListener(new StopListener());
		frame.setVisible(true);
	}
	class MagicListener implements MouseListener
	{
		public void mouseClicked(MouseEvent evt) {}
		public void mousePressed(MouseEvent evt) {}
		public void mouseReleased(MouseEvent evt) {}
		public void mouseEntered(MouseEvent evt)
		{
			if(move)
			{
				//Code to Change the location
			int x=ra.nextInt(800);  //this will take data from 0 to 800 & changes automatically
			int y=ra.nextInt(500);   //this will take data from 0 to 800 & changes automatically
			la.setLocation(x, y);
			}
			move=true;
		}
		public void mouseExited(MouseEvent evt) {}	
	}
	class StopListener implements KeyListener
	{
		public void keyTyped(KeyEvent evt) {}
		public void keyPressed(KeyEvent evt) 
		{
			char ch=evt.getKeyChar();
			if(ch=='a' || ch=='A')
				move=false;
		}
		public void keyReleased(KeyEvent evt){}
	}

	public static void main(String[] args) 
	{
		new MouseMagic();
	}

}
