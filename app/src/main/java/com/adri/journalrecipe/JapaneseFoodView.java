package com.adri.journalrecipe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class JapaneseFoodView extends RecyclerView.Adapter<JapaneseFoodView.viewHolder>{

    private ArrayList<String> menuImage = new ArrayList<>();
    private  ArrayList<String> menuText = new ArrayList<>();
    private  ArrayList<String> infoMakanan = new ArrayList<>();
    private Context context;

    public JapaneseFoodView(ArrayList<String> menuImage, ArrayList<String> menuText,ArrayList<String> infoMakanan, Context context) {
        this.menuImage = menuImage;
        this.menuText = menuText;
        this.infoMakanan = infoMakanan;
        this.context = context;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_view,parent,false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int position) {
        Glide.with(context).asBitmap().load(menuImage.get(position)).into(holder.menuImage);
        holder.menuText.setText(menuText.get(position));

        holder.foodView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailMakanan.class);
                intent.putExtra("foto_makanan", menuImage.get(position));
                intent.putExtra("nama_makanan",menuText.get(position));
                intent.putExtra("info_makanan", infoMakanan.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuText.size();
    }

    public class viewHolder extends  RecyclerView.ViewHolder{
        ImageView menuImage;
        TextView menuText;
        ConstraintLayout foodView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            menuImage = itemView.findViewById(R.id.MenuImage);
            menuText = itemView.findViewById(R.id.MenuText);
            foodView = itemView.findViewById(R.id.foodView);
        }
    }
}
