package com.example.midtertry;

import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ColorChanger extends AppCompatActivity {
    ArrayList<Button> btnlist = new ArrayList<>();
    int game = 0;
    int colorindic = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color_changer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn1 = (Button) findViewById(R.id.button1);
        btnlist.add(btn1);
        Button btn12 = (Button) findViewById(R.id.button12);
        btnlist.add(btn12);
        Button btn13 = (Button) findViewById(R.id.button13);
        btnlist.add(btn13);
        Button btn14 = (Button) findViewById(R.id.button14);
        btnlist.add(btn14);
        Button btn15 = (Button) findViewById(R.id.button15);
        btnlist.add(btn15);
        Button btn16 = (Button) findViewById(R.id.button16);
        btnlist.add(btn16);
        Button btn17 = (Button) findViewById(R.id.button17);
        btnlist.add(btn17);
        Button btn18 = (Button) findViewById(R.id.button18);
        btnlist.add(btn18);
        Button btn19 = (Button) findViewById(R.id.button19);
        btnlist.add(btn19);

        int numme;

        for (Button bt : btnlist) {
            numme = (int) (Math.random() * 3) + 1;

            if (numme == 1) {
                bt.setBackgroundColor(Color.GREEN);
                bt.setTextColor(Color.GREEN);
            } else if (numme == 2) {
                bt.setBackgroundColor(Color.RED);
                bt.setTextColor(Color.RED);
            } else {
                bt.setBackgroundColor(Color.BLUE);
                bt.setTextColor(Color.BLUE);
            }
        }



        int randomnum = (int) (Math.random() * 3) + 1;

        btnlist.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(game != 0){
                    return;
                }

                checkgame();

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(1));
                bblits.add(btnlist.get(3));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });

        btnlist.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(game != 0){
                    return;
                }

                checkgame();

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(4));
                bblits.add(btnlist.get(2));
                bblits.add(btnlist.get(0));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });


        btnlist.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkgame();
                if(game != 0){
                    return;
                }

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(1));
                bblits.add(btnlist.get(5));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });

        btnlist.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkgame();
                if(game != 0){
                    return;
                }

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(0));
                bblits.add(btnlist.get(6));
                bblits.add(btnlist.get(4));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });


        btnlist.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkgame();
                if(game != 0){
                    return;
                }

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(1));
                bblits.add(btnlist.get(3));
                bblits.add(btnlist.get(5));
                bblits.add(btnlist.get(7));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });

        btnlist.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkgame();
                if(game != 0){
                    return;
                }

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(2));
                bblits.add(btnlist.get(4));
                bblits.add(btnlist.get(8));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });

        btnlist.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkgame();
                if(game != 0){
                    return;
                }

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(3));
                bblits.add(btnlist.get(7));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });

        btnlist.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkgame();
                if(game != 0){
                    return;
                }

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(4));
                bblits.add(btnlist.get(6));
                bblits.add(btnlist.get(8));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });

        btnlist.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkgame();
                if(game != 0){
                    return;
                }

                ArrayList<Button> bblits = new ArrayList<>();
                bblits.add(btnlist.get(5));
                bblits.add(btnlist.get(7));

                for(Button bb: bblits){
                    if (bb.getCurrentTextColor() == Color.RED) {
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    } else if (bb.getCurrentTextColor() == Color.GREEN) {
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    } else {
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                }
            }
        });

        Button retb = (Button) findViewById(R.id.returnb);

        retb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(Button bb: btnlist){
                    int randnum = (int)(Math.random()*3)+1;
                    if(randnum == 1){
                        bb.setBackgroundColor(Color.GREEN);
                        bb.setTextColor(Color.GREEN);
                    }
                    else if(randnum == 2){
                        bb.setBackgroundColor(Color.RED);
                        bb.setTextColor(Color.RED);
                    }
                    else{
                        bb.setBackgroundColor(Color.BLUE);
                        bb.setTextColor(Color.BLUE);
                    }
                }
                game = 0;
                colorindic = 0;
            }
        });
    }
    public void checkgame(){

        for(Button bt: btnlist){
            if(bt.getCurrentTextColor() == Color.RED){
                colorindic++;
            }
        }
        if(colorindic > 4){
            game = 1;
        }
        colorindic = 0;
    }
}
