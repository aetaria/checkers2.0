import java.awt.*;
import javax.swing.*;

public class Player {
	
	private int[][] grid = new int[8][8];
	public Player(boolean team)
	{
		if(boolean)
		{
			private Queen Q = new Queen(true, 3, 7);
			private Bishop B = new Bishop(true, 2, 7);
			private Rook R = new Rook(true, 0, 7);
			private King K = new King(true, 4, 7);
		}
		else
		{
			private Queen Q = new Queen(false, 3, 0);
			private Bishop B = new Bishop(false, 2, 0);
			private Rook R = new Rook(false, 0, 0);
			private King K = new King(false, 4, 0);
		}
//		0 = nothing ; 1 = king ; 2 = queen ; 3 = rook ; 4 = bishop
//		light pieces
		grid[0][0] = 3; grid[0][2] = 4; grid[0][3] = 2; grid[0][4] = 1;

		// dark pieces
		grid[7][0] = 3; grid[7][2] = 4; grid[7][3] = 2; grid[7][4] = 1;
	}
	
	public void draw(Graphics g)
	{
		Q.draw(g, grid, 2);
		B.draw(g, grid, 4);
		R.draw(g, grid, 3);
		K.draw(g, grid, 1);
	}

	public void parseMove(String move)
	{
		char piece = move.charAt(0);
		int col = ((int)move.charAt(1)) - 41;
		int row = Integer.parseInt(move.substring(2, move.length())) - 1;
		if(piece == 'Q')
		{
			char direction = JOptionPane.showMessageDialog("Diagonal or Straight? (D/S):").charAt(0);
			if(direction == 'D')
				Q.moveDiagonal(col, row, grid);
			else
				Q.moveStraight(col, row, grid);
		}
		else if(piece == 'K')
		{
			K.kingMove(col, row, grid);
		}
		else if(piece == 'R')
		{
			boolean legal = R.moveStraight(col, row, grid);
			if(!legal)
				JOptionPane.showMessageDialog(null, "Illegal move");
		}
		else
		{
			boolean legal = B.moveDiagonal(col, row, grid);
			if(!legal)
				JOptionPane.showMessageDialog(null, "Illegal move");
		}
	}
}
