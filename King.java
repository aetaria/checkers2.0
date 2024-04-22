import javax.swing.*;

public class King extends Queen
{
    private ImageIcon pieceTeam;
    private boolean team;
    public King(int x, int y, boolean team)
    {
        super(x, y, team);
        if(!team)
            pieceTeam = new ImageIcon("images/DarkKing.png");
        else
            new ImageIcon("images/LightKing.png");
    }
}
