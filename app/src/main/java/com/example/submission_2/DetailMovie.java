package com.example.submission_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovie extends AppCompatActivity {

    public static final String EXTRA_DATA = "extra_data";
    ImageView detailPhoto;
    TextView detailTitle;
    TextView detailDate;
    TextView detailDesc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_movies);
        Movie movie = getIntent().getParcelableExtra(EXTRA_DATA);
        if (movie != null) {
            detailPhoto = findViewById(R.id.img_id);
            detailPhoto.setImageResource(movie.getImage());
            detailTitle = findViewById(R.id.title_id);
            detailTitle.setText(movie.getTitle());
            detailDate = findViewById(R.id.date_id);
            detailDate.setText(movie.getDate());
            detailDesc = findViewById(R.id.desc_id);
            detailDesc.setText(movie.getDescription());
            getSupportActionBar().setTitle(movie.getTitle());

        }
    }
}
