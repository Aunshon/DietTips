package com.example.diettips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class fifthActivity extends AppCompatActivity {
    AdView adView;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        MobileAds.initialize(this,"ca-app-pub-2058926917596778~3778604934");
        adView=findViewById(R.id.fifthadView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2058926917596778/9129121033");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                startActivity(new Intent(fifthActivity.this,FirstActivity.class));
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded() || mInterstitialAd.isLoading()){
            mInterstitialAd.show();
        }
        else {
            startActivity(new Intent(fifthActivity.this,FirstActivity.class));
            finish();
        }
    }
}
