package com.example.ex0921;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class credit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

    }

    public void backToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}