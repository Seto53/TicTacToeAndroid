package com.setomaster.tictactoe;

import java.util.Random;
import java.util.Scanner;
public class TicTacToe{

   /**
     * <b>main</b> of the application. Creates the instance of  GameController
     * and starts the game. If two parameters line  and column
     * are passed, they are used.
     * Otherwise, a default value is used. Defaults values are also
     * used if the paramters are too small (less than 2).
     *
     * @param args
     *            command line parameters
     */
     public static void main(String[] args) {

        TicTacToeGame game;
        int lines = 3;
        int columns = 3;
        int win = 3;


        try{
            if (args.length >= 2) {
                lines = Integer.parseInt(args[0]);
                if(lines<2){
                    System.out.println("Invalid argument, using default...");
                    lines = 3;
                }
                columns = Integer.parseInt(args[1]);
                if(columns<2){
                    System.out.println("Invalid argument, using default...");
                    columns = 3;
                }
            }
            if (args.length >= 3){
                win = Integer.parseInt(args[2]);
                if(win<2){
                    System.out.println("Invalid argument, using default...");
                    win = 3;
                }
            }
            if (args.length > 3){
                System.out.println("Too many arguments. Only the first 3 are used.");
            }

        } catch(NumberFormatException e){
            System.out.println("Invalid argument, using default...");
            lines   = 3;
            columns  = 3;
            win = 3;
        }

        Player[] players;
        players = new Player[2];
        players[0] = new HumanPlayer();
        players[1] = new ComputerRandomPlayer();
        String playAgain = "y";
         Random rand = new Random();
        int firstPlayer;

        while(playAgain.equals("y") || playAgain.equals("Y")){
          game = new TicTacToeGame(lines, columns, win);
          firstPlayer = rand.nextInt(2);
          while(game.getGameState() == GameState.PLAYING){
            if(firstPlayer == 0){
              System.out.print("Player 1s turn.\n");
              System.out.println(game);
              players[0].play(game);
              firstPlayer = 1;
            }
            else{
              System.out.print("Player 2s turn.\n");
              players[1].play(game);
              firstPlayer = 0;
            }
          }
          System.out.println("Game over");
          System.out.println(game);
          System.out.println("Result: " + game.getGameState());
          Scanner again = new Scanner(System.in);
          System.out.println("Play again (Y)?:");
          playAgain = again.nextLine();
        }
      }

}
