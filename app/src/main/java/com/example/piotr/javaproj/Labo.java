package com.example.piotr.javaproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Labo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labo);
        LabOne();
    }

    private void LabOne() {
        Button Lab1Btn = (Button) findViewById(R.id.Lab1);
        Lab1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Labo.this, LabView.class));
            }
        });
    }
}
