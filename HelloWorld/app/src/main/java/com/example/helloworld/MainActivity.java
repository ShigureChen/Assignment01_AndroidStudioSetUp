package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ListView listView;
    Textview titleTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        listView = findViewById(R.id.listView);

        String[] fruits = {"Apple", "Banana", "Orange", "Lime", "Peach", "Plum"};

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, fruits);
        spinner.setAdapter(adapter);
        listView.setAdapter(adapter);

        spinner.setOnItemClickListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?>parent, View view, int position, long id) {
                changeText(parent, view, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}