import java.awt.Graphics;

public class Player {

	private Queen qL = new Queen(3, 7);
	private Bishop bL = new Bishop(true);
	private Rook rL = new Rook(true);
	private King kL = new King(true);
	private Queen qD = new Queen(3, 7, false);
	private Bishop bD = new Bishop(false);
	private Rook rD = new Rook(false);
	private King kD = new King(false);

	private boolean team;
	
	private int[][] grid = new int[8][8];
	public Player(boolean team)
	{
		this.team = team;
//		0 = nothing ; 1 = king ; 2 = queen ; 3 = rook ; 4 = bishop
//		light pieces
		grid[7][0] = 3; grid[7][2] = 4; grid[7][3] = 2; grid[7][4] = 1; grid[7][5] = 4; grid[7][7] = 3;
//		dark pieces
		grid[0][0] = 3; grid[0][2] = 4; grid[0][3] = 2; grid[0][4] = 1; grid[0][5] = 4; grid[0][7] = 3;		
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
			rL.move(col, row, grid);
		}
		else
		{
			bL.move(col, row, grid);
		}
	}
}
