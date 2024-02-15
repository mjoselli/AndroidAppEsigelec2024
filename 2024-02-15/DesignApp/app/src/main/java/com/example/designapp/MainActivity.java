package com.example.designapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editTextNumber;
    Button buttonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        buttonAdd = findViewById(R.id.buttonAdd);
        textView.setText("Hello Esigelec");
        button.setText("Bye");
        editTextNumber.setText("0");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Bye Esigelec");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editTextNumber.getText().toString();
                int intNumber = Integer.parseInt(number);
                intNumber++;
                editTextNumber.setText(String.valueOf(intNumber));
            }
        });
    }
}