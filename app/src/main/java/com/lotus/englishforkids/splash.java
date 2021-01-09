package com.lotus.englishforkids;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    ImageView image;

    ProgressDialog progressDialog;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//        image=findViewById(R.id.image);
//
//
//        Thread thread=new Thread(){
//            @Override
//            public void run(){
//                try {
//                    sleep(4000);
//                    Intent russplash=new Intent(getApplicationContext(),MainActivity.class);
//                    startActivities(new Intent[]{russplash});
//                    finish();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }}};
//        thread.start();
//    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        image=findViewById(R.id.image);

        progressDialog=new ProgressDialog(splash.this);

        progressDialog.setTitle("Loading...");
        progressDialog.setMessage("Please Wait some Moment");
        progressDialog.setMax(50);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setCancelable(false);
        //progressDialog.setMax(20);
        progressDialog.show();
        Myclass m=new Myclass();
        m.start();


        Thread thread=new Thread(){
            @Override
            public void run(){
                try {
                    sleep(4000);
                    Intent russplash=new Intent(getApplicationContext(), MainActivity.class);
                    startActivities(new Intent[]{russplash});
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}};
        thread.start();
    }















    class  Myclass extends Thread {
        @Override
        public void run() {
            while (progressDialog.getProgress() < progressDialog.getMax()) {

                progressDialog.incrementProgressBy(2);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    progressDialog.dismiss();
                }
            });
            //   super.run();
        }


    }


}
