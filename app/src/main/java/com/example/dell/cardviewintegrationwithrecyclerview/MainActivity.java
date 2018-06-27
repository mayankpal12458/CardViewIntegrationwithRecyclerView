package com.example.dell.cardviewintegrationwithrecyclerview;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    Toolbar mytoolbar;
    RecyclerView rv;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] name,email,mobile;
    int[] images={R.drawable.apj,R.drawable.arrahman,R.drawable.bigbpng,R.drawable.gandhi,R.drawable.gopichand,R.drawable.kalpana,R.drawable.sachin,R.drawable.steve};
    ArrayList<Contacts> list=new ArrayList<Contacts>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mytoolbar=(Toolbar)findViewById(R.id.mytoolbar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=getResources().getStringArray(R.array.person_name);
        email=getResources().getStringArray(R.array.person_email);
        mobile=getResources().getStringArray(R.array.person_mobile);
        int count=0;
        for (String Name :name){
            Contacts contact=new Contacts(images[count],name[count],email[count],mobile[count]);
            count++;
            list.add(contact);
        }
        rv=(RecyclerView)findViewById(R.id.rv);
        layoutManager=new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);
        adapter=new Adapter(list,this);
        rv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main,menu);
        return true;
    }
}
