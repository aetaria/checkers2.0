import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel
{
	private int w, h;
	private Player player1 = new Player(true);
	private Player player2 = new Player(false);
	int playerTracker = 0;

	public Panel(int w, int h)
	{
		this.w = w;
		this.h = h;
		this.setPreferredSize(new Dimension(w,h));
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(playerTracker == 0)
		{
			String move = JOptionPane.showInputDialog("White, enter which piece you want to move and where:");
			player1.parseMove(move);
			playerTracker++;
		}
		else if(playerTracker == 1)
		{
			String move = JOptionPane.showInputDialog("Black, enter which piece you want to move and where:");
			player2.parseMove(move);
			playerTracker--;
		}
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
		repaint();
	}
}

