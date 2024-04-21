import java.awt.Graphics;

public class Game {

	Queen qL = new Queen();
	Queen qD = new Queen();
	Bishop bL = new Bishop();
	Bishop bD = new Bishop();
	Rook rL = new Rook();
	Rook rD = new Rook();
	King kL = new King();
	King kD = new King();
	
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
