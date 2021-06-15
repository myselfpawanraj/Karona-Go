package com.app.covid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.app.covid_19.adapter.Adapter;
import com.app.covid_19.model.Post;

import java.util.ArrayList;
import java.util.List;

public class Bored extends AppCompatActivity {
    List< Post > postList=new ArrayList<>( );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bored );
        this.getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById( R.id.recycler );
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        postList.add( new Post( "PUBG","The game PUBG is an online one so mostly every people doesn't likes to exit in between the play time." ,
                "https://play.google.com/store/apps/details?id=com.tencent.ig&hl=en_IN", R.drawable.pubg) );
        postList.add( new Post( "NETFLIX","Watch Netflix movies & TV shows online or stream right to your smart TV, game console, PC, Mac, mobile, tablet and more." ,
                "https://www.netflix.com/in/", R.drawable.netflix) );
        postList.add( new Post( "Try painting!","Don't worry, you don't have to be a trained painter or artist to create your own works of art." ,
                "https://www.youtube.com/watch?v=DcO4oCiPPoQ", R.drawable.painting) );
        postList.add( new Post( "Music?.","Try learning guitar or instrument which you want to play." ,
                "https://www.youtube.com/playlist?list=PLiyMO_9U8g1BNzo7ZoXwKg2Pqt5chP6CT", R.drawable.guitar) );
        postList.add( new Post( "Decorate room","Redecorating your house or room can be a fun way to fight feeling bored." ,
                "https://www.shutterfly.com/ideas/diy-room-decor/", R.drawable.decor) );
        postList.add( new Post( "Something tasty?.","Being stuck at home is a great chance to make something delicious. Don't settle for something pre-made or boring." ,
                "https://www.youtube.com/watch?v=3cyxUKEPaUM", R.drawable.cooking) );
        postList.add( new Post( "Funny videos","Whatever you might be in the mood for. New videos are posted constantly, there is always something to catch up on." ,
                "https://www.youtube.com/results?search_query=funny+videos", R.drawable.funny) );
        postList.add( new Post( "Gaming?."," Video games can be the perfect way to make a boring day way more exciting." ,
                "https://www.youtube.com/playlist?list=PLiyMO_9U8g1BNzo7ZoXwKg2Pqt5chP6CT", R.drawable.game) );
        postList.add( new Post( "LUDO","Board games have long been a favorite when it comes to passing the time and fighting boredom." ,
                "https://play.google.com/store/apps/details?id=com.ludo.king&hl=en_IN", R.drawable.ludo) );
        postList.add( new Post( "YOGA","Stretching can help you relax mentally and improve your body's range of motion and flexibility." ,
                "https://www.youtube.com/results?search_query=yoga+tutorials", R.drawable.yoga) );

        Adapter adapter = new Adapter( postList , Bored.this);
        recyclerView.setAdapter( adapter );
        adapter.notifyDataSetChanged();

    }
}
