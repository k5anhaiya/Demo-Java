import javax.swing.*;
import java.awt.*;


public class ticTacToe 
{
	
	JFrame fr=new JFrame();
	JPanel [] pa=new JPanel[3];
	JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
	JLabel msg=new JLabel("First player turn....");
	JButton button=new JButton("RESET");
	JButton [] bt=new JButton[9]; 
	
	public ticTacToe()
	{
		fr.setSize(500,700);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.add(la);
		la.setLayout(null);
		addpanel();
		fr.setVisible(true);
	}
	//Method to add panel into label
	private void addpanel()
	{
		for(int i=0;i<3;i++)
		{
			pa[i]=new JPanel();
			la.add(pa[i]);
		}
		pa[0].setBounds(50,20,400,40);
		pa[1].setBounds(50,90,400,400);
		pa[2].setBounds(50,520,400,40);
		addInfo();
	}
	//Method to add message to La[0] & reset button[2]
	private void addInfo()
	{
		pa[0].add(msg);
		msg.setFont(new Font("lucida calligraphy",0,25));
		msg.setForeground(Color.blue);
		pa[2].add(button);
		button.setFont(new Font("arial",0,20));
		pa[2].setOpaque(false);  //to make the panel transparent
		addButtons();
	}
	//Method to add tic tac toe butttons into la[1]
	private void addButtons()
	{
		pa[1].setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++)
		{
			bt[i]=new JButton();
			pa[1].add(bt[i]);
			bt[i].setBackground(Color.CYAN);
		}
	}
	public static void main(String[] args) 
	{
		new ticTacToe();
	}
	
}
