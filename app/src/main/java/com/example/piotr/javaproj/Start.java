package com.example.piotr.javaproj;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends AppCompatActivity {
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setElevation(0);
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.menu_start); }

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
