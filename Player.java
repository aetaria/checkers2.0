import java.awt.Graphics;

public class Player {

	private Queen qL = new Queen(true, 3, 7);
	private Queen qD = new Queen(false, 3, 0);
	private Bishop bL = new Bishop(true, 2, 7);
	private Bishop bD = new Bishop(false, 2, 0);
	private Rook rL = new Rook(true, 0, 7);
	private Rook rD = new Rook(false, 0, 0);
	private King kL = new King(true, 4, 7);
	private King kD = new King(false, 4, 0);
	
	private int[][] grid = new int[8][8];
	public Player(boolean team)
	{
//		0 = nothing ; 1 = king ; 2 = queen ; 3 = rook ; 4 = bishop
//		light pieces
		grid[0][0] = 3; grid[0][2] = 4; grid[0][3] = 2; grid[0][4] = 1;

		// dark pieces
		grid[7][0] = 3; grid[7][2] = 4; grid[7][3] = 2; grid[7][4] = 1;
	}
	
	public void draw(Graphics g)
	{
		qL.draw(g, grid, 2);
		bL.draw(g, grid, 4);
		rL.draw(g, grid, 3);
		kL.draw(g, grid, 1);
		qD.draw(g, grid, 2);
		bD.draw(g, grid, 4);
		rD.draw(g, grid, 3);
		kD.draw(g, grid, 1);
	}

	public void parseMove(String move)
	{
		char piece = move.charAt(0);
		int col = ((int)move.charAt(1)) - 41;
		int row = Integer.parseInt(move.substring(2, move.length()));
		if(piece == 'Q')
		{
			qL.move(col, row, grid);
		}
		else if(piece == 'K')
		{
			kL.move(col, row, grid);
		}
		else if(piece == 'R')
		{
			boolean legal = rL.moveStraight(col, row, grid);
			if(!legal)
				JOptionPane.showMessageDialog("Illegal move");
		}
		else
		{
			boolean legal = bL.moveDiagonal(col, row, grid);
			if(!legal)
				JOptionPane.showMessageDialog("Illegal move");
		}
	}
}
