import javax.swing.*;

public class King extends Queen
{
    private ImageIcon pieceTeam;
    private boolean team;
    public King(boolean team, int x, int y)
    {
        super(team, x, y);
        if(!team)
            pieceTeam = new ImageIcon("images/DarkKing.png");
        else
            new ImageIcon("images/LightKing.png");
    }

    public void moveDiagonal()
    {
    }

    public void moveStraight()
    {
    }

    public void kingMove()
    {
        
    }
}
