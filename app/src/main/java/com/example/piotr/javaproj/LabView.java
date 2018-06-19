package com.example.piotr.javaproj;

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

        pdfViewer = (PDFView) findViewById(R.id.pdfViewer);
        if(helper.getWhichLab() == 1)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }
        else if(helper.getWhichLab() == 2)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }
        else if(helper.getWhichLab() == 3)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }
        else if(helper.getWhichLab() == 4)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }
        else if(helper.getWhichLab() == 5)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }
        else if(helper.getWhichLab() == 6)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }
        else if(helper.getWhichLab() == 7)
        {
            pdfViewer.fromAsset("Lab1.pdf").load();
        }

    }
}
