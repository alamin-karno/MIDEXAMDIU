package com.example.midexamdiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String name,id;
    int count;
    private TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        name = intent.getStringExtra(FirstActivity.NAME);
        id = intent.getStringExtra(FirstActivity.ID);
        count = intent.getIntExtra(FirstActivity.COUNT,0);

        resultTV = findViewById(R.id.resultTV);

        resultTV.setText("Welcome To My App.\nMy Name is: "+name+" ID: "+id+" and Total Count :"+count);
    }


}