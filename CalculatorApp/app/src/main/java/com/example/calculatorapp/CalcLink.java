package com.example.calculatorapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Stack;

public class CalcLink extends AppCompatActivity {

    Boolean goodtogo = true;
    public static double solve(String equation) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = tokenize(equation);

        for (String token : tokens) {
            if (token.equals("+")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 + operand2);
            } else if (token.equals("-")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 * operand2);
            } else if (token.equals("/")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 / operand2);
            } else {
                stack.push(Double.parseDouble(token));
            }
        }
        return stack.pop();
    }

    private static String[] tokenize(String equation) {
        StringBuilder number = new StringBuilder();
        StringBuilder tokens = new StringBuilder();

        for (char c : equation.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    tokens.append(number).append(" ");
                    number.setLength(0);
                }
                tokens.append(c).append(" ");
            }
        }

        if (number.length() > 0) {
            tokens.append(number).append(" ");
        }

        return tokens.toString().trim().split("\\s+");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc_link);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn45 = (Button) findViewById(R.id.button45);

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn45.getText().charAt(0) == '+' || btn45.getText().charAt(0) == '-' || btn45.getText().charAt(0) == '*' || btn45.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn45.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn45.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn46 = (Button) findViewById(R.id.button46);

        btn46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn46.getText().charAt(0) == '+' || btn46.getText().charAt(0) == '-' || btn46.getText().charAt(0) == '*' || btn46.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn46.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn46.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn47 = (Button) findViewById(R.id.button47);

        btn47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn47.getText().charAt(0) == '+' || btn47.getText().charAt(0) == '-' || btn47.getText().charAt(0) == '*' || btn47.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn47.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn47.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        Button btn48 = (Button) findViewById(R.id.button48);

        btn48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn48.getText().charAt(0) == '+' || btn48.getText().charAt(0) == '-' || btn48.getText().charAt(0) == '*' || btn48.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn48.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn48.getText().toString();
                    textview2.setText(newstring);
                }
            }
        });

        ////
        Button btn57 = (Button) findViewById(R.id.button57);

        btn57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);

                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn57.getText().charAt(0) == '+' || btn57.getText().charAt(0) == '-' || btn57.getText().charAt(0) == '*' || btn57.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn57.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn57.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }

                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });

        Button btn56 = (Button) findViewById(R.id.button56);

        btn56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn56.getText().charAt(0) == '+' || btn56.getText().charAt(0) == '-' || btn56.getText().charAt(0) == '*' || btn56.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn56.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn56.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }

                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });


        Button btn58 = (Button) findViewById(R.id.button58);

        btn58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn58.getText().charAt(0) == '+' || btn58.getText().charAt(0) == '-' || btn58.getText().charAt(0) == '*' || btn58.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn58.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn58.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }

                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });

        Button btn59 = (Button) findViewById(R.id.button59);

        btn59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn59.getText().charAt(0) == '+' || btn59.getText().charAt(0) == '-' || btn59.getText().charAt(0) == '*' || btn59.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn59.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = true;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn59.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = true;
                }

                String createsub = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                SequenceSolver sq = new SequenceSolver();

                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
                editTextNumberDecimal2.setText(sq.solveEquation(createsub)+"");
            }
        });


        Button btn60 = (Button) findViewById(R.id.button60);

        btn60.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                goodtogo = true;
                TextView textview2 = findViewById(R.id.textView2);
                EditText editTextNumberDecimal2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/' || textview2.getText().charAt(textview2.getText().length()-1) == '.')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    textview2.setText(cutstring);
                }
                /*if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn60.getText().charAt(0) == '+' || btn60.getText().charAt(0) == '-' || btn60.getText().charAt(0) == '*' || btn60.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn60.getText().toString();
                    textview2.setText(cutstring);
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn60.getText().toString();
                    textview2.setText(newstring);
                }*/

                EquationSolver eq = new EquationSolver();

                editTextNumberDecimal2.setText(eq.evaluateMDAS(textview2.getText().toString())+"");

                textview2.setText("");
            }
        });




        Button btn61 = (Button) findViewById(R.id.button61);

        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview2 = findViewById(R.id.textView2);
                if(goodtogo == false){
                    return;
                }
                if((textview2.getText().toString().length() != 0) && (textview2.getText().charAt(textview2.getText().length() - 1) == '+' || textview2.getText().charAt(textview2.getText().length()-1) == '-' || textview2.getText().charAt(textview2.getText().length()-1) == '*' || textview2.getText().charAt(textview2.getText().length()-1) == '/') && ( btn61.getText().charAt(0) == '+' || btn61.getText().charAt(0) == '-' || btn61.getText().charAt(0) == '*' || btn61.getText().charAt(0) == '/')) {
                    String cutstring = textview2.getText().toString().substring(0,textview2.getText().toString().length()-1);
                    cutstring+=btn61.getText().toString();
                    textview2.setText(cutstring);
                    goodtogo = false;
                }
                else{
                    String newstring = (String) textview2.getText();
                    newstring+=btn61.getText().toString();
                    textview2.setText(newstring);
                    goodtogo = false;
                }
            }
        });
    }
}