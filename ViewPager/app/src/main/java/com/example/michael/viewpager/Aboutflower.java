package com.example.michael.viewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Aboutflower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutflower);
        //View view = inflater.inflate(R.layout.activity_aboutflower, null);
        ImageView im = (ImageView) findViewById(R.id.icon);
        im.setImageResource(R.drawable.about_flower);
    }
}
