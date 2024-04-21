import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Panel extends JPanel
{
	private int w, h;
	private Game game = new Game();

	public Panel(int w, int h)
	{
		this.w = w;
		this.h = h;
		this.setPreferredSize(new Dimension(w,h));
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Random rng = new Random();
		boolean black = true;
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++){
				if(i > 0 && j == 0){
                    black = !black;
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

		game.draw(g);
	}
	private class KeyControl implements KeyListener
	{
		public void keyTyped(KeyEvent e)
		{

		}

		public void keyPressed(KeyEvent e)
		{
			String s = "";
			switch (e.getKeyCode())
	         {
	            case KeyEvent.VK_A:
	               s = "A";
	               break;
	            case KeyEvent.VK_B:
	            	s = "B";
	               break;
	            case KeyEvent.VK_C:
	            	s = "C";
	               break;
	            case KeyEvent.VK_D:
	            	s = "D";
	               break;
	            case KeyEvent.VK_E:
	            	s = "E";
	            	break;
	            case KeyEvent.VK_F:
	            	s = "F";
	            	break;
	            case KeyEvent.VK_G:
	            	s = "G";
	            	break;
	            case KeyEvent.VK_H:
	            	s = "H";
	            	break;
	            case KeyEvent.VK_1:
	            	s = "1";
	            	break;
	            case KeyEvent.VK_2:
	            	s = "2";
	            	break;
	            case KeyEvent.VK_3:
	            	s = "3";
	            	break;
	            case KeyEvent.VK_4:
	            	s = "4";
	            	break;
	            case KeyEvent.VK_5:
	            	s = "5";
	            	break;
	            case KeyEvent.VK_6:
	            	s = "6";
	            	break;
	            case KeyEvent.VK_7:
	            	s = "7";
	            	break;
	            case KeyEvent.VK_8:
	            	s = "8";
	            	break;
	            case KeyEvent.VK_BACK_SPACE:
	            	s = "remove";
	            	break;
	         }

		}

		public void keyReleased(KeyEvent e)
		{

		}

	}
}

