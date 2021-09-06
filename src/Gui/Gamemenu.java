package Gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

public class Gamemenu extends JFrame {

    public Gamemenu() {

    }

    public void menuStart() {

        // FORMATTING THE INITIAL MENU
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tic-Tac-Toe");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLayout(null);
        // Telling the player how to play.
        JLabel hint = new JLabel("Click on a panel to play!");
        hint.setBounds(0, 0, 600, 100);
        hint.setVerticalAlignment(SwingConstants.TOP);
        hint.setHorizontalAlignment(SwingConstants.CENTER);
        hint.setFont(new FontUIResource("Open Sans", 0, 20));
        this.add(hint);
        setVisible(true);
        // Centering the frame
        this.setLocationRelativeTo(null);
    }
}
