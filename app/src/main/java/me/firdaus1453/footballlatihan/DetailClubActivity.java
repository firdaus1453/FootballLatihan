package me.firdaus1453.footballlatihan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailClubActivity extends AppCompatActivity {

    @BindView(R.id.imgDetail)
    ImageView imgDetail;
    @BindView(R.id.titleDetail)
    TextView titleDetail;
    @BindView(R.id.detailClub)
    TextView detailClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_club);
        ButterKnife.bind(this);

        titleDetail.setText(getIntent().getStringExtra("nb"));
        detailClub.setText(getIntent().getStringExtra("dt"));

        imgDetail.setImageResource(getIntent().getIntExtra("gb", 0));
    }
}
