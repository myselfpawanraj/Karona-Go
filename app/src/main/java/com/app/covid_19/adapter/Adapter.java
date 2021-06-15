package com.app.covid_19.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.covid_19.model.Post;
import com.app.covid_19.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List< Post > postList;
    Context context;

    public Adapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.card, parent, false );
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = postList.get( position );

        final String url = post.getLink();
        holder.button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData( Uri.parse(url));
                v.getContext().startActivity( i );
            }
        } );
        holder.imageView.setImageResource( post.getImage() );
        holder.title.setText( post.getTitle() );
        holder.description.setText( post.getDescription() );

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title = itemView.findViewById( R.id.heading ),
                description= itemView.findViewById( R.id.description );
        ImageView imageView = (ImageView) itemView.findViewById( R.id.image );
        Button button = (Button) itemView.findViewById( R.id.button );
        public ViewHolder(@NonNull View itemView) {

            super( itemView );
        }
    }
}
