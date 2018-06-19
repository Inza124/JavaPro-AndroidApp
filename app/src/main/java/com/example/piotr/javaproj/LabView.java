package com.example.piotr.javaproj;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class LabView extends AppCompatActivity {

    ContentHelper helper = new ContentHelper();
    PDFView pdfViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_view);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setElevation(0);
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.menu);
            actionBar.setDisplayHomeAsUpEnabled(true);}

        pdfViewer = (PDFView) findViewById(R.id.pdfViewer);
        if(helper.getWhichLab() == 1)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }
        else if(helper.getWhichLab() == 2)
        {
            pdfViewer.fromAsset("Lab2.pdf").load();
        }
        else if(helper.getWhichLab() == 3)
        {
            pdfViewer.fromAsset("Lab3.pdf").load();
        }
        else if(helper.getWhichLab() == 4)
        {
            pdfViewer.fromAsset("Lab4.pdf").load();
        }
        else if(helper.getWhichLab() == 5)
        {
            pdfViewer.fromAsset("Lab5.pdf").load();
        }
        else if(helper.getWhichLab() == 6)
        {
            pdfViewer.fromAsset("Lab6.pdf").load();
        }
        else if(helper.getWhichLab() == 7)
        {
            pdfViewer.fromAsset("Lab7.pdf").load();
        }
        else if(helper.getWhichLab() == 0)
        {
            pdfViewer.fromAsset("Harmonogram.pdf").load();
        }

    }
}
