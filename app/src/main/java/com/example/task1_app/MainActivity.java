package com.example.task1_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performAction(View view){
        final ListView list = findViewById(R.id.button);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Bakery and Bread");
        arrayList.add("Rice and Wheat");
        arrayList.add("Chocolates");
        arrayList.add("Ice-cream");
        arrayList.add("Cereals");
        arrayList.add("Dairy products");
        arrayList.add("Snacks");
        arrayList.add("Meat and seafood");
        arrayList.add("Soups");
        arrayList.add("Eggs");
        arrayList.add("Cold Drinks");
        arrayList.add("Chips");
        arrayList.add("Butter");
        arrayList.add("Sanitizer");
        arrayList.add("Beans and legumes");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,                   android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, items.get(position)+"", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
