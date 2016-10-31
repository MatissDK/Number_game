package com.ottodk.number_game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button mButton;
    private EditText mEditText;
    private Numbers mNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mEditText = (EditText) findViewById(R.id.input);
        mButton.setOnClickListener(this);

        mNumbers = new Numbers();
    }

    @Override
    public void onClick(View v) {
        String text = mEditText.getText().toString();
        if (text.matches("")) {
            makeToast("Enter number");
        } else {
            double input = Double.parseDouble(text);
            mNumbers.setNumber(input);
            boolean triangle = mNumbers.calculateTriangule();
            boolean square = mNumbers.SquareNumber();
            if (triangle == true && square == true) {
                makeToast("Square and triangle");
            } else if (triangle == true) {
                makeToast("Triangle number");
            } else if (square == true) {
                makeToast("Square number");
            } else {
                makeToast("Not triangle and not square");
            }
        }


    }

    private void makeToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}
