import javax.swing.*;

public class Rook extends Queen
{
    private final ImageIcon pieceTeam;
    public Rook(boolean team)
    {
        super(team);
        if(!team)
            pieceTeam = new ImageIcon("images/DarkBishop.png");
        else
            pieceTeam = new ImageIcon("images/LightBishop.png");
    }
}
