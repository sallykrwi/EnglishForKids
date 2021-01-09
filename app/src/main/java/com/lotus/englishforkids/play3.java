package com.lotus.englishforkids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class play3 extends AppCompatActivity implements View.OnClickListener{
    TextView txt;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView back;
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3);

        txt=findViewById(R.id.txt);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        back=findViewById(R.id.back);
        home=findViewById(R.id.home);
        back.setOnClickListener(this);
        home.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.back)
        { onBackPressed();}
        if(view.getId()==R.id.home)
        {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }

    public void right(View view) {


        if(view.getId()==R.id.img4){
            Intent intent=new Intent(this,play4.class);
            startActivity(intent);

            NotificationCompat.Builder  nm= (NotificationCompat.Builder) new NotificationCompat.Builder(play3.this).setContentTitle("Panda App")
                    .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)).
                            setContentText("the panda is happy").
                            setSmallIcon(R.drawable.cccc);
            NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.notify(1,nm.build());

        }
    }
    public void wrong(View view) {
        NotificationCompat.Builder  nm= (NotificationCompat.Builder) new NotificationCompat.Builder(play3.this).setContentTitle("facebook").
                setContentText("the panda is sad").
                setSmallIcon(R.drawable.ss);
        final MediaPlayer mci = MediaPlayer.create(play3.this, R.raw.win);
        mci.start();


        NotificationManager notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(1,nm.build());
    }
    }

