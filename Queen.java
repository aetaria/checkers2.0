import javax.swing.*;
import java.awt.*;

public class Queen
{
    private ImageIcon pieceTeam;
    private int x, y;
    private boolean team;

    public Queen(int x, int y, boolean team)
    {
        this.x = x;
        this.y = y;
        pieceTeam = new ImageIcon("images/LightQueen.png");
        this.team = team;
        Image copy = pieceTeam.getImage();
        Image newImage = copy.getScaledInstance(100, 100, 1);
        pieceTeam = new ImageIcon(newImage);
    }

    public void draw(Graphics g, int[][] arr, int piece)
    {
        for(int i = 0; i < arr.length; i++){
            int y = i * 100;
            for(int j = 0; j < arr[i].length; j++){
                int x = j * 100;
                if(arr[i][j] == piece)
                    pieceTeam.paintIcon(null, g, x, y);

            }
        }
    }

    public void move(int newX, int newY, int[][] arr)
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
                int dY = y - j;
                if()
            }
        }
        return false;

    }
}
