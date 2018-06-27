package com.example.dell.cardviewintegrationwithrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact_Details extends AppCompatActivity {
    ImageView myimg;
    TextView mytext1,mytext2,mytext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__details);
        myimg=(ImageView)findViewById(R.id.myimg);
        mytext1=(TextView)findViewById(R.id.mytext1);
        mytext2=(TextView)findViewById(R.id.mytext2);
        mytext3=(TextView)findViewById(R.id.mytext3);
        myimg.setImageResource(getIntent().getIntExtra("imgid",00));
        mytext1.setText("Name: "+getIntent().getStringExtra("text1_id"));
        mytext2.setText("EMAIL: "+getIntent().getStringExtra("text2_id"));
        mytext2.setText("MOBILE: "+getIntent().getStringExtra("text3_id"));


    }
}
