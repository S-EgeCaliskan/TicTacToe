package Game;
import Gui.Gamemenu;

import javax.swing.JOptionPane;

import static Game.ComputerMoves.*;
import static Game.PlayerMoves.*;


public class WinConditions extends Gamemenu{
    //WIN CONDITIONS

    public boolean a = (play1.getPlayerMoves() + play2.getPlayerMoves() + play3.getPlayerMoves() == 3);
    public boolean b = (play4.getPlayerMoves() + play5.getPlayerMoves() + play6.getPlayerMoves() == 3);
    public boolean c = (play7.getPlayerMoves() + play8.getPlayerMoves() + play9.getPlayerMoves() == 3);
    public boolean d = (play1.getPlayerMoves() + play4.getPlayerMoves() + play7.getPlayerMoves() == 3);
    public boolean e = (play2.getPlayerMoves() + play5.getPlayerMoves() + play8.getPlayerMoves() == 3);
    public boolean f = (play3.getPlayerMoves() + play6.getPlayerMoves() + play9.getPlayerMoves() == 3);
    public boolean g = (play1.getPlayerMoves() + play5.getPlayerMoves() + play9.getPlayerMoves() == 3);
    public boolean h = (play3.getPlayerMoves() + play5.getPlayerMoves() + play7.getPlayerMoves() == 3);

    //LOSE CONDITIONS
    public  boolean aa = (com1.getComMoves()+com2.getComMoves()+com3.getComMoves()==36);
    public  boolean bb = (com4.getComMoves()+com5.getComMoves()+com6.getComMoves()==36);
    public  boolean cc = (com7.getComMoves()+com8.getComMoves()+com9.getComMoves()==36);
    public  boolean dd = (com1.getComMoves()+com4.getComMoves()+com7.getComMoves()==36);
    public  boolean ee = (com2.getComMoves()+com5.getComMoves()+com8.getComMoves()==36);
    public  boolean ff = (com3.getComMoves()+com6.getComMoves()+com9.getComMoves()==36);
    public  boolean gg = (com1.getComMoves()+com5.getComMoves()+com9.getComMoves()==36);
    public  boolean hh = (com3.getComMoves()+com5.getComMoves()+com7.getComMoves()==36);
    //RESULTS
    public void checkWin() {
        if(a || b || c || d || e || f || g || h){
            JOptionPane.showMessageDialog(null, "You won!");
            //Closes the application
            System.exit(0);

        }
        if (aa || bb || cc || dd || ee || ff || gg || hh){
            JOptionPane.showMessageDialog(null, "You lost!");
            System.exit(0);

        }
        //Check if, following the last move, you don't win, then it's a tie.
        if (totalPlayerMoves == 5){
            JOptionPane.showMessageDialog(null, "It's a tie!!");
            System.exit(0);
        }
    }
}


