package com.example.administrator.multisnaprecyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

/**
 * Created by takusemba on 2017/08/03.
 */

public class HorizontalActivity extends AppCompatActivity {

    String[] koreanTvShowNames = {
            "未生",
            "商道",
            "秘密森林",
            "九回時間旅行",
            "回答1997",
            "信號"
    };

    int[] koreanTvShowImages = {
            R.drawable.misaeng2,
            R.drawable.business_road2,
            R.drawable.forest_of_secrets2,
            R.drawable.nine_9_times_time_travel2,
            R.drawable.reply_19972,
            R.drawable.signal2
    };

    String[] americanTvShowNames = {
            "永生之酒",
            "螢火蟲",
            "搜捕炸彈客",
            "花園牆外",
            "冷戰疑雲"
    };

    int[] americanTvShowImages = {
            R.drawable.baccano2,
            R.drawable.firefly2,
            R.drawable.manhunt_unabomber2,
            R.drawable.over_the_garden_wall2,
            R.drawable.the_company2
    };

    String[] japaneseTvShowNames = {
            "王牌大律師",
            "母親",
            "火花",
            "白色巨塔",
            "東京愛情故事"
    };

    int[] japaneseTvShowImages = {
            R.drawable.legal_high2,
            R.drawable.mother2,
            R.drawable.sparks2,
            R.drawable.the_ivory_tower2,
            R.drawable.tokyo_love_story2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);

        HorizontalAdapter firstAdapter = new HorizontalAdapter(koreanTvShowNames, koreanTvShowImages);
        MultiSnapRecyclerView firstRecyclerView = (MultiSnapRecyclerView)findViewById(R.id.first_recycler_view);
        LinearLayoutManager firstManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        firstRecyclerView.setLayoutManager(firstManager);
        firstRecyclerView.setAdapter(firstAdapter);

        HorizontalAdapter secondAdapter = new HorizontalAdapter(americanTvShowNames, americanTvShowImages);
        MultiSnapRecyclerView secondRecyclerView =(MultiSnapRecyclerView) findViewById(R.id.second_recycler_view);
        LinearLayoutManager secondManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        secondRecyclerView.setLayoutManager(secondManager);
        secondRecyclerView.setAdapter(secondAdapter);

        HorizontalAdapter thirdAdapter = new HorizontalAdapter(japaneseTvShowNames, japaneseTvShowImages);
        MultiSnapRecyclerView thirdRecyclerView = (MultiSnapRecyclerView)findViewById(R.id.third_recycler_view);
        LinearLayoutManager thirdManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        thirdRecyclerView.setLayoutManager(thirdManager);
        thirdRecyclerView.setAdapter(thirdAdapter);
    }
}