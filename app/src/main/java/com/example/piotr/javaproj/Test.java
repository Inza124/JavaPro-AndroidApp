package com.example.piotr.javaproj;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Test extends AppCompatActivity {

    public CheckBox check1a, check2a, check3a, check4a, check5a, check1b, check2b, check3b, check4b, check5b, check1c, check2c, check3c, check4c, check5c, check1d, check2d, check3d, check4d, check5d,check6a, check6b, check6c, check6d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setElevation(0);
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.menu);
            actionBar.setDisplayHomeAsUpEnabled(true);}

        CheckBoxInit();
        CheckAnswer();
        Reset();
    }

    public void CheckBoxInit()
    {
        check1a = (CheckBox) findViewById(R.id.checkBox_1a); check1b = (CheckBox) findViewById(R.id.checkBox_1b); check1c = (CheckBox) findViewById(R.id.checkBox_1c);  check1d = (CheckBox) findViewById(R.id.checkBox_1d);
        check2a = (CheckBox) findViewById(R.id.checkBox_2a); check2b = (CheckBox) findViewById(R.id.checkBox_2b); check2c = (CheckBox) findViewById(R.id.checkBox_2c);  check2d = (CheckBox) findViewById(R.id.checkBox_2d);
        check3a = (CheckBox) findViewById(R.id.checkBox_3a); check3b = (CheckBox) findViewById(R.id.checkBox_3b); check3c = (CheckBox) findViewById(R.id.checkBox_3c);  check3d = (CheckBox) findViewById(R.id.checkBox_3d);
        check4a = (CheckBox) findViewById(R.id.checkBox_4a); check4b = (CheckBox) findViewById(R.id.checkBox_4b); check4c = (CheckBox) findViewById(R.id.checkBox_4c);  check4d = (CheckBox) findViewById(R.id.checkBox_4d);
        check5a = (CheckBox) findViewById(R.id.checkBox_5a); check5b = (CheckBox) findViewById(R.id.checkBox_5b); check5c = (CheckBox) findViewById(R.id.checkBox_5c);  check5d = (CheckBox) findViewById(R.id.checkBox_5d);
        check6a = (CheckBox) findViewById(R.id.checkBox_6a); check6b = (CheckBox) findViewById(R.id.checkBox_6b); check6c = (CheckBox) findViewById(R.id.checkBox_6c);  check6d = (CheckBox) findViewById(R.id.checkBox_6d);

    }


    public void Reset() {
    Button reset = (Button) findViewById(R.id.ResetBtn);
    reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Test.this, Test.class));
        }
    });
    }

    public void CheckAnswer() {
        Button Check = (Button) findViewById(R.id.CheckBtn);
        Check.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                if (check1a.isChecked()) { if (getString(R.string.answer_1a).equals("CORRECT")) {check1a.setTextColor(Color.GREEN); check1a.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check1a.setTextColor(Color.RED); check1a.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check1a.setTextColor(Color.DKGRAY); check1a.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check1b.isChecked()) { if (getString(R.string.answer_1b).equals("CORRECT")) {check1b.setTextColor(Color.GREEN); check1b.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check1b.setTextColor(Color.RED); check1b.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check1b.setTextColor(Color.DKGRAY); check1b.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check1c.isChecked()) { if (getString(R.string.answer_1c).equals("CORRECT")) {check1c.setTextColor(Color.GREEN); check1c.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check1c.setTextColor(Color.RED); check1c.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check1c.setTextColor(Color.DKGRAY); check1c.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check1d.isChecked()) { if (getString(R.string.answer_1d).equals("CORRECT")) {check1d.setTextColor(Color.GREEN); check1d.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check1d.setTextColor(Color.RED); check1d.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check1d.setTextColor(Color.DKGRAY); check1d.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}

                if (check2a.isChecked()) { if (getString(R.string.answer_2a).equals("CORRECT")) {check2a.setTextColor(Color.GREEN); check2a.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check2a.setTextColor(Color.RED); check2a.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check2a.setTextColor(Color.DKGRAY); check2a.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check2b.isChecked()) { if (getString(R.string.answer_2b).equals("CORRECT")) {check2b.setTextColor(Color.GREEN); check2b.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check2b.setTextColor(Color.RED); check2b.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check2b.setTextColor(Color.DKGRAY); check2b.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check2c.isChecked()) { if (getString(R.string.answer_2c).equals("CORRECT")) {check2c.setTextColor(Color.GREEN); check2c.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check2c.setTextColor(Color.RED); check2c.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check2c.setTextColor(Color.DKGRAY); check2c.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check2d.isChecked()) { if (getString(R.string.answer_2d).equals("CORRECT")) {check2d.setTextColor(Color.GREEN); check2d.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check2d.setTextColor(Color.RED); check2d.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check2d.setTextColor(Color.DKGRAY); check2d.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}

                if (check3a.isChecked()) { if (getString(R.string.answer_3a).equals("CORRECT")) {check3a.setTextColor(Color.GREEN); check3a.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check3a.setTextColor(Color.RED); check3a.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check3a.setTextColor(Color.DKGRAY); check3a.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check3b.isChecked()) { if (getString(R.string.answer_3b).equals("CORRECT")) {check3b.setTextColor(Color.GREEN); check3b.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check3b.setTextColor(Color.RED); check3b.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check3b.setTextColor(Color.DKGRAY); check3b.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check3c.isChecked()) { if (getString(R.string.answer_3c).equals("CORRECT")) {check3c.setTextColor(Color.GREEN); check3c.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check3c.setTextColor(Color.RED); check3c.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check3c.setTextColor(Color.DKGRAY); check3c.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check3d.isChecked()) { if (getString(R.string.answer_3d).equals("CORRECT")) {check3d.setTextColor(Color.GREEN); check3d.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check3d.setTextColor(Color.RED); check3d.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check3d.setTextColor(Color.DKGRAY); check3d.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}

                if (check4a.isChecked()) { if (getString(R.string.answer_4a).equals("CORRECT")) {check4a.setTextColor(Color.GREEN); check4a.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check4a.setTextColor(Color.RED); check4a.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check4a.setTextColor(Color.DKGRAY); check4a.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check4b.isChecked()) { if (getString(R.string.answer_4b).equals("CORRECT")) {check4b.setTextColor(Color.GREEN); check4b.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check4b.setTextColor(Color.RED); check4b.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check4b.setTextColor(Color.DKGRAY); check4b.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check4c.isChecked()) { if (getString(R.string.answer_4c).equals("CORRECT")) {check4c.setTextColor(Color.GREEN); check4c.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check4c.setTextColor(Color.RED); check4c.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check4c.setTextColor(Color.DKGRAY); check4c.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check4d.isChecked()) { if (getString(R.string.answer_4d).equals("CORRECT")) {check4d.setTextColor(Color.GREEN); check4d.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check4d.setTextColor(Color.RED); check4d.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check4d.setTextColor(Color.DKGRAY); check4d.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}

                if (check5a.isChecked()) { if (getString(R.string.answer_5a).equals("CORRECT")) {check5a.setTextColor(Color.GREEN); check5a.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check5a.setTextColor(Color.RED); check5a.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check5a.setTextColor(Color.DKGRAY); check5a.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check5b.isChecked()) { if (getString(R.string.answer_5b).equals("CORRECT")) {check5b.setTextColor(Color.GREEN); check5b.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check5b.setTextColor(Color.RED); check5b.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check5b.setTextColor(Color.DKGRAY); check5b.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check5c.isChecked()) { if (getString(R.string.answer_5c).equals("CORRECT")) {check5c.setTextColor(Color.GREEN); check5c.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check5c.setTextColor(Color.RED); check5c.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check5c.setTextColor(Color.DKGRAY); check5c.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check5d.isChecked()) { if (getString(R.string.answer_5d).equals("CORRECT")) {check5d.setTextColor(Color.GREEN); check5d.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check5d.setTextColor(Color.RED); check5d.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check5d.setTextColor(Color.DKGRAY); check5d.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}

                if (check6a.isChecked()) { if (getString(R.string.answer_6a).equals("CORRECT")) {check6a.setTextColor(Color.GREEN); check6a.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check6a.setTextColor(Color.RED); check6a.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check6a.setTextColor(Color.DKGRAY); check6a.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check6b.isChecked()) { if (getString(R.string.answer_6b).equals("CORRECT")) {check6b.setTextColor(Color.GREEN); check6b.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check6b.setTextColor(Color.RED); check6b.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check6b.setTextColor(Color.DKGRAY); check6b.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check6c.isChecked()) { if (getString(R.string.answer_6c).equals("CORRECT")) {check6c.setTextColor(Color.GREEN); check6c.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check6c.setTextColor(Color.RED); check6c.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check6c.setTextColor(Color.DKGRAY); check6c.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}
                if (check6d.isChecked()) { if (getString(R.string.answer_6d).equals("CORRECT")) {check6d.setTextColor(Color.GREEN); check6d.setButtonTintList(ColorStateList.valueOf(Color.YELLOW)); } else  { check6d.setTextColor(Color.RED); check6d.setButtonTintList(ColorStateList.valueOf(Color.RED));} }else {check6d.setTextColor(Color.DKGRAY); check6d.setButtonTintList(ColorStateList.valueOf(Color.GRAY));}

            }

        });
    }
}
