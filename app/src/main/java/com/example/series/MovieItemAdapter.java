package com.example.series;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class MovieItemAdapter extends ArrayAdapter<MoviesItem> {
    public MovieItemAdapter(@NonNull Context context, int resource, @NonNull MoviesItem[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MoviesItem item = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.movieitem,parent,false);
        TextView movietextTxt = view.findViewById(R.id.movietext_txt);
        movietextTxt.setText(item.name1);
        ImageView movieIv = view.findViewById(R.id.movie_iv);
        Picasso.get().load(item.image).into(movieIv);
        return view;
    }
}
