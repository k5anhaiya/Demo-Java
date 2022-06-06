import javax.swing.*;
import java.awt.*;

public class ImportDemo2 
{
	public static void main(String[] args) 
	{
		JFrame fr=new JFrame();
		fr.setSize(400,400);
		fr.setLocationRelativeTo(null);
		JButton bt=new JButton();
		bt.setForeground(Color.blue);
		bt.setFont(new Font("arial",0,22));
		JPanel pa=new JPanel();
		fr.add(pa);
		pa.add(bt);
		fr.setVisible(true);
		
	}

}
