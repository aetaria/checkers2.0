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
		String move = JOptionPane.showInputDialog("Enter which piece you want to move and where:");
		game.parseMove(move);
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
		repaint();
	}
}

