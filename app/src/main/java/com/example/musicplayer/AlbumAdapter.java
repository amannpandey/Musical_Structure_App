package com.example.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class AlbumAdapter extends ArrayAdapter<com.example.musicplayer.AlbumDetail> {

    public static int mcolorId;

    public AlbumAdapter(Context context, ArrayList<com.example.musicplayer.AlbumDetail> arrayAdapter, int colorId) {

        super(context, 0, arrayAdapter);
        mcolorId=colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListView = convertView;
        if (currentListView == null) {
            currentListView = LayoutInflater.from(getContext()).inflate(R.layout.music_list_view, parent, false);
        }

        com.example.musicplayer.AlbumDetail albumDetail = getItem(position);

        LinearLayout container= currentListView.findViewById(R.id.container);
        int color= ContextCompat.getColor(getContext(),mcolorId);
        container.setBackgroundColor(color);

        TextView textView = currentListView.findViewById(R.id.listViewArtistName);
        textView.setText(albumDetail.getArtistName());

        TextView textView2 = currentListView.findViewById(R.id.listViewMusicName);
        textView2.setText(albumDetail.getMusicName());

        ImageView imageView = currentListView.findViewById(R.id.list_item_icon);

        if (albumDetail.hasImage()) {
            imageView.setImageResource(albumDetail.getImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return currentListView;
    }
}
