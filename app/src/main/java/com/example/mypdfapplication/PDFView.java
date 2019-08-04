package com.example.mypdfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;

import java.io.File;

public class PDFView extends AppCompatActivity {
    private com.github.barteksc.pdfviewer.PDFView pdfView;
    private File file1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);

        pdfView = findViewById(R.id.pdfvw);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            file1 = new File(bundle.getString("path", ""));

        }

        pdfView.fromFile(file1).enableSwipe(true)
                .swipeHorizontal(true)
                .enableDoubletap(true)
                .enableAntialiasing(true)
                 //.pageSnap(true)
                //.autoSpacing(true)
                 //.pageFling(true)
                .load();

//
//        file1 = new File(Environment.getExternalStorageDirectory()+"/Documents/Gift.pdf");
//
//        System.out.println("file.exists() = " + file1.exists());
//
//        pdfView.fromFile(file1)
//                .defaultPage(1)
//                .enableSwipe(true)
//                .load();


    }
}
