package com.lotus.englishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class animalsong extends AppCompatActivity {
    VideoView v;
    ImageView m;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalsong);

        v=findViewById(R.id.video);
        m=findViewById(R.id.mac);
        b=findViewById(R.id.home);

        String s="android.resource://com.lotus.englishforkids/"+R.raw.animals;
        Uri sr= Uri.parse(s);
        v.setVideoURI(sr);
        v.setMediaController(new MediaController(this));
        v.requestFocus();
        v.start();

    }

    public void tohome(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }

    }

