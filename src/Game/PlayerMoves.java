package Game;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

import static Gui.Panels.*;

public class PlayerMoves extends Settings {

    //Setting up the image file for X for the player to use.
    //separate labels using the same image causes fewer bugs than overwriting the same image on all labels
    //Especially when the application window is moved around
    ImageIcon x = new ImageIcon("images/Cross.png");
    JLabel l1 = new JLabel(x);
    JLabel l2 = new JLabel(x);
    JLabel l3 = new JLabel(x);
    JLabel l4 = new JLabel(x);
    JLabel l5 = new JLabel(x);
    JLabel l6 = new JLabel(x);
    JLabel l7 = new JLabel(x);
    JLabel l8 = new JLabel(x);
    JLabel l9 = new JLabel(x);

    public int playerMoves;

    public PlayerMoves(int status,int playerMoves) {
        super(status);
        this.setPlayerMoves(playerMoves);
    }

    //GETTERS AND SETTERS
    public void setPlayerMoves(int playerMoves){
        this.playerMoves = playerMoves;
    }
    public int getPlayerMoves(){
        return playerMoves;
    }
    //Making instances for each move to use them with the corresponding panel
    //the word 'play' here refers to the player interacting with panels. each panel has its own instance.
    // in order to keep track of the status and total playerMoves, initial numbers are zero
    //To keep track of total player moves, I increase only play1's playerMoves
    static PlayerMoves play1 = new PlayerMoves(0,0);
    static PlayerMoves play2 = new PlayerMoves(0,0);
    static PlayerMoves play3 = new PlayerMoves(0,0);
    static PlayerMoves play4 = new PlayerMoves(0,0);
    static PlayerMoves play5 = new PlayerMoves(0,0);
    static PlayerMoves play6 = new PlayerMoves(0,0);
    static PlayerMoves play7 = new PlayerMoves(0,0);
    static PlayerMoves play8 = new PlayerMoves(0,0);
    static PlayerMoves play9 = new PlayerMoves(0,0);

    static int totalPlayerMoves=0; //keeping track of the total moves made by the player to stop the computer infinitely going on.


    public void checkEnd(){
        WinConditions win = new WinConditions();
        if(totalPlayerMoves == 5){ //to ensure the game ends after the last move of the player
        win.checkWin();
        }
    }

    public void play() {
        WinConditions win = new WinConditions();

        ComputerMoves com1 = new ComputerMoves(0,10);

        win.checkWin();

        //Making panels clickable and adding X's to where the player clicks
        //After the player makes a move, the computer will place an O to a random available panel.
        //status 0 means the panel is available, 1 means its taken.

            //PANEL 1
            p1.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play1.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            //After one click, the mouse listener is removed to prevent from multiple clicks on the same panel
                            p1.removeMouseListener(this);
                            p1.add(l1);
                            l1.setSize(200, 200);
                            //Marking the panel as taken, in order to see whether the player won or not,
                            //by adding possible panels together to see if they amount to 3, in which case
                            //it would indicate a win.
                            //Setting statuses to 1 in order to eliminate the panel
                            play1.setStatus(1);
                            play1.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) { //5th moves is the last move the player will make
                                                        // That's when the computer will stop.
                                com1.compMove();
                            }
                        }
                    } else if (play1.getStatus() == 1) {
                        p1.removeMouseListener(this); //if the square is taken, it becomes non-interactable.
                    }
                }
            });
            //PANEL 2
            p2.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play2.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p2.removeMouseListener(this);
                            p2.add(l2);
                            l2.setSize(210, 200);
                            play2.setStatus(1);
                            play2.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play2.getStatus() == 1) {
                        p2.removeMouseListener(this);
                    }
                }
            });
            //PANEL 3
            p3.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play3.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p3.removeMouseListener(this);
                            p3.add(l3);
                            l3.setSize(220, 200);
                            play3.setStatus(1);
                            play3.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play3.getStatus() == 1) {
                        p3.removeMouseListener(this);
                    }
                }
            });
            //PANEL 4
            p4.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play4.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p4.removeMouseListener(this);
                            p4.add(l4);
                            l4.setSize(200, 200);
                            play4.setStatus(1);
                            play4.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play4.getStatus() == 1) {
                        p4.removeMouseListener(this);
                    }
                }
            });
            //PANEL 5
            p5.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play5.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p5.removeMouseListener(this);
                            p5.add(l5);
                            l5.setSize(210, 200);
                            play5.setStatus(1);
                            play5.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play5.getStatus() == 1) {
                        p5.removeMouseListener(this);
                    }
                }
            });
            //PANEL 6
            p6.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play6.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p6.removeMouseListener(this);
                            p6.add(l6);
                            l6.setSize(220, 200);
                            play6.setStatus(1);
                            play6.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play6.getStatus() == 1) {
                        p6.removeMouseListener(this);

                    }
                }
            });
            //PANEL 7
            p7.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play7.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p7.removeMouseListener(this);
                            p7.add(l7);
                            l7.setSize(200, 200);
                            play7.setStatus(1);
                            play7.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play7.getStatus() == 1) {
                        p7.removeMouseListener(this);
                    }
                }
            });
            //PANEL 8
            p8.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play8.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p8.removeMouseListener(this);
                            p8.add(l8);
                            l8.setSize(210, 200);
                            play8.setStatus(1);
                            play8.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play8.getStatus() == 1) {
                        p8.removeMouseListener(this);

                    }
                }
            });
            //PANEL 9
            p9.addMouseListener(new MouseInputAdapter() {
                @Override
                public void mouseClicked(MouseEvent e1) {
                    if (play9.getStatus() == 0) {
                        if (e1.getClickCount() == 1) {
                            p9.removeMouseListener(this);
                            p9.add(l9);
                            l9.setSize(220, 200);
                            play9.setStatus(1);
                            play9.setPlayerMoves(1);
                            totalPlayerMoves++;
                            checkEnd();
                            if(totalPlayerMoves !=5) {
                                com1.compMove();
                            }
                        }
                    } else if (play9.getStatus() == 1) {
                        if (e1.getClickCount() == 1) {
                            p9.removeMouseListener(this);

                        }
                    }
                }
            });

        }
    }

