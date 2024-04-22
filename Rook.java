import javax.swing.*;

public class Rook extends Queen
{
    private final ImageIcon pieceTeam;
    public Rook(int x, int y, boolean team)
    {
        super(x, y, team);
        if(!team)
            pieceTeam = new ImageIcon("images/DarkBishop.png");
        else
            pieceTeam = new ImageIcon("images/LightBishop.png");
    }
}
