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

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context context;
    private ArrayList<TVShow> tvData;

    public RecyclerAdapter(Context context, ArrayList<TVShow> tvData) {
        this.context = context;
        this.tvData = tvData;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_tvshows, viewGroup, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder viewHolder, final int i) {
        Glide.with(context)
                .load(tvData.get(i).getImage())
                .apply(new RequestOptions().override(150,150))
                .into(viewHolder.img);
        viewHolder.txtDateStart.setText("Episode Pertama : " + tvData.get(i).getDateStart());
        viewHolder.txtDateEnd.setText("Episode Terakhir : " + tvData.get(i).getDateEnd());
        viewHolder.txtTitle.setText(tvData.get(i).getTitle());
        viewHolder.txtEpisode.setText(tvData.get(i).getEpisode());

        viewHolder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(context, DetailTvShow.class);
                detailIntent.putExtra(DetailTvShow.EXTRA_TV, tvData.get(i));
                context.startActivity(detailIntent);
            }
        });
        viewHolder.txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(context, DetailTvShow.class);
                detailIntent.putExtra(DetailTvShow.EXTRA_TV, tvData.get(i));
                context.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtDateStart;
        TextView txtDateEnd;
        TextView txtTitle;
        TextView txtEpisode;
        TextView txtDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDateStart = itemView.findViewById(R.id.startDate_id);
            txtDateEnd = itemView.findViewById(R.id.endDate_id);
            txtEpisode = itemView.findViewById(R.id.episode_id);
            txtTitle = itemView.findViewById(R.id.title_id);
            img = itemView.findViewById(R.id.img_id);
            txtDesc = itemView.findViewById(R.id.desc_id);
        }
    }
}
