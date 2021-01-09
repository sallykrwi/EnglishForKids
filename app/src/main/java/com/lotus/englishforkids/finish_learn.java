package com.lotus.englishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class finish_learn extends AppCompatActivity {
    TextView t;
    TextView t2;
    ImageView p;
    Button yes;
    Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_learn);

        t=findViewById(R.id.txt);
        t2=findViewById(R.id.txt2);
        p=findViewById(R.id.img1);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
    }

    public void home(View view) {

        if(view.getId()==R.id.img1) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void yes(View view) {

        if(view.getId()==R.id.yes) {
            Intent intent = new Intent(this,learn1.class);
            startActivity(intent);
        }
    }

    public void no(View view) {
        if(view.getId()==R.id.no) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

}
