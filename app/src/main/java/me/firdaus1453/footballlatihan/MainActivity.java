package me.firdaus1453.footballlatihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecycle;
    String nama[] = {"AC Milan", "Arsenal", "Chelsea", "Barcalona","Bayern"};
    int gambarbuah[]= {R.drawable.img_acm, R.drawable.img_arsenal, R.drawable.img_chelsea, R.drawable.img_barca,R.drawable.img_bayern};
    String[] detailclub;
//    String[] detailclub = getResources().getStringArray(R.array.club_detail);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detailclub = getResources().getStringArray(R.array.club_detail);

        myRecycle = findViewById(R.id.my_recycler_view);

        Adapter adapter = new Adapter(MainActivity.this, gambarbuah, nama, detailclub);
        myRecycle.setHasFixedSize(true);
        myRecycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        myRecycle.setAdapter(adapter);

    }
}