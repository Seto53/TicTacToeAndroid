package com.setomaster.tictactoe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TicTacToeGame game = new TicTacToeGame();
    Random rand = new Random();
    int firstPlayer;
    int gameMode;
    ImageView cell0;
    ImageView cell1;
    ImageView cell2;
    ImageView cell3;
    ImageView cell4;
    ImageView cell5;
    ImageView cell6;
    ImageView cell7;
    ImageView cell8;
    Button message;
    Player player;
    ComputerPerfectPlayer perfect = new ComputerPerfectPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        message = findViewById(R.id.buttonMessage);
        cell0 = findViewById(R.id.cell0);
        cell1 = findViewById(R.id.cell1);
        cell2 = findViewById(R.id.cell2);
        cell3 = findViewById(R.id.cell3);
        cell4 = findViewById(R.id.cell4);
        cell5 = findViewById(R.id.cell5);
        cell6 = findViewById(R.id.cell6);
        cell7 = findViewById(R.id.cell7);
        cell8 = findViewById(R.id.cell8);
        newPlayerVersusComputer0();
    }

    private void computerRandomPlay() {
        update(((ComputerRandomPlayer) player).play(game));
    }

    private void computerPerfectPlay() {
        update(((ComputerPerfectPlayer) player).play(game));
    }

    private void nextPlay(int pos) {
        if (game.getGameState() == GameState.PLAYING) {
            if (game.valueAt(pos) == CellValue.EMPTY) {
                game.play(pos);
                update(pos);
                if (game.getGameState() == GameState.PLAYING) {
                    if (gameMode == 1) {
                        computerRandomPlay();
                    } else if (gameMode == 2) {
                        computerPerfectPlay();
                    }
                }
            }
        }
    }

    private void newPlayerVersusPlayer(){
        reset();
        gameMode = 0;
        firstPlayer = 0;
        message.setText(game.nextCellValue() + " turn");
    }

    private void newPlayerVersusComputer0(){
        reset();
        gameMode = 1;
        player = new ComputerRandomPlayer();
        firstPlayer = rand.nextInt(2);
        if(firstPlayer == 1){
            computerRandomPlay();
        }
        message.setText(game.nextCellValue() + " turn");
    }

    private void newPlayerVersusPerfect(){
        reset();
        gameMode = 2;
        player = perfect;
        firstPlayer = rand.nextInt(2);
        if(firstPlayer == 1){
            computerPerfectPlay();
        }
        message.setText(game.nextCellValue() + " turn");
    }

    public void playerVersusPlayer(View v) {
        Toast.makeText(getApplicationContext(), "Player versus Player",
                Toast.LENGTH_SHORT).show();
        newPlayerVersusPlayer();
    }

    public void playerVersusComputer0(View v) {
        Toast.makeText(getApplicationContext(), "Playing against easy computer",
                Toast.LENGTH_SHORT).show();
        newPlayerVersusComputer0();
    }

    public void playerVersusPerfect(View v) {
        Toast.makeText(getApplicationContext(), "Playing against hard computer",
                Toast.LENGTH_SHORT).show();
        newPlayerVersusPerfect();
    }

    public void cell0(View v) {
        nextPlay(0);
    }

    public void cell1(View v) {
        nextPlay(1);
    }

    public void cell2(View v) {
        nextPlay(2);
    }

    public void cell3(View v) {
        nextPlay(3);
    }

    public void cell4(View v) {
        nextPlay(4);
    }

    public void cell5(View v) {
        nextPlay(5);
    }

    public void cell6(View v) {
        nextPlay(6);
    }

    public void cell7(View v) {
        nextPlay(7);
    }

    public void cell8(View v) {
        nextPlay(8);
    }

    private void update(int pos) {
        switch (pos) {
            case 0:
                if (game.valueAt(0) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell0, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(0) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell0, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 1:
                if (game.valueAt(1) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell1, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(1) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell1, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 2:
                if (game.valueAt(2) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell2, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(2) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell2, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 3:
                if (game.valueAt(3) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell3, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(3) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell3, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 4:
                if (game.valueAt(4) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell4, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(4) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell4, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 5:
                if (game.valueAt(5) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell5, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(5) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell5, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 6:
                if (game.valueAt(6) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell6, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(6) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell6, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 7:
                if (game.valueAt(7) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell7, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(7) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell7, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
            case 8:
                if (game.valueAt(8) == CellValue.X) {
                    ImageViewAnimatedChange(getApplicationContext(), cell8, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.x));
                } else if (game.valueAt(8) == CellValue.O) {
                    ImageViewAnimatedChange(getApplicationContext(), cell8, BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.o));
                }
                break;
        }
        if (game.getGameState() != GameState.PLAYING) {
            if (game.getGameState() == GameState.DRAW) {
                message.setText("Draw");
            } else if (game.getGameState() == GameState.XWIN) {
                message.setText("X Wins");
            } else if (game.getGameState() == GameState.OWIN) {
                message.setText("O Wins");
            }
        } else {
            message.setText(game.nextCellValue() + " turn");
        }
    }

    public void restart(View v) {
        if(gameMode == 0){
            newPlayerVersusPlayer();
        }
        else if(gameMode == 1){
            newPlayerVersusComputer0();
        }
        else{
            newPlayerVersusPerfect();
        }
    }

    private void reset() {
        game = new TicTacToeGame();
        message.setText(game.nextCellValue() + " turn");
        cell0.setImageResource(R.drawable.empty);
        cell1.setImageResource(R.drawable.empty);
        cell2.setImageResource(R.drawable.empty);
        cell3.setImageResource(R.drawable.empty);
        cell4.setImageResource(R.drawable.empty);
        cell5.setImageResource(R.drawable.empty);
        cell6.setImageResource(R.drawable.empty);
        cell7.setImageResource(R.drawable.empty);
        cell8.setImageResource(R.drawable.empty);
    }

    public static void ImageViewAnimatedChange(Context c, final ImageView v, final Bitmap new_image) {
        final Animation anim_in = AnimationUtils.loadAnimation(c, android.R.anim.fade_in);
        v.startAnimation(anim_in);
        v.setImageBitmap(new_image);
    }
}