package com.example.viltsu.differentviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<DataObject> jou = new ArrayList<DataObject>();

        jou.add(new DataObject("Duckie, 100pts", R.drawable.bird));
        jou.add(new DataObject("Woody, 200pts", R.drawable.bird));
        jou.add(new DataObject("Penguino, 666pts", R.drawable.bird));
        jou.add(new DataObject("Chickadee'ee, 2pts", R.drawable.bird));
        jou.add(new DataObject("Crow, 50pts", R.drawable.bird));

        CustomAdapter itemAdapter = new CustomAdapter(this, jou);

        ListView listView = (ListView) findViewById(R.id.Masterlistview);

        listView.setAdapter(itemAdapter);
    }
}
