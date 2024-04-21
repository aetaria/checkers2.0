import java.awt.Graphics;

public class Game {

	private Queen qL = new Queen(true);
	private Queen qD = new Queen(false);
	private Bishop bL = new Bishop(true);
	private Bishop bD = new Bishop(false);
	private Rook rL = new Rook(true);
	private Rook rD = new Rook(false);
	private King kL = new King(true);
	private King kD = new King(false);
	
	private int[][] grid = new int[8][8];


//			{{0, 1, 2, 3, 4, 5, 6, 7},
//			{0, 1, 2, 3, 4, 5, 6, 7},
//			{0, 1, 2, 3, 4, 5, 6, 7},
//			{0, 1, 2, 3, 4, 5, 6, 7},
//			{0, 1, 2, 3, 4, 5, 6, 7},
//			{0, 1, 2, 3, 4, 5, 6, 7},
//			{0, 1, 2, 3, 4, 5, 6, 7},
//			{0, 1, 2, 3, 4, 5, 6, 7}};
	
	public Game()
	{
//		0 = nothing ; 1 = king ; 2 = queen ; 3 = rook ; 4 = bishop
//
//		dark pieces
		grid[0][0] = 3; grid[0][2] = 4; grid[0][3] = 2; grid[0][4] = 1; grid[0][5] = 4; grid[0][7] = 3;

//		light pieces
		grid[7][0] = 3; grid[7][2] = 4; grid[7][3] = 2; grid[7][4] = 1; grid[7][5] = 4; grid[7][7] = 3;
	}
	
	public void draw(Graphics g)
	{
		qL.draw(g, grid);
		qD.draw(g, grid);
//		bL.draw(g, grid);
//		bD.draw(g, grid);
//		rL.draw(g, grid);
//		rD.draw(g, grid);
//		kL.draw(g, grid);
//		kD.draw(g, grid);
	}

	public void parseMove(String move)
	{
		
	}
}
