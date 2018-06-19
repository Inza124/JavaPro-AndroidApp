package com.example.piotr.javaproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        presentationButton();
        laboButton();
        testButton();
    }

    private void presentationButton()
    {
        Button presBtn = (Button) findViewById(R.id.WykBtn);
        presBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Start.this, Presentation.class));
            }
    });
    }

    private void laboButton()
    {
        Button labBtn = (Button) findViewById(R.id.LaboBtn);
        labBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Start.this, Labo.class));
            }
        });
    }

    private void testButton()
    {
        Button tesBtn = (Button) findViewById(R.id.TestBtn);
        tesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Start.this, Test.class));
            }
        });
    }
}
