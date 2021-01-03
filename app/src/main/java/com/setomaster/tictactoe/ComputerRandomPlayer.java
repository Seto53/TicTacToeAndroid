package com.setomaster.tictactoe;

public class ComputerRandomPlayer extends Player {

	public int play(TicTacToeGame game) {
		int choice;
		do {
			choice = Utils.generator.nextInt(game.lines*game.columns);
		} while (game.valueAt(choice) != CellValue.EMPTY);
		game.play(choice);
		return choice;
	}

}