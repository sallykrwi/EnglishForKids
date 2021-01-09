package com.lotus.englishforkids;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView LView;
    ArrayList<product> products;
    custom_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LView=findViewById(R.id.lView);

        products=new ArrayList<>();products.add(new product("ANAMELS","Learn","play","listen TM",R.drawable.dog) );
        products.add(new product("FRUIT","Learn","play","listen TM",R.drawable.fruit) );
        products.add(new product("VEGETABLES","Learn","play","listen TM",R.drawable.vag) );
        products.add(new product("COLORS","Learn","play","listen TM",R.drawable.color) );
        products.add(new product("NUMBERS","Learn","Play","listen TM",R.drawable.num) );
        products.add(new product("INSTRUMENTS","Learn","Play","listen TM",R.drawable.ins) );


        adapter=new custom_adapter(products,this);
        LView.setAdapter(adapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
         if (id==R.id.call)
        {
            Uri data= Uri.parse("tel:773774312");
            Intent intent=new Intent(Intent.ACTION_DIAL,data);
            startActivity(intent);
        }
      /*  else if (id==R.id.setting)
        {

            Intent intent = new Intent(this,fans.class);
            startActivity(intent);
        }*/
        else if (id==R.id.home)
        {

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if (id==R.id.exit)
        {



            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Are you sure that you want to exit from app").setTitle("Closing")
                    .setPositiveButton("yes", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            MainActivity.super.onBackPressed();
                            Toast.makeText(MainActivity.this, " Eixt from app done" ,Toast.LENGTH_SHORT).show();



                        }

                    }).setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i)
                {

                }

            }).show();


        }





        return super.onOptionsItemSelected(item);
    }
    long time;

    public  void onBackPressed()
    {
        if(time + 2000 > System.currentTimeMillis())
        {
            super.onBackPressed();
        }
        else
        {
            Toast.makeText(MainActivity.this,
                    "click again to exit",Toast.LENGTH_SHORT).show();
        }
        time =System.currentTimeMillis();
    }






    @Override
    public void onClick(View view) {

    }

   }