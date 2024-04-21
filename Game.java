import java.awt.Graphics;

public class Game {

	private Queen qL = new Queen(3, 7);
	private Bishop bL = new Bishop(true);
	private Rook rL = new Rook(true);
	private King kL = new King(true);
	
	private int[][] grid = new int[8][8];
	public Game()
	{
//		0 = nothing ; 1 = king ; 2 = queen ; 3 = rook ; 4 = bishop
//		light pieces
		grid[7][0] = 3; grid[7][2] = 4; grid[7][3] = 2; grid[7][4] = 1; grid[7][5] = 4; grid[7][7] = 3;
	}
	
	public void draw(Graphics g)
	{
		qL.draw(g, grid, 2);
		bL.draw(g, grid, 4);
		rL.draw(g, grid, 3);
		kL.draw(g, grid, 1);
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
			rL.move(col, row, grid);
		}
		else
		{
			bL.move(col, row, grid);
		}
	}
}
