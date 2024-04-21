import javax.swing.*;
import java.awt.*;
import java.util.Random;

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
	public void paintComponent(Graphics g){
		//this line sets up the graphics - always needed
		super.paintComponent(g);
		//all drawings below here:
		Random rng = new Random();
		boolean black = true;
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++){
				if(i > 0 && j == 0){
					if(black){
						black = false;
					}else{
						black = true;
					}
				}
				if(black){
					g.setColor(Color.BLACK);
					g.fillRect(j * 100, i * 100, 100, 100);
					black = false;
				}else{
					g.setColor(Color.WHITE);
					g.fillRect(j * 100, i * 100, 100, 100);
					black = true;
				}
			}
		}
	}
}

