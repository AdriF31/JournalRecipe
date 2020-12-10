package com.adri.journalrecipe;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuListView extends RecyclerView.Adapter<MenuListView.ViewHolder> {

    private ArrayList<String> MenuImage = new ArrayList<>();
    private  ArrayList<String> MenuText = new ArrayList<>();
    private Context context;

    public MenuListView(ArrayList<String> menuImage, ArrayList<String> menuText, Context context) {
        MenuImage = menuImage;
        MenuText = menuText;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menu_list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).asBitmap().load(MenuImage.get(position)).into(holder.MenuImage);
        holder.MenuText.setText(MenuText.get(position));
        holder.constraintLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                final Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, IndonesianFood.class);
                        break;
                    case 1:
                        intent =  new Intent(context, KoreanFood.class);
                        break;
                    default:
                        intent =  new Intent(context, JapaneseFood.class);
                        break;
                }
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return MenuText.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView MenuImage;
        TextView MenuText;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            MenuImage = itemView.findViewById(R.id.MenuImage);
            MenuText = itemView.findViewById(R.id.MenuText);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }
    }
}
