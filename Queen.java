import javax.swing.*;
import java.awt.*;

public class Queen
{
    private ImageIcon pieceTeam;

    public Queen(boolean team) //false = black ; true = white
    {
        if(!team)
            pieceTeam = new ImageIcon("images/DarkQueen.png");
        else
            pieceTeam = new ImageIcon("images/LightQueen.png");

        Image copy = pieceTeam.getImage();
        Image newImage = copy.getScaledInstance(100, 100, 1);
        pieceTeam = new ImageIcon(newImage);
    }
    public void draw(Graphics g, int[][] arr)
    {
        for(int i = 0; i < arr.length; i++){
            int y = i * 100;
            for(int j = 0; j < arr[i].length; j++){
                int x = j * 100;
                if(arr[i][j] == 2)
                    pieceTeam.paintIcon(null, g, x, y);
            }
        }
    }
    public void check(int[][] arr)
    {

    }
}