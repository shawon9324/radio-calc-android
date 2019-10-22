package com.diu.radiocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.resultTextview);
        Intent intent = getIntent();
        int result = intent.getIntExtra(MainActivity.extraNumber,0);
        textView.setText("OUTPUT"+result);

    }
}
