import javax.swing.*;

public class Rook extends Queen
{
    private final ImageIcon pieceTeam;
    public Rook(boolean team, int x, int y)
    {
        super(team, x, y);
        if(!team)
            pieceTeam = new ImageIcon("images/DarkBishop.png");
        else
            pieceTeam = new ImageIcon("images/LightBishop.png");
    }
}
