package Gui;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.plaf.FontUIResource;

public class Startmenu extends JFrame {

    public Startmenu() {

        // FORMATTING THE INITIAL MENU
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tic-Tac-Toe");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationByPlatform(true);
        // Centering the frame
        this.setLocationRelativeTo(null);
        // Formatting the title
        JLabel title = new JLabel("TIC-TAC-TOE by SALIM EGE CALISKAN");
        JLabel subtitle = new JLabel("September, 2021");

        title.setBounds(0, 100, 600, 100);
        subtitle.setBounds(0, 150, 600, 100);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        subtitle.setHorizontalAlignment(SwingConstants.CENTER);
        subtitle.setForeground(Color.BLUE);
        title.setFont(new FontUIResource("Open Sans", 0, 20));
        subtitle.setFont(new FontUIResource("Open Sans", 0, 14));

        // Formatting the button
        JButton startButton = new JButton("Click to start");
        startButton.setBounds(200, 280, 200, 70);
        startButton.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(title);
        this.add(subtitle);
        this.add(startButton);
        this.setVisible(true);

        // Making the button clickable to start the game and close the start menu
        startButton.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Activate the game board
                Panels.start();
                dispose();

            }

        });

    }

}
