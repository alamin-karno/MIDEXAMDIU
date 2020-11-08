package com.example.midexamdiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    String name,id;
    int count;
    int LastDigitOfID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        name = intent.getStringExtra(StartActivity.NAME);
        id = intent.getStringExtra(StartActivity.ID);
        count = intent.getIntExtra(StartActivity.COUNT,0);
    }

    public void process(View view) {

        int remainder = count % LastDigitOfID;

        Toast.makeText(this, "Name: "+name+" , ID: "+id+" , Remainder Value: "+remainder, Toast.LENGTH_SHORT).show();

    }
}