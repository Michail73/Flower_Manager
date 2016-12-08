package com.example.michael.viewpager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Catalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.cat);

        ListView listView = (ListView)findViewById(R.id.listView);

        final String[] flowers = new String[]{
                "Абелиолистник", "Абелия", "Абрикос", "Абутилон", "Аверроа карамбола", "Авокадо приятнейшее", "Агава американская", "Агава королевы Виктории", "Агапантус", "Аглаонема изменчивая", "Адениум",
                "Роза", "Лилия", "Клюква", "МАРИХУАНА"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, flowers);

        listView.setAdapter(adapter); 
    }

}
