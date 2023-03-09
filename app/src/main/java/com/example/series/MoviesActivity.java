package com.example.series;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MoviesActivity extends AppCompatActivity {
    GridView grid1Gv;
    MoviesItem[] moviesItems;
    MovieItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        initViews();
        getMovieData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        grid1Gv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new MovieItemAdapter(this, android.R.layout.simple_dropdown_item_1line,moviesItems);
    }

    private void getMovieData() {
        moviesItems = new MoviesItem[6];
        MoviesItem moviesItem1 = new MoviesItem();
        moviesItem1.image = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220 ";
        moviesItem1.name1 ="Harry potter and the sorcerer's stone";
        moviesItems[0]=moviesItem1;

        MoviesItem moviesItem2 = new MoviesItem();
        moviesItem2.image = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647 ";
        moviesItem2.name1="Harry potter andchamber of secrets";
        moviesItems[1]=moviesItem2;

        MoviesItem moviesItem3 = new MoviesItem();
        moviesItem3.image = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg  ";
        moviesItem3.name1="harry potter and the prisoner of azkaban";
        moviesItems[2]=moviesItem3;

        MoviesItem moviesItem4 = new MoviesItem();
        moviesItem4.image = "https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        moviesItem4.name1="harry potter and the goblet of fire";
        moviesItems[3]=moviesItem4;

        MoviesItem moviesItem5 = new MoviesItem();
        moviesItem5.image = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        moviesItem5.name1="harry potter and the goblet of fire";
        moviesItems[4]=moviesItem5;

        MoviesItem moviesItem6 = new MoviesItem();
        moviesItem6.image = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg ";
        moviesItem6.name1="harry potter and the goblet of fire";
        moviesItems[5]=moviesItem6;
    }

    private void initViews() {
        grid1Gv = findViewById(R.id.grid1_gv);
        grid1Gv.setNumColumns(2);
    }
}