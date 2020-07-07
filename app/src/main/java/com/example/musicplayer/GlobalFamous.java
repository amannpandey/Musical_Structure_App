package com.example.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class GlobalFamous extends AppCompatActivity {

    private  MediaPlayer mediaPlayer;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list);



        final ArrayList<com.example.musicplayer.AlbumDetail> albumList = new ArrayList<>();

        albumList.add(new com.example.musicplayer.AlbumDetail("Alan Walker", "Faded", R.drawable.global,R.raw.number_one));
        albumList.add(new com.example.musicplayer.AlbumDetail("Martin Garrix", "High On Life", R.drawable.global,R.raw.number_three));
        albumList.add(new com.example.musicplayer.AlbumDetail("Closer", "The Chainsmokers", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist1", "Music 1", R.drawable.global,R.raw.number_one));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist2", "Music 2", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist3", "Music 3", R.drawable.global,R.raw.number_three));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist4", "Music 4", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist5", "Music 5", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist6", "Music 6", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist7", "Music 7", R.drawable.global,R.raw.number_three));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist8", "Music 8", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist9", "Music 9", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist10", "Music 10", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist11", "Music 11", R.drawable.global,R.raw.number_two));
        albumList.add(new com.example.musicplayer.AlbumDetail("Artist12", "Music 12", R.drawable.global,R.raw.number_two));

        //   For Up navigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final AlbumAdapter albumAdapter = new AlbumAdapter(this, albumList,R.color.globalColor);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(albumAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                releaseMediaPlayer();

                com.example.musicplayer.AlbumDetail albumDetail = albumList.get(position);

                Log.v("NumbersActivity", "Current word: " + albumDetail);
                mediaPlayer = MediaPlayer.create(GlobalFamous.this, albumDetail.getAudioId());
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(mCompletionListener);




            }
        });

    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.

           mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
           mediaPlayer = null;
        }
    }


    @Override
    protected void onStop(){
        super.onStop();
        releaseMediaPlayer();

    }
}
