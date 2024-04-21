import javax.swing.*;

public class King
{
    private ImageIcon pieceTeam;
    private boolean team;
    public King(boolean team)
    {
        this.team = team;
        if(!team)
            pieceTeam = new ImageIcon("images/DarkKing.png");
        else
            new ImageIcon("images/LightKing.png");
    }
}
