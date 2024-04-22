import javax.swing.*;
import java.awt.*;

public class Queen extends Player
{
    private ImageIcon pieceTeam;
    private int x, y;
    private boolean team;

    public Queen(boolean team, int x, int y) extends Player
    {
        super(team);
        this.x = x;
        this.y = y;
        if (!team)
            pieceTeam = new ImageIcon("images/darkQueen.png");
        else
            pieceTeam = new ImageIcon("images/LightQueen.png");
        Image copy = pieceTeam.getImage();
        Image newImage = copy.getScaledInstance(100, 100, 1);
        pieceTeam = new ImageIcon(newImage);
    }

    public void draw(Graphics g, int[][] arr, int piece)
    {
        pieceTeam.paintIcon(null, g, makePoint(x), makePoint(y));
    }

    public void moveStraight(int newX, int newY, int[][] arr)
    {
        // i = y
        for(int i = 0; i < arr.length; i++){
            // j = x
            for(int j = 0; j < arr[i].length; j++){
                if(i == x || j == y){
                    if(arr[i][j] == 0){
                        x = i;
                        y = j;
                    }    
                }
            }
        }
    }

    public void moveDiagonal(int newX, int newY, int[][] arr) {
        int dx = Math.abs(newX - x);
        int dy = Math.abs(newY - y);
    
        // Check if the new position is on a diagonal
        if(dx == dy) {
            int stepX = (newX > x) ? 1 : -1;
            int stepY = (newY > y) ? 1 : -1;
    
            int currentX = x;
            int currentY = y;
    
            // Check if the diagonal path is clear
            while(currentX != newX && currentY != newY) {
                currentX += stepX;
                currentY += stepY;
    
                if (arr[currentY][currentX] != 0) {
                    // Path is blocked, cannot move diagonally
                    return;
                }
            }
    
            // If the loop completes without finding any obstacle, move the queen
            x = newX;
            y = newY;
        }
    }

    private int makePoint(int coord)
    {
        return coord * 100;
    }
}
