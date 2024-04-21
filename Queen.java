import javax.swing.*;
import java.awt.*;

public class Queen
{
    private ImageIcon pieceTeam;
    private boolean team;
    public Queen(boolean team) //false = black ; true = white
    {
        this.team = team;

        if(!team)
            pieceTeam = new ImageIcon("images/DarkQueen.png");
        else
            pieceTeam = new ImageIcon("images/LightQueen.png");
    }
    public void draw(Graphics g, Point pos)
    {

    }
}