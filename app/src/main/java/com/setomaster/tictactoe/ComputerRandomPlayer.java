package com.setomaster.tictactoe;

import java.util.Random;
public class ComputerRandomPlayer implements Player{
    public void play(TicTacToeGame g){
      if(g.getGameState() == GameState.PLAYING){
        Random rand = new Random();
        int rand_1;
        do{
          rand_1 = rand.nextInt(g.getLines()*g.getColumns());
        }while(g.valueAt(rand_1) != CellValue.EMPTY);
        g.play(rand_1);
      }
      else{
        System.out.println("Cannot play");
      }
    }
}
