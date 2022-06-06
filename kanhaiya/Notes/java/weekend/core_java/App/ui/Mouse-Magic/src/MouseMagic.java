import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class MouseMagic 
{
	JFrame fr=new JFrame("Mouse Magic");
	JLabel la=new JLabel("Touch me to see magic");
	Random ra=new Random();
	boolean move=true;
	public MouseMagic()
	{
		fr.setSize(1000,600);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(null);
		la.setFont(new Font("elephant",0,20));
		la.setForeground(Color.blue);
		la.setBounds(200,100,240,30);
		fr.add(la);
		la.addMouseListener(new MagicListener());
		fr.addKeyListener(new StopListener());
		fr.setVisible(true);
	}	
class MagicListener implements MouseListener
{
  public void mouseEntered(MouseEvent evt) 
  {
   if(move)
   {
    //code to change location of label
    int x=ra.nextInt(800);
    int y=ra.nextInt(500);
    la.setLocation(x, y);
   }
   move=true;
  }
  public void mouseExited(MouseEvent evt) {}
  public void mouseClicked(MouseEvent evt){} 
  public void mousePressed(MouseEvent evt){} 
  public void mouseReleased(MouseEvent evt){} 
 }
 class StopListener implements KeyListener
 {
  public void keyPressed(KeyEvent evt) 
  {
   char ch=evt.getKeyChar();
   if(ch=='a' || ch=='A')
    move=false;
  }
  public void keyReleased(KeyEvent ect){} 
  public void keyTyped(KeyEvent ect){} 
 }
 public static void main(String[] args) 
 {
  new MouseMagic();
 }
}
