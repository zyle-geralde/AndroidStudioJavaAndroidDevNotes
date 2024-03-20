package com.example.midtertry;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    int n = 0;
    int game = 0;

    ArrayList<Button> btnlist= new ArrayList<Button>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Toast.makeText(getApplicationContext(),"Zyle Gerade de la Pena Tic tac toe",Toast.LENGTH_LONG).show();

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn1 = (Button) findViewById(R.id.button11);
        btnlist.add(btn1);
        Button btn2 = (Button) findViewById(R.id.button2);
        btnlist.add(btn2);
        Button btn3 = (Button) findViewById(R.id.button3);
        btnlist.add(btn3);
        Button btn4 = (Button) findViewById(R.id.button4);
        btnlist.add(btn4);
        Button btn5 = (Button) findViewById(R.id.button5);
        btnlist.add(btn5);
        Button btn6 = (Button) findViewById(R.id.button6);
        btnlist.add(btn6);
        Button btn7 = (Button) findViewById(R.id.button7);
        btnlist.add(btn7);
        Button btn8 = (Button) findViewById(R.id.button8);
        btnlist.add(btn8);
        Button btn9 = (Button) findViewById(R.id.button9);
        btnlist.add(btn9);


        for(Button btn: btnlist){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(game != 0){
                        return;
                    }
                    LinearLayout ln = (LinearLayout) findViewById(R.id.bb);
                    btn.setTextColor(Color.BLACK);
                    if(btn.getText().toString() != "O" && btn.getText().toString() != "X"){
                        if(n == 0){
                            ln.setBackgroundColor(Color.RED);
                            btn.setText("O");
                            TextView txt = (TextView) findViewById(R.id.textView);
                            txt.setText("PLAYER X'S TURN");
                            n = 1;
                        }
                        else if(n == 1){
                            ln.setBackgroundColor(Color.BLUE);
                            btn.setText("X");
                            TextView txt = (TextView) findViewById(R.id.textView);
                            txt.setText("PLAYER O'S TURN");
                            n = 0;
                        }
                    }
                    checkings();
                }
            });
        }

    }

    public void checkings(){
        if(btnlist.get(0).getText().toString() == "O" && btnlist.get(1).getText().toString() == "O" && btnlist.get(2).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }
        if(btnlist.get(3).getText().toString() == "O" && btnlist.get(4).getText().toString() == "O" && btnlist.get(5).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }
        if(btnlist.get(6).getText().toString() == "O" && btnlist.get(7).getText().toString() == "O" && btnlist.get(8).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }
        if(btnlist.get(0).getText().toString() == "O" && btnlist.get(3).getText().toString() == "O" && btnlist.get(6).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }
        if(btnlist.get(1).getText().toString() == "O" && btnlist.get(4).getText().toString() == "O" && btnlist.get(7).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }
        if(btnlist.get(2).getText().toString() == "O" && btnlist.get(5).getText().toString() == "O" && btnlist.get(8).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }
        if(btnlist.get(0).getText().toString() == "O" && btnlist.get(4).getText().toString() == "O" && btnlist.get(8).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }
        if(btnlist.get(2).getText().toString() == "O" && btnlist.get(4).getText().toString() == "O" && btnlist.get(6).getText().toString() == "O"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER O WINS");
            game = 1;
            return;
        }


        //For X
        if(btnlist.get(0).getText().toString() == "X" && btnlist.get(1).getText().toString() == "X" && btnlist.get(2).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }
        if(btnlist.get(3).getText().toString() == "X" && btnlist.get(4).getText().toString() == "X" && btnlist.get(5).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }
        if(btnlist.get(6).getText().toString() == "X" && btnlist.get(7).getText().toString() == "X" && btnlist.get(8).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }
        if(btnlist.get(0).getText().toString() == "X" && btnlist.get(3).getText().toString() == "X" && btnlist.get(6).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }
        if(btnlist.get(1).getText().toString() == "X" && btnlist.get(4).getText().toString() == "X" && btnlist.get(7).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }
        if(btnlist.get(2).getText().toString() == "X" && btnlist.get(5).getText().toString() == "X" && btnlist.get(8).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }
        if(btnlist.get(0).getText().toString() == "X" && btnlist.get(4).getText().toString() == "X" && btnlist.get(8).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }
        if(btnlist.get(2).getText().toString() == "X" && btnlist.get(4).getText().toString() == "X" && btnlist.get(6).getText().toString() == "X"){
            TextView txt =  (TextView) findViewById(R.id.textView);
            txt.setText("PLAYER X WINS");
            game = 1;
            return;
        }


        for(Button b: btnlist){
            if(b.getText().toString() != "O" && b.getText().toString() != "X"){
                return;
            }
        }
        TextView txt =  (TextView) findViewById(R.id.textView);
        txt.setText("Draw");
        game = 1;

    }
}