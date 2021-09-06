Developed by Salim Ege Caliskan.

This is a Tic-Tac-Toe game that was made using Swing library with Java (JDK 11). It's my first application made with Java, and first application that implements a GUI. You are playing against a UI that is programmed to make random moves, so it is fun with a chance for the player to actually win, instead of a perfectly programmed algorithm that can never lose. In a future update, I am hoping to revise the code and make a new version with an algorithm that renders it impossible for the computer to lose. It is an ugly looking code, but it is a working code and I am proud of it.

Learnings: I learned how to utilise the Swing library, as well as practiced writing algorithms as I wrote the computer to make a random move following some logic, which takes into account the move the player already made, so the moves don't overlap. Working between multiple classes was also new for me, and even though I am aware I did not do it perfectly, I managed to turn it all into a working app. This is a nice documentation of my progress in Java.

Some explanation of the files: Startmenu.java is the initial window that opens up when the code is executed. Gamemenu.java is the class I used to format Panels.java which is the layout for the game board. ComputerMoves.java and PlayerMoves.java take care of the movements of the computer and the player. The WinCondition file contains the winning, losing, and tying conditions.

Some images of the app:

![TicTacToe-1](https://user-images.githubusercontent.com/87648450/132253479-d4989ef7-fe90-4e90-bfd4-bb4dd9aa01af.PNG)

![TicTacToe-2](https://user-images.githubusercontent.com/87648450/132253480-d86f68ee-7592-4f68-b3a1-31cd02d2a9d6.PNG)
