package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout global, weekly, best_artist, my_playlist, global2, weekly2, best_artist2, my_playlist2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        global = findViewById(R.id.global_id);
        weekly = findViewById(R.id.weekly_id);
        best_artist = findViewById(R.id.best_artist_id);
        my_playlist = findViewById(R.id.my_playlist_id);


        global2 = findViewById(R.id.global_id2);
        weekly2 = findViewById(R.id.weekly_id2);
        best_artist2 = findViewById(R.id.best_artist_id2);
        my_playlist2 = findViewById(R.id.my_playlist_id2);


        global.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.GlobalFamous.class);
                startActivity(intent);
            }
        });

        weekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.Weekly.class);
                startActivity(intent);
            }
        });

        best_artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.BestArtist.class);
                startActivity(intent);
            }
        });

        my_playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.MyPlaylist.class);
                startActivity(intent);
            }
        });


        global2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.GlobalFamous.class);
                startActivity(intent);
            }
        });

        weekly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.Weekly.class);
                startActivity(intent);
            }
        });

        best_artist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.BestArtist.class);
                startActivity(intent);
            }
        });
        my_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.musicplayer.MyPlaylist.class);
                startActivity(intent);
            }
        });


    }
}
