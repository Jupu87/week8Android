package com.jupu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstInput;
    private EditText secondInput;
    private TextView txtAnswer;
    private String luku1;
    private String luku2;
    private Integer intLuku1;
    private Integer intLuku2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput = findViewById(R.id.firstInput);
        secondInput = findViewById(R.id.secondInput);
        txtAnswer = findViewById(R.id.txtAnswer);

    }

    public void plusValues(View view){
        luku1 = String.valueOf((firstInput.getText()));
        intLuku1 = Integer.parseInt(luku1);

        luku2 = String.valueOf((secondInput.getText()));
        intLuku2 = Integer.parseInt(luku2);

        Integer vastaus = intLuku1 + intLuku2;
        txtAnswer.setText((vastaus).toString());
    }

    public void minusValues(View view){
        luku1 = String.valueOf((firstInput.getText()));
        intLuku1 = Integer.parseInt(luku1);

        luku2 = String.valueOf((secondInput.getText()));
        intLuku2 = Integer.parseInt(luku2);

        Integer vastaus = intLuku1 - intLuku2;
        txtAnswer.setText((vastaus).toString());
    }

    public void addValues(View view){
        luku1 = String.valueOf((firstInput.getText()));
        intLuku1 = Integer.parseInt(luku1);

        luku2 = String.valueOf((secondInput.getText()));
        intLuku2 = Integer.parseInt(luku2);

        Integer vastaus = intLuku1 * intLuku2;
        txtAnswer.setText((vastaus).toString());
    }

    public void divideValues(View view){
        luku1 = String.valueOf((firstInput.getText()));
        intLuku1 = Integer.parseInt(luku1);

        luku2 = String.valueOf((secondInput.getText()));
        intLuku2 = Integer.parseInt(luku2);

        Integer vastaus = intLuku1 / intLuku2;
        txtAnswer.setText((vastaus).toString());
    }
}