package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    Button button2;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);
        button2.setOnClickListener(view -> {
            String text = editText.getText().toString();
            Singleton.getInstance().text = text;
            Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
            startActivity(intent);
        });
    }
}