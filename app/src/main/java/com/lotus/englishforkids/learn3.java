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

public class learn3 extends AppCompatActivity {

    TextView tv;
    ImageView imgA;
    TextView tv2;
    Button next;
    Button home;
    Button back;
    Animation an;
    Animation zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn3);
        final MediaPlayer mci = MediaPlayer.create(learn3.this, R.raw.tiger);

        tv = findViewById(R.id.tv);
        imgA = findViewById(R.id.imgA);
        tv2 = findViewById(R.id.tv2);
        next = findViewById(R.id.next);
        home = findViewById(R.id.home);
        back= findViewById(R.id.back);
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

    public void back(View view) {
        if (view.getId() == R.id.back) {
            onBackPressed();
        }
    }

    public void next(View view) {
        if (view.getId() == R.id.next) {
            Intent intent = new Intent(this,learn4.class);
            startActivity(intent);
        }

    }
}
