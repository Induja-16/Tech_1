package com.example.tech_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1[],data2[];
    int images[];
    Context context;
    public MyAdapter(Context ct, String[] s1, String[] s2, int[] img){
        context = ct;
        data1 =s1;
        data2= s2;
        images=img;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.food_view.setText(data1[position]);
        holder.price_view.setText(data2[position]);
        holder.myImageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    public class MyViewHolder  extends RecyclerView.ViewHolder{

        CardView cardView;
        ImageView TopimageView;
        TextView share,trend;

        TextView food_view,price_view;
        ImageView myImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            food_view = itemView.findViewById(R.id.food_View);
            price_view = itemView.findViewById(R.id.price_view);
            myImageView = itemView.findViewById(R.id.myImageView);
        }
    }
}
