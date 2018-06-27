package com.example.dell.cardviewintegrationwithrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 12/10/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.viewholder> {
    ArrayList<Contacts> contacts=new ArrayList<Contacts>();
    Context context;
    public Adapter(ArrayList<Contacts> contacts,Context context){
        this.contacts=contacts;
        this.context=context;
    }
    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_card,parent,false);
        viewholder hldr=new viewholder(view,context,contacts);
        return hldr;


    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        Contacts con=contacts.get(position);
        holder.img1.setImageResource(con.getImage_id());
        holder.text1.setText(con.getName());
        holder.text2.setText(con.getEmail_id());
        holder.text3.setText(con.getMobile());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
    public static class viewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView img1;
        TextView text1,text2,text3;
        ArrayList<Contacts> contacts=new ArrayList<Contacts>();
        Context context;

        public viewholder(View itemView,Context context,ArrayList<Contacts> contacts) {


            super(itemView);
            this.contacts=contacts;
            this.context=context;
            itemView.setOnClickListener(this);

            img1=(ImageView)itemView.findViewById(R.id.img1);
            text1=(TextView)itemView.findViewById(R.id.text1);
            text2=(TextView)itemView.findViewById(R.id.text2);
            text3=(TextView)itemView.findViewById(R.id.text3);
        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            Contacts contacts=this.contacts.get(position);
            Intent intent=new Intent(this.context,Contact_Details.class);
            intent.putExtra("imgid",contacts.getImage_id());
            intent.putExtra("text1_id",contacts.getName());
            intent.putExtra("tetx2_id",contacts.getEmail_id());
            intent.putExtra("text3_id",contacts.getMobile());
            this.context.startActivity(intent);
        }
    }
}
