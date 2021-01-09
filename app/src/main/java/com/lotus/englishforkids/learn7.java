package com.lotus.englishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class learn7 extends AppCompatActivity {

    ImageView imgA;
    TextView tv2;
    Button next;
    Button home;
    Animation an;
    Animation zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn7);

        final MediaPlayer mci = MediaPlayer.create(learn7.this, R.raw.elphent);


        imgA = findViewById(R.id.imgA);
        tv2 = findViewById(R.id.tv2);
        next = findViewById(R.id.next);
        home = findViewById(R.id.home);
        an= AnimationUtils.loadAnimation(this,R.anim.animation);
        zoom= AnimationUtils.loadAnimation(this,R.anim.zoom);
        tv2.setAnimation(an);
        imgA.setAnimation(zoom);

        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mci.start();

            }
        });
    }
    public void tohome(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }


    public void next(View view) {
        if (view.getId() == R.id.next) {
            Intent intent = new Intent(this,learn8.class);
            startActivity(intent);
        }
    }


    public void back(View view) {
        if (view.getId() == R.id.back) {
            onBackPressed();
        }
    }
    }

