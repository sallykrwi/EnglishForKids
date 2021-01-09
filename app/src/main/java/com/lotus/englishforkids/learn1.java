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

public class learn1 extends AppCompatActivity {
    ImageView imgA;
    TextView tv;
    TextView tv2;
    //Button next;
    Button home;
    Animation an;
    Animation zoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn1);

        final MediaPlayer mci = MediaPlayer.create(learn1.this, R.raw.cat);




        imgA = findViewById(R.id.imgA);
        tv2 = findViewById(R.id.tv2);
        tv = findViewById(R.id.tv);

        an= AnimationUtils.loadAnimation(this,R.anim.animation);
        zoom= AnimationUtils.loadAnimation(this,R.anim.zoom);
        tv2.setAnimation(an);

        imgA.setAnimation(zoom);
        // next = findViewById(R.id.next);
        home = findViewById(R.id.home);

        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mci.start();

            }
        });


    }





   /* int img_id = 0;
    int[] arr = new int[]{R.drawable.a, R.drawable.b, R.drawable.pan, R.drawable.fruit,R. drawable.j, R.drawable.vag};
    @Override
    public void onClick(View view) {

            imgA.setImageResource(arr[img_id]);

            img_id = img_id + 1;
            if (img_id > 6) {
                img_id = 0;
            }


    }*/

    public void tohome(View view) {
        if (view.getId() == R.id.home) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }


    public void next(View view) {
        if (view.getId() == R.id.next) {
            Intent intent = new Intent(this,learn2.class);
            startActivity(intent);
        }
    }
    }

