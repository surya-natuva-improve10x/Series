package com.example.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class SeriesActivity extends AppCompatActivity {
    ListView listeviewLv;
    public SeriesItem[] seriesItems;
    public SeriesItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        initViews();
        createData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        listeviewLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SeriesItemAdapter(this, android.R.layout.simple_dropdown_item_1line,seriesItems);
    }

    private void createData() {
        seriesItems = new SeriesItem[2];
        SeriesItem item1 = new SeriesItem();
        item1.name="kung fu panda";
        item1.imageUrl= "https://images.indianexpress.com/2022/07/Kung-Fu-Panda-The-Dragon-Knight-review-1200.jpg?w=480";
        seriesItems[0]=item1;

        SeriesItem item2 = new SeriesItem();
        item2.name = "Harry potter";
        item2.imageUrl = "https://uploads-ssl.webflow.com/618a73d35bc6ef04e7184abf/621cf2794d1c9f2c5e29036e_harry-potter.jpg";
        seriesItems[1]=item2;
    }

    private void initViews() {
        listeviewLv = findViewById(R.id.items_lv);
    }
}
/*
1. Create SeriesActivity
2. Create SeriesItem(name, imageUrl)
3. Create an array of SeriesItem "SeriesItem[]" and add data
4. Add ListView component in xml file
5. Add series_item.xml layout
6. Create a new ArrayAdapter class
7. Connect adapter with listview
 */