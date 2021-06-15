package com.app.covid_19;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.app.covid_19.model.PrefManager;

public class IntroActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
            startActivity(new Intent(IntroActivity.this, SplashScreenActivity.class));
            finish();
        }
        setContentView( R.layout.intro_layout );
        getSupportActionBar().hide();

        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        // Set an Adapter on the ViewPager
        mViewPager.setAdapter(new IntroAdapter(getSupportFragmentManager()));
        
        // Set a PageTransformer
        mViewPager.setPageTransformer(false, new IntroPageTransformer());
    }
    
}