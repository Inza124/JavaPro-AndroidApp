package com.example.piotr.javaproj;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Labo extends AppCompatActivity {

    ContentHelper contentHelper = new ContentHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labo);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setElevation(0);
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.menu);
            actionBar.setDisplayHomeAsUpEnabled(true);
            }

        LabOne();
        LabTwo();
        LabThree();
        LabFife();
        LabFour();
        LabSeven();
        LabSix();
        LabH();
    }

    private void LabOne() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(1);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabTwo() {
        Button Lab2Btn = (Button) findViewById(R.id.Lab2);
        Lab2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(2);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabThree() {
        Button Lab3Btn = (Button) findViewById(R.id.Lab3);
        Lab3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(3);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabFour() {
        Button Lab4Btn = (Button) findViewById(R.id.Lab4);
        Lab4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(4);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabFife() {
        Button Lab5Btn = (Button) findViewById(R.id.Lab5);
        Lab5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(5);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabSix() {
        Button Lab6Btn = (Button) findViewById(R.id.Lab6);
        Lab6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(6);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabSeven() {
        Button Lab7Btn = (Button) findViewById(R.id.Lab7);
        Lab7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(7);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabH() {
        Button Lab0Btn = (Button) findViewById(R.id.Lab0);
        Lab0Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentHelper.setWhichLab(0);
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }
}
