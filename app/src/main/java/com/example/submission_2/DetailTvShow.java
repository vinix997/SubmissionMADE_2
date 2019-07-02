package com.example.submission_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTvShow extends AppCompatActivity {
    public static final String EXTRA_TV = "extra_tv";
    ImageView detailPhoto;
    TextView detailTitle;
    TextView detailStartDate;
    TextView detailEpisode;
    TextView detailEndDate;
    TextView detailDesc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_tvshows);

        TVShow tvShow = getIntent().getParcelableExtra(EXTRA_TV);
        if (tvShow != null) {
            detailPhoto = findViewById(R.id.img_id);
            detailPhoto.setImageResource(tvShow.getImage());
            detailTitle = findViewById(R.id.title_id);

            detailTitle.setText(tvShow.getTitle());
            detailStartDate = findViewById(R.id.startDate_id);
            detailStartDate.setText("Episode Pertama : " + tvShow.getDateStart());
            detailEndDate = findViewById(R.id.endDate_id);
            detailEndDate.setText("Episode Terakhir : " + tvShow.getDateEnd());
            detailEpisode = findViewById(R.id.episode_id);
            detailEpisode.setText("Jumlah Episode : " + tvShow.getEpisode());
            detailDesc = findViewById(R.id.desc_id);
            detailDesc.setText("Synopsis : \n" + tvShow.getDescription());
            getSupportActionBar().setTitle(tvShow.getTitle());
        }
    }

}
