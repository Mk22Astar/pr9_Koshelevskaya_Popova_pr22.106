package com.example.pr9_koshelevskaya_popova_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button10);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent browserIntent = new
        Intent(Intent.ACTION_VIEW, Uri.parse("https://www.android.com"));
        startActivity(browserIntent);
    }


}