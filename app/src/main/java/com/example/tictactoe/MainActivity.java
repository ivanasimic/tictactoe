package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9;

    private String playerOne = "X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,i=0;
    private Button Reset;
    private Button HighScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.buttonImage1);
        button2=findViewById(R.id.buttonImage2);
        button3=findViewById(R.id.buttonImage3);
        button4=findViewById(R.id.buttonImage4);
        button5=findViewById(R.id.buttonImage5);
        button6=findViewById(R.id.buttonImage6);
        button7=findViewById(R.id.buttonImage7);
        button8=findViewById(R.id.buttonImage8);
        button9=findViewById(R.id.buttonImage9);


        Reset=findViewById(R.id.Reset);
        HighScore=findViewById(R.id.HighScore);


        HighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), HighScoreActivity.class);
                startActivity(intent);
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                resetValues();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button1.setImageResource(R.drawable.cross);
                    b1=1;
                    i++;
                } else {
                    button1.setImageResource(R.drawable.circle);
                    b1=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button2.setImageResource(R.drawable.cross);
                    b2=1;
                    i++;
                } else {
                    button2.setImageResource(R.drawable.circle);
                    b2=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button3.setImageResource(R.drawable.cross);
                    b3=1;
                    i++;
                } else {
                    button3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }
                choosePlayer();
                winningGame();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button4.setImageResource(R.drawable.cross);
                    b4=1;
                    i++;
                } else {
                    button4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }
                choosePlayer();
                 winningGame();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button5.setImageResource(R.drawable.cross);
                    b5=1;
                    i++;
                } else {
                    button5.setImageResource(R.drawable.circle);
                    b5=0;
                    i++;
                }
                choosePlayer();
                 winningGame();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button6.setImageResource(R.drawable.cross);
                    b6=1;
                    i++;
                } else {
                    button6.setImageResource(R.drawable.circle);
                    b6=0;
                    i++;
                }
                choosePlayer();
                 winningGame();

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button7.setImageResource(R.drawable.cross);
                    b7=1;
                    i++;
                } else {
                    button7.setImageResource(R.drawable.circle);
                    b7=0;
                    i++;
                }
                choosePlayer();
                 winningGame();

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button8.setImageResource(R.drawable.cross);
                    b8=1;
                    i++;
                } else {
                    button8.setImageResource(R.drawable.circle);
                    b8=0;
                    i++;
                }
                choosePlayer();
                 winningGame();

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(playerOne.equals("X"))
                {
                    button9.setImageResource(R.drawable.cross);
                    b9=1;
                    i++;
                } else {
                    button9.setImageResource(R.drawable.circle);
                    b9=0;
                    i++;
                }
                choosePlayer();
                 winningGame();

            }
        });

    }


    // welche Möglichkeiten es gibt um das Spiel zu gewinnen
    private void winningGame() {
        if ((b1 == 1) && (b2 == 1) && (b3 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b4 == 1) && (b5 == 1) && (b6 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b7 == 1) && (b8 == 1) && (b9 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b1 == 1) && (b4 == 1) && (b7 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b2 == 1) && (b5 == 1) && (b8 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b3 == 1) && (b6 == 1) && (b9 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b1 == 1) && (b5 == 1) && (b9 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b3 == 1) && (b5 == 1) && (b7 == 1)) {
            // Nachricht wenn X gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 1 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        } else if ((b1 == 0) && (b2 == 0) && (b3 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

        else if ((b4 == 0) && (b5 == 0) && (b6 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

        else if ((b7 == 0) && (b8 == 0) && (b9 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

        else if ((b1 == 0) && (b4 == 0) && (b7 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

        else if ((b2 == 0) && (b5 == 0) && (b8 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

        else if ((b3 == 0) && (b6 == 0) && (b9 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

        else if ((b1 == 0) && (b5 == 0) && (b9 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

        else if ((b3 == 0) && (b5 == 0) && (b7 == 0)) {
            // Nachricht wenn O gewinnt
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("congratulations Player 2 has won!").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                // Reset nachdem man OK drückt
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    resetValues();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }
        // wenn niemand gewinnt
        else {
            if(i == 9)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No one has won").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    // Reset nachdem man OK drückt
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);
                        resetValues();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }

    }

    private void choosePlayer()
    {
        if(playerOne.equals("X"))
        {
            playerOne="O";
        } else {
            playerOne="X";
        }
    }

    private void resetValues() {

        b1=5;
        b2=5;
        b3=5;
        b4=5;
        b5=5;
        b6=5;
        b7=5;
        b8=5;
        b9=5;

    }
}