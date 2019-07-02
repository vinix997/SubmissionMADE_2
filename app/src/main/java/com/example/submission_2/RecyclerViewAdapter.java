package com.example.submission_2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Movie> movieData;


    public RecyclerViewAdapter(Context context, ArrayList<Movie> movieData) {
        this.context = context;

        this.movieData = movieData;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_movies, viewGroup, false);
        ViewHolder holder = new ViewHolder(v);


        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {

        Glide.with(context)
                .load(movieData.get(i).getImage())
                .apply(new RequestOptions().override(150,150))
                .into(viewHolder.img);

        viewHolder.txtDate.setText(movieData.get(i).getDate());
        viewHolder.txtTitle.setText(movieData.get(i).getTitle());

        viewHolder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(context, DetailMovie.class);
                detailIntent.putExtra(DetailMovie.EXTRA_DATA, movieData.get(i));
                context.startActivity(detailIntent);
            }
        });
        viewHolder.txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(context, DetailMovie.class);
                detailIntent.putExtra(DetailMovie.EXTRA_DATA, movieData.get(i));
                context.startActivity(detailIntent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return movieData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView txtTitle;
        private TextView txtDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_id);
            txtTitle = itemView.findViewById(R.id.title_id);
            txtDate = itemView.findViewById(R.id.date_id);

        }


    }

}
