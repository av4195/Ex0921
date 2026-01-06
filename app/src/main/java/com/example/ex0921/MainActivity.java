package com.example.ex0921;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout main;
    Button btn1, btn2, btn3, btn4, btn5;
    AlertDialog.Builder builder1, builder2, builder3, builder4, builder5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        builder1 = new AlertDialog.Builder(this);
        builder2 = new AlertDialog.Builder(this);
        builder3 = new AlertDialog.Builder(this);
        builder4 = new AlertDialog.Builder(this);
        builder5 = new AlertDialog.Builder(this);
    }

    public void alert1(View v){
        builder1.setMessage("j,");
        AlertDialog ad= builder1.create();
        ad.show();
    }

    public void alert2(View v) {
        builder2.setTitle("k");
        builder2.setMessage("j,");
        builder2.setIcon(R.drawable.images);
        AlertDialog ad = builder2.create();
        ad.show();
    }

    public void alert3(View v){
        builder3.setTitle(" ");
        builder3.setIcon(R.drawable.images);
        builder3.setNegativeButton("close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        AlertDialog ad = builder3.create();
        ad.show();
    }

    public void alert4(View v){
        builder4.setTitle(" ");
        builder4.setMessage(" colors");
        builder4.setIcon(R.drawable.images);
        builder4.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder4.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random random = new Random();
                main.setBackgroundColor(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            }
        });
        AlertDialog ad = builder4.create();
        ad.show();
    }

    public void alert5(View v){
        builder5.setTitle(" ");
        builder5.setMessage(" colors");
        builder5.setIcon(R.drawable.images);
        builder5.setNegativeButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder5.setPositiveButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random random = new Random();
                main.setBackgroundColor(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            }
        });
        builder5.setNeutralButton("reset", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                main.setBackgroundColor(Color.WHITE);
        }});
        AlertDialog ad = builder5.create();
        ad.show();
    }

    public void moreToCredit(View v){
        Intent intent = new Intent(this, credit.class);
        startActivity(intent);
    }

}