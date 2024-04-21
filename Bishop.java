import javax.swing.*;

public class Bishop extends Queen
{
    private ImageIcon pieceTeam;
    public Bishop(boolean team)
    {
        super(team);
        if(!team)
            pieceTeam = new ImageIcon("images/DarkBishop.png");
        else
            pieceTeam = new ImageIcon("images/LightBishop.png");

    }
}
