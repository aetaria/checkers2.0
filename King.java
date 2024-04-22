import javax.swing.*;

public class King extends Queen
{
    private ImageIcon pieceTeam;
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

    public boolean kingMove(int newX, int newY, int[][] arr) {
        int dx = Math.abs(newX - x);
        int dy = Math.abs(newY - y);

        if ((dx == 1 && dy == 0) || (dx == 0 && dy == 1) || (dx == 1 && dy == 1)) {
            if (arr[newY][newX] == 0) {
                x = newX;
                y = newY;
                return true;
            }
        }
        return false;
    }
}
