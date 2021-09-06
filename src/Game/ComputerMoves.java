package Game;

import static Gui.Panels.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.util.Random;
import static Game.PlayerMoves.*;



public class ComputerMoves extends Settings {
    //Setting up the Circle image for the computer to place./
    //separate labels using the same image causes fewer bugs than overwriting the same image on all labels
    ImageIcon x = new ImageIcon("images/Circle.png");
    JLabel l1 = new JLabel(x);
    JLabel l2 = new JLabel(x);
    JLabel l3 = new JLabel(x);
    JLabel l4 = new JLabel(x);
    JLabel l5 = new JLabel(x);
    JLabel l6 = new JLabel(x);
    JLabel l7 = new JLabel(x);
    JLabel l8 = new JLabel(x);
    JLabel l9 = new JLabel(x);
    //Keeping track of computer moves just like player moves
    private int computerMoves;
    private int panelNum;
    //Computer status is not used at the moment, but in the future the application could be improved using it.
    public ComputerMoves(int status, int computerMoves) {
        super(status);
        this.setComMoves(computerMoves);
    }

    public void setComMoves(int computerMoves) {
        this.computerMoves = computerMoves;
    }
    public int getComMoves() {
        return computerMoves;
    }
    //computerMoevs begins from 10 and increase by one, to prevent conflict with playerMoves
    static ComputerMoves com1 = new ComputerMoves(0, 10);
    static ComputerMoves com2 = new ComputerMoves(0, 10);
    static ComputerMoves com3 = new ComputerMoves(0, 10);
    static ComputerMoves com4 = new ComputerMoves(0, 10);
    static ComputerMoves com5 = new ComputerMoves(0, 10);
    static ComputerMoves com6 = new ComputerMoves(0, 10);
    static ComputerMoves com7 = new ComputerMoves(0, 10);
    static ComputerMoves com8 = new ComputerMoves(0, 10);
    static ComputerMoves com9 = new ComputerMoves(0, 10);

    //Getting a random number to decide which panel the computer is going to pick.
    public void getRandom() {
        Random rand = new Random();
        panelNum = rand.nextInt(9) + 1; //+1 to get a number between 1 and 9;
//        System.out.println(panelNum);
        }
    public void compMove() {
        PlayerMoves play = new PlayerMoves(0,0);
        WinConditions win = new WinConditions();
        getRandom();

        //activate getRandom method to grab a random integer.
        //Algorithm goes here. Check for the status of panel. Put a circle on a random available panel.

            switch (panelNum) {
                case 1:
                    if (play1.getStatus() == 0) {
                        p1.add(l1);
                        l1.setSize(200, 200);
                        play1.setStatus(1);
                        com1.setComMoves(12);
                        play.play();
                    } else if (play1.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 2:
                    if (play2.getStatus() == 0) {
                        p2.add(l2);
                        l2.setSize(210, 200);
                        play2.setStatus(1);
                        com2.setComMoves(12);
                        play.play();
                    } else if (play2.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 3:
                    if (play3.getStatus() == 0) {
                        p3.add(l3);
                        l3.setSize(220, 200);
                        play3.setStatus(1);
                        com3.setComMoves(12);
                        play.play();
                    } else if (play3.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 4:
                    if (play4.getStatus() == 0) {
                        p4.add(l4);
                        l4.setSize(200, 200);
                        play4.setStatus(1);
                        com4.setComMoves(12);
                        play.play();
                    } else if (play4.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 5:
                    if (play5.getStatus() == 0) {
                        p5.add(l5);
                        l5.setSize(210, 200);
                        play5.setStatus(1);
                        com5.setComMoves(12);
                        play.play();
                    } else if (play5.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 6:
                    if (play6.getStatus() == 0) {
                        p6.add(l6);
                        l6.setSize(220, 200);
                        play6.setStatus(1);
                        com6.setComMoves(12);
                        play.play();
                    } else if (play6.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 7:
                    if (play7.getStatus() == 0) {
                        p7.add(l7);
                        l7.setSize(200, 200);
                        play7.setStatus(1);
                        com7.setComMoves(12);
                        play.play();
                    } else if (play7.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 8:
                    if (play8.getStatus() == 0) {
                        p8.add(l8);
                        l8.setSize(210, 200);
                        play8.setStatus(1);
                        com8.setComMoves(12);
                        play.play();
                    } else if (play8.getStatus() == 1) {
                        compMove();
                    }
                    break;
                case 9:
                    if (play9.getStatus() == 0) {
                        p9.add(l9);
                        l9.setSize(220, 200);
                        play9.setStatus(1);
                        com9.setComMoves(12);
                        play.play();
                    } else if (play9.getStatus() == 1) {
                        compMove();
                    }
                    break;
            }
        }
    }
