package Gui;

import Game.*;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.*;


public class Panels extends JPanel {


    // Creating the layout of the game board
    // Making 3x3 equal squares for the player to choose
    // FIRST ROW

    public static JPanel p1 = new JPanel();
    public static JPanel p2 = new JPanel();
    public static JPanel p3 = new JPanel();
    // SECOND ROW
    public static JPanel p4 = new JPanel();
    public static JPanel p5 = new JPanel();
    public static JPanel p6 = new JPanel();
    // THIRD ROW
    public static JPanel p7 = new JPanel();
    public static JPanel p8 = new JPanel();
    public static JPanel p9 = new JPanel();

    static Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
    static Gamemenu frame = new Gamemenu();



    public Panels() {

    }


    public static void start() {

        frame.menuStart();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 30, 200, 180);
        p1.setBorder(border);
        frame.add(p1);
        p2.setBackground(Color.WHITE);
        p2.setBounds(200, 30, 200, 180);
        p2.setBorder(border);
        frame.add(p2);
        p3.setBackground(Color.WHITE);
        p3.setBounds(400, 30, 200, 180);
        p3.setBorder(border);
        frame.add(p3);
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 210, 200, 180);
        p4.setBorder(border);
        frame.add(p4);
        p5.setBackground(Color.WHITE);
        p5.setBounds(200, 210, 200, 180);
        p5.setBorder(border);
        frame.add(p5);
        p6.setBackground(Color.WHITE);
        p6.setBounds(400, 210, 200, 180);
        p6.setBorder(border);
        frame.add(p6);

        p7.setBackground(Color.WHITE);
        p7.setBounds(0, 390, 200, 180);
        p7.setBorder(border);
        frame.add(p7);
        p8.setBackground(Color.WHITE);
        p8.setBounds(200, 390, 200, 180);
        p8.setBorder(border);
        frame.add(p8);
        p9.setBackground(Color.WHITE);
        p9.setBounds(400, 390, 200, 180);
        p9.setBorder(border);
        frame.add(p9);
        //Transition to Player class
        PlayerMoves x = new PlayerMoves(0,0);
        x.play();
    }

    }




