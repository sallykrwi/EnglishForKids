package com.lotus.englishforkids;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.lotus.englishforkids.R;

import java.util.ArrayList;

public class custom_adapter extends BaseAdapter implements View.OnClickListener {

    ArrayList<product> myproduct;
    Context context;
    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.btn1){
            Intent intent=new Intent(this.context,learn1.class);
           context.startActivity(intent);
        }
        else if (view.getId()==R.id.btn2)
        { Intent intent=new Intent(this.context,play1.class);
           context.startActivity(intent);
        }
        else if (view.getId()== R.id.btn3)
        {
            Intent intent=new Intent(this.context,animalsong.class);
            context.startActivity(intent);
        }
    }
    public custom_adapter(ArrayList<product> myproduct, Context context) {
        this.myproduct = myproduct;
        this.context = context;
    }

    @Override
    public int getCount() {
        return myproduct.size();
    }

    @Override
    public Object getItem(int i) {
        return myproduct.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater=((Activity)context).getLayoutInflater();

        View row=  inflater.inflate(R.layout.row_list_row,viewGroup,false);


        TextView tvName=row.findViewById(R.id.tvname);
        Button btn1=row.findViewById(R.id.btn1);
        Button btn2=row.findViewById(R.id.btn2);
        Button btn3=row.findViewById(R.id.btn3);
        ImageView img=row.findViewById(R.id.img);

        tvName.setText(myproduct.get(i).Name);
        btn1.setText(myproduct.get(i).Btn1);
        btn2.setText(myproduct.get(i).Btn2);
        btn3.setText(myproduct.get(i).Btn3);
        img.setImageResource(myproduct.get(i).img);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        return row;
    }
}
