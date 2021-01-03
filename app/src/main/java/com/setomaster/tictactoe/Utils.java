package com.setomaster.tictactoe;

import java.util.Random;
import java.io.Console;

public class Utils {
	public static final Random generator = new Random();


	/**
     * rotates the game
     *
     * 1 | 2 | 3
     * ----------
     * 4 | 5 | 6
     * ----------
     * 7 | 8 | 9
     *
     * into the game
     *
     * 7 | 4 | 1
     * ----------
     * 8 | 5 | 2
     * ----------
     * 9 | 6 | 3
     */


    public static void rotate(int lines, int columns, int[] transformedBoard){
    	if(lines != columns) {
    		throw new IllegalArgumentException("Cannot rotate a non square board");
    	}
    	if(transformedBoard == null) {
    		throw new NullPointerException("transformedBoard cannot be null");
    	}
    	if((lines < 1) || (columns < 1) || (transformedBoard.length != lines*columns)){
    		throw new IllegalArgumentException("rotate called with incorrect arguments");
    	}

    	int[] tmp;
    	tmp = new int[transformedBoard.length];

		System.arraycopy(transformedBoard, 0, tmp, 0, transformedBoard.length);

    	for(int i =0 ; i < columns; i++) {
    		for(int j = 0; j < lines ; j++) {
    			transformedBoard[j*lines+i]=tmp[(columns-i-1)*lines+j];
    		}
	    }

    }

    /**
     * horizontalFlip flips the game
     *
     * 1 | 2 | 3
     * ----------
     * 4 | 5 | 6
     * ----------
     * 7 | 8 | 9
     *
     * into the game
     *
     * 7 | 8 | 9
     * ----------
     * 4 | 5 | 6
     * ----------
     * 1 | 2 | 3
     */

    public static  void horizontalFlip(int lines, int columns, int[] transformedBoard){
    	if(transformedBoard == null) {
    		throw new NullPointerException("transformedBoard cannot be null");
    	}
    	if((lines < 1) || (columns < 1) || (transformedBoard.length != lines*columns)){
    		throw new IllegalArgumentException("horizontalFlip called with incorrect arguments");
    	}
    	int tmp;
	   	for(int i = 0; i < (lines/2); i++) {
    		for(int j=0 ; j< columns; j++) {
    			tmp = transformedBoard[(lines-i-1)*columns + j];
    			transformedBoard[(lines-i-1)*columns + j] = transformedBoard[i*columns + j];
    			transformedBoard[i*columns + j] = tmp;
    		}
    	}
    }

   /**
     * verticalFlip flips the game
     *
     * 1 | 2 | 3
     * ----------
     * 4 | 5 | 6
     * ----------
     * 7 | 8 | 9
     *
     * into the game
     *
     * 3 | 2 | 1
     * ----------
     * 6 | 5 | 4
     * ----------
     * 9 | 8 | 7
     */

    public static  void verticalFlip(int lines, int columns, int[] transformedBoard){
    	if(transformedBoard == null) {
    		throw new NullPointerException("transformedBoard cannot be null");
    	}
    	if((lines < 1) || (columns < 1) || (transformedBoard.length != lines*columns)){
    		throw new IllegalArgumentException("verticalFlip called with incorrect arguments");
    	}
    	int tmp;
	   	for(int i = 0; i < (lines); i++) {
    		for(int j=0 ; j< (columns/2); j++) {
    			tmp = transformedBoard[(i+1)*columns -j-1];
    			transformedBoard[(i+1)*columns -j-1] = transformedBoard[i*columns + j];
    			transformedBoard[i*columns + j] = tmp;
    		}
    	}
    }

}