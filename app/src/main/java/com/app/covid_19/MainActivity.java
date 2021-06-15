package com.app.covid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.app.covid_19.search.SearchActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        this.getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        CardView
                cardView= findViewById( R.id.status ),
                cardView1= findViewById( R.id.helpline ),
//                cardView2= findViewById( R.id.testcenter ),
                cardView3= findViewById( R.id.realtime ),
                cardView4= findViewById( R.id.mohfw ),
                cardView5= findViewById( R.id.prevention ),
                cardView6= findViewById( R.id.bored ),
                cardView7= findViewById( R.id.about );
        cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, SearchActivity.class );
                startActivity( intent );
            }
        } );
        cardView1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), Helpline.class );
                startActivity( intent );
            }
        } );
//        cardView2.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent( getApplicationContext(), TestCenters.class );
//                startActivity( intent );
//            }
//        } );
        cardView3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.worldometers.info/coronavirus/country/india/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData( Uri.parse(url));
                startActivity(i);
            }
        } );
        cardView4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), MOHFW.class );
                startActivity( intent );
            }
        } );
        cardView5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), Prevention.class );
                startActivity( intent );
            }
        } );
        cardView6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), Bored.class );
                startActivity( intent );
            }
        } );
        cardView7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getApplicationContext(), About.class );
                startActivity( intent );
            }
        } );
    }
}
