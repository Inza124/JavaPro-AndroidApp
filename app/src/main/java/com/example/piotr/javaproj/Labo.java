package com.example.piotr.javaproj;

import android.content.Intent;
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
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabTwo() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab2);
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabThree() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab3);
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabFour() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab4);
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabFife() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab5);
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabSix() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab6);
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabSeven() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab7);
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }

    private void LabH() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab0);
        contentHelper.setWhichLab(1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }
}
