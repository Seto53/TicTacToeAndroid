package com.setomaster.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TicTacToeGame game = new TicTacToeGame();
    Player[] players = new Player[2];
    Random rand = new Random();
    int firstPlayer = rand.nextInt(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void cell0(View v) {
        if(game.valueAt(0) == CellValue.EMPTY){
            game.play(0);
            update();
        }
    }
    public void cell1(View v) {
        if(game.valueAt(1) == CellValue.EMPTY){
            game.play(1);
            update();
        }
    }
    public void cell2(View v) {
        if(game.valueAt(2) == CellValue.EMPTY){
            game.play(2);
            update();
        }
    }
    public void cell3(View v) {
        if(game.valueAt(3) == CellValue.EMPTY){
            game.play(3);
            update();
        }
    }
    public void cell4(View v) {
        if(game.valueAt(4) == CellValue.EMPTY){
            game.play(4);
            update();
        }
    }
    public void cell5(View v) {
        if(game.valueAt(5) == CellValue.EMPTY){
            game.play(5);
            update();
        }
    }
    public void cell6(View v) {
        if(game.valueAt(6) == CellValue.EMPTY){
            game.play(6);
            update();
        }
    }
    public void cell7(View v) {
        if(game.valueAt(7) == CellValue.EMPTY){
            game.play(7);
            update();
        }
    }
    public void cell8(View v) {
        if(game.valueAt(8) == CellValue.EMPTY){
            game.play(8);
            update();
        }
    }

    private void update() {
        ImageView cell0 = findViewById(R.id.cell0);
        ImageView cell1 = findViewById(R.id.cell1);
        ImageView cell2 = findViewById(R.id.cell2);
        ImageView cell3 = findViewById(R.id.cell3);
        ImageView cell4 = findViewById(R.id.cell4);
        ImageView cell5 = findViewById(R.id.cell5);
        ImageView cell6 = findViewById(R.id.cell6);
        ImageView cell7 = findViewById(R.id.cell7);
        ImageView cell8 = findViewById(R.id.cell8);

        if (game.valueAt(0) == CellValue.X) {
            cell0.setImageResource(R.drawable.x);
        } else if (game.valueAt(0) == CellValue.O) {
            cell0.setImageResource(R.drawable.o);
        }
        if (game.valueAt(1) == CellValue.X) {
            cell1.setImageResource(R.drawable.x);
        } else if (game.valueAt(1) == CellValue.O) {
            cell1.setImageResource(R.drawable.o);
        }
        if (game.valueAt(2) == CellValue.X) {
            cell2.setImageResource(R.drawable.x);
        } else if (game.valueAt(2) == CellValue.O) {
            cell2.setImageResource(R.drawable.o);
        }
        if (game.valueAt(3) == CellValue.X) {
            cell3.setImageResource(R.drawable.x);
        } else if (game.valueAt(3) == CellValue.O) {
            cell3.setImageResource(R.drawable.o);
        }
        if (game.valueAt(4) == CellValue.X) {
            cell4.setImageResource(R.drawable.x);
        } else if (game.valueAt(4) == CellValue.O) {
            cell4.setImageResource(R.drawable.o);
        }
        if (game.valueAt(5) == CellValue.X) {
            cell5.setImageResource(R.drawable.x);
        } else if (game.valueAt(5) == CellValue.O) {
            cell5.setImageResource(R.drawable.o);
        }
        if (game.valueAt(6) == CellValue.X) {
            cell6.setImageResource(R.drawable.x);
        } else if (game.valueAt(6) == CellValue.O) {
            cell6.setImageResource(R.drawable.o);
        }
        if (game.valueAt(7) == CellValue.X) {
            cell7.setImageResource(R.drawable.x);
        } else if (game.valueAt(7) == CellValue.O) {
            cell7.setImageResource(R.drawable.o);
        }
        if (game.valueAt(8) == CellValue.X) {
            cell8.setImageResource(R.drawable.x);
        } else if (game.valueAt(8) == CellValue.O) {
            cell8.setImageResource(R.drawable.o);
        }
        if(game.getGameState() != GameState.PLAYING){
            if(game.getGameState() == GameState.DRAW){
                Toast.makeText(getApplicationContext(), "DRAW", Toast.LENGTH_LONG).show();
            }
            else if(game.getGameState() == GameState.XWIN){
                Toast.makeText(getApplicationContext(), "XWIN", Toast.LENGTH_LONG).show();
            }
            else if(game.getGameState() == GameState.OWIN){
                Toast.makeText(getApplicationContext(), "OWIN", Toast.LENGTH_LONG).show();
            }
            game = new TicTacToeGame();
            reset();
        }

    }
    private void reset(){
        ImageView cell0 = findViewById(R.id.cell0);
        cell0.setImageResource(R.drawable.empty);
        ImageView cell1 = findViewById(R.id.cell1);
        cell1.setImageResource(R.drawable.empty);
        ImageView cell2 = findViewById(R.id.cell2);
        cell2.setImageResource(R.drawable.empty);
        ImageView cell3 = findViewById(R.id.cell3);
        cell3.setImageResource(R.drawable.empty);
        ImageView cell4 = findViewById(R.id.cell4);
        cell4.setImageResource(R.drawable.empty);
        ImageView cell5 = findViewById(R.id.cell5);
        cell5.setImageResource(R.drawable.empty);
        ImageView cell6 = findViewById(R.id.cell6);
        cell6.setImageResource(R.drawable.empty);
        ImageView cell7 = findViewById(R.id.cell7);
        cell7.setImageResource(R.drawable.empty);
        ImageView cell8 = findViewById(R.id.cell8);
        cell8.setImageResource(R.drawable.empty);
    }
}