import java.awt.Graphics;

public class Game {

	Queen qL = new Queen(false);
	Queen qD = new Queen(true);
	Bishop bL = new Bishop(false);
	Bishop bD = new Bishop(true);
	Rook rL = new Rook(false);
	Rook rD = new Rook(true);
	King kL = new King(false);
	King kD = new King(true);
	
	int[][] grid = {{0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}, {0, 1, 2, 3, 4, 5, 6, 7}};
	
	public Game()
	{
		
	}
	
	public void draw()
	{
		qL.draw();
		qD.draw();
		bL.draw();
		bD.draw();
		rL.draw();
		rD.draw();
		kL.draw();
		kD.draw();
	}
}
