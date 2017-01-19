package com.example.michael.viewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Aboutflower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutflower);
        //View view = inflater.inflate(R.layout.activity_aboutflower, null);
        ImageView im = (ImageView) findViewById(R.id.icon);
        ImageView im1 = (ImageView) findViewById(R.id.water);
        ImageView im2 = (ImageView) findViewById(R.id.bck);
        ImageView im3 = (ImageView) findViewById(R.id.gradusnik);
        ImageView im4 = (ImageView) findViewById(R.id.sun);

       im.setImageResource(R.drawable.about_flower2);
        im2.setImageResource(R.drawable.dark_bcrnd);
        im3.setImageResource(R.drawable.gradisnik);
        im4.setImageResource(R.drawable.sun);
        im1.setImageResource(R.drawable.water);
//        im.setImageResource(R.drawable.plus);

        TextView water_text = (TextView) findViewById(R.id.water_text);
        water_text.setText("Каждую\n неделю");

        TextView sun_text = (TextView) findViewById(R.id.sun_text);
        sun_text.setText("среднее");

        TextView temperature = (TextView) findViewById(R.id.temperature);
        temperature.setText("15-20");

    }
}
