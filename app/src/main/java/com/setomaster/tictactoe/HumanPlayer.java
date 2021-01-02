package com.setomaster.tictactoe;

import java.util.Scanner;

public class HumanPlayer implements Player{
  public void play(TicTacToeGame g){
    if(g.getGameState() == GameState.PLAYING){

      Scanner answer = new Scanner(System.in);
      System.out.print(g.nextCellValue() + " to play: ");

      int value = Integer.parseInt(answer.nextLine())-1;
      while(value < 0 || value >= (g.getLines()*g.getColumns()) || g.valueAt(value) != CellValue.EMPTY){
        if(value < 0 || value >= (g.getLines()*g.getColumns())){
          System.out.println("The value should be between 1 and " + (g.getLines()*g.getColumns()));
        }
        else if(g.valueAt(value) != CellValue.EMPTY) {
          System.out.println("This cell has already been played");
        }
        System.out.print(g.nextCellValue() + " to play: ");
        value = Integer.parseInt(answer.nextLine())-1;
        System.out.println(g);
      }
      g.play(value);
    }
    else{
      System.out.println("Cannot play");
    }
  }
}
