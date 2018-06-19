package com.example.piotr.javaproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class LabView extends AppCompatActivity {

    PDFView pdfViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_view);

        pdfViewer = (PDFView) findViewById(R.id.pdfViewer);
        pdfViewer.fromAsset("Lab1.pdf").load();

    }
}
