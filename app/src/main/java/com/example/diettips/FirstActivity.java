package com.example.diettips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FirstActivity extends AppCompatActivity {

    AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        MobileAds.initialize(this,"ca-app-pub-2058926917596778~3778604934");
        adView=findViewById(R.id.firstadView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void regular(View view) {
        startActivity(new Intent(FirstActivity.this,secondActivity.class));
        finish();
    }

    public void diabetes(View view) {
        startActivity(new Intent(FirstActivity.this,thirdActivity.class));
        finish();
    }

    public void eat(View view) {
        startActivity(new Intent(FirstActivity.this,forthActivity.class));
        finish();
    }

    public void workout(View view) {
        startActivity(new Intent(FirstActivity.this,fifthActivity.class));
        finish();
    }
}
