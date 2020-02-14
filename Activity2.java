package com.example.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra(MainActivity.messageKey));
    }
}
