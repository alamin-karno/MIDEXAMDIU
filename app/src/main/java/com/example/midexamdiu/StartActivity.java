package com.example.midexamdiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    int count = 0;
    EditText nameET,idET;
    public static String NAME = "This is name";
    public static String ID = "This is ID";
    public static String COUNT = "This is count value";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        nameET = findViewById(R.id.nameET);
        idET = findViewById(R.id.idET);

    }

    public void count(View view) {
        count++;
    }

    public void next(View view) {
        String name = nameET.getText().toString();
        String id = idET.getText().toString();

        if(name.isEmpty()){
            Toast.makeText(this, "Enter your name", Toast.LENGTH_SHORT).show();
        }
        else if(id.isEmpty()){
            Toast.makeText(this, "Enter your ID", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(StartActivity.this,NextActivity.class);
            intent.putExtra(NAME,name);
            intent.putExtra(ID,id);
            intent.putExtra(COUNT,count);
            startActivity(intent);
        }
    }
}