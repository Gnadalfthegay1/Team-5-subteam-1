package com.myapplicationdev.android.tw_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Year> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvYear);


        al = new ArrayList<Year>();
        al.add(new Year("Year 1"));
        al.add(new Year("Year 2"));
        al.add(new Year("Year 3"));

        aa = new YearAdapter(this, R.layout.row, al);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Year selectedYear = al.get(position);

                Toast.makeText(FirstActivity.this, selectedYear.getYear(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
