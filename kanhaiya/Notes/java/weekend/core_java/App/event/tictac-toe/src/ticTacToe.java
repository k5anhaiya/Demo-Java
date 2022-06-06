import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ticTacToe 
{
	JFrame fr=new JFrame("Tic Tac Toe");
	JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
	JPanel [] pa=new JPanel[3];
	JLabel msg=new JLabel("First player turn...");
	JButton reset=new JButton("RESET");
	JButton [] bt=new JButton[9];
	ImageIcon icon1=new ImageIcon(getClass().getResource("images/user1.png"));
	ImageIcon icon2=new ImageIcon(getClass().getResource("images/user2.png"));
	int player=1;
	boolean winnerFound=false;
	int count=0;
	public ticTacToe()
	{		
		fr.setSize(500,630);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.add(la);
		la.setLayout(null);
		addPanels();
		fr.setVisible(true);
	}
	private void addPanels()
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
		addButtons();
	}
	private void addInfo()
	{
		pa[0].add(msg);
		msg.setFont(new Font("lucida calligraphy",0,20));
		msg.setForeground(Color.blue);
		pa[2].add(reset);
		reset.setFont(new Font("arial",0,19));
		reset.addActionListener(new ResetListener());
		reset.setEnabled(false);
		pa[2].setOpaque(false);
	}
	private void addButtons()
	{
		pa[1].setLayout(new GridLayout(3,3));
		TicListener listener=new TicListener();
		for(int i=0;i<9;i++)
		{
			bt[i]=new JButton();
			bt[i].addActionListener(listener);
			pa[1].add(bt[i]);
			bt[i].setBackground(Color.yellow);
		}
	}
	class TicListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) 
		{
			//getting reference of the button that would be clicked by user
			JButton bb=(JButton)evt.getSource();
			
			//code to set image into button for first player
			if(player==1)
			{
				bb.setIcon(icon1);
				msg.setText("Second player turn...");
				msg.setForeground(Color.black);
				player=2;
				//this code will disable button that would be clicked
				bb.setEnabled(false);
				findWinner(icon1);
			}
			//code to set image into button for second player
			else if(player==2)
			{
				bb.setIcon(icon2);
				msg.setText("First player turn...");
				msg.setForeground(Color.blue);
				player=1;
				bb.setEnabled(false);
				findWinner(icon2);
			}
			count++;
			if(count==9 && !winnerFound)
			{
				msg.setText("No one is winner...");
				msg.setForeground(Color.red);
				reset.setEnabled(true);
			}
		}
		//code to check images in buttons row wise or column wise or dialogoal
		private void findWinner(ImageIcon icon)
		{
			if(bt[0].getIcon()==icon && bt[1].getIcon()==icon && bt[2].getIcon()==icon)
				announceWinner(0,1,2,icon);
			if(bt[3].getIcon()==icon && bt[4].getIcon()==icon && bt[5].getIcon()==icon)
				announceWinner(3,4,5,icon);
			if(bt[6].getIcon()==icon && bt[7].getIcon()==icon && bt[8].getIcon()==icon)
				announceWinner(6,7,8,icon);
			if(bt[0].getIcon()==icon && bt[3].getIcon()==icon && bt[6].getIcon()==icon)
				announceWinner(0,3,6,icon);
			if(bt[1].getIcon()==icon && bt[4].getIcon()==icon && bt[7].getIcon()==icon)
				announceWinner(1,4,7,icon);
			if(bt[2].getIcon()==icon && bt[5].getIcon()==icon && bt[8].getIcon()==icon)
				announceWinner(2,5,8,icon);
			if(bt[0].getIcon()==icon && bt[4].getIcon()==icon && bt[8].getIcon()==icon)
				announceWinner(0,4,8,icon);
			if(bt[2].getIcon()==icon && bt[4].getIcon()==icon && bt[6].getIcon()==icon)
				announceWinner(2,4,6,icon);
			
		}
		private void announceWinner(int i,int j,int k,ImageIcon icon)
		{
			if(icon==icon1)
				msg.setText("First player is the winner...");
			else
				msg.setText("Second player is the winner...");
			msg.setForeground(new Color(128,0,128));
			bt[i].setBackground(Color.red);
			bt[j].setBackground(Color.red);
			bt[k].setBackground(Color.red);
			disableAll(false);
			winnerFound=true;
			reset.setEnabled(true);
		}
		private void disableAll(boolean st)
		{
			for(JButton bb:bt)
				bb.setEnabled(st);
		}
	}
	class ResetListener implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) 
		{
			for(JButton bb:bt)
			{
				bb.setEnabled(true);
				bb.setBackground(Color.yellow);
				bb.setIcon(null);
			}
			msg.setText("First player turn...");
			msg.setForeground(Color.blue);
			player=1;
			winnerFound=false;
			count=0;
			reset.setEnabled(false);
		}
	}
	public static void main(String[] args) 
	{
		new ticTacToe();
	}
}
