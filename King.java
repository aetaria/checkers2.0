import javax.swing.*;

public class King extends Queen
{
    private ImageIcon pieceTeam;
    private boolean team;
    public King(boolean team)
    {
        super(team);
        if(!team)
            pieceTeam = new ImageIcon("images/DarkKing.png");
        else
            new ImageIcon("images/LightKing.png");
    }
}
