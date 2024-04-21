import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

//must 'extend' JPanel 
//You can rename the class to anything you wish - default is 'PanelTemplate'
public class Panel extends JPanel
{
	//variables for the overall width and height
	private int w, h;
	
	//sets up the initial panel for drawing with proper size
	public Panel(int w, int h)
	{
		this.w = w;
		this.h = h;
		this.setPreferredSize(new Dimension(w,h));
		
	}
	
	
	//all graphical components go here
	//this.setBackground(Color c) for example will change background color
	public void paintComponent(Graphics g)
	{
		//this line sets up the graphics - always needed
		super.paintComponent(g);
		
		//all drawings below here:
		
		
		
	}
}

