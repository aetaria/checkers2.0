import javax.swing.*;
import java.awt.*;

public class Queen extends Player
{
    private ImageIcon pieceTeam;
    protected int x, y;

    public Queen(boolean team, int x, int y) //false = black ; true = white
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

    public void draw(Graphics g, int[][] arr, ImageIcon pieceIcon)
    {
        pieceIcon.paintIcon(null, g, makePoint(x), makePoint(y));
    }


    public boolean moveStraight(int newX, int newY, int[][] arr) {
        if (newX == x || newY == y) {
            int stepX = (newX > x) ? 1 : (newX < x) ? -1 : 0;
            int stepY = (newY > y) ? 1 : (newY < y) ? -1 : 0;
    
            int currentX = x;
            int currentY = y;
    
            while (currentX != newX || currentY != newY) {
                currentX += stepX;
                currentY += stepY;
    
                if (arr[currentY][currentX] != 0) {
                    return false; 
                }
            }

            x = newX;
            y = newY;
            return true;
        }
        return false;
    }

    public boolean moveDiagonal(int newX, int newY, int[][] arr) {
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
                    return false;
                }
            }
    
            // If the loop completes without finding any obstacle, move the queen
            x = newX;
            y = newY;
            return true;
        }
        return false;
    }

    private int makePoint(int coord)
    {
        return coord * 100;
    }
}