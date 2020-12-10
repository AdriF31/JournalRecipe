package com.adri.journalrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMakanan extends AppCompatActivity {

    ImageView ImageViewFotoMakanan;
    TextView TextViewNamaMakanan, TextViewInfoMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        ImageViewFotoMakanan = findViewById(R.id.fotoMakanan);
        TextViewNamaMakanan = findViewById(R.id.namaMakanan);
        TextViewInfoMakanan = findViewById(R.id.infoMakanan);

        getIncomingExtra();
    }

    private void getIncomingExtra() {

        if(getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("info_makanan")){
            String fotoMakanan = getIntent().getStringExtra("foto_makanan");
            String namaMakanan = getIntent().getStringExtra("nama_makanan");
            String infoMakanan = getIntent().getStringExtra("info_makanan");

            setDataActivity(fotoMakanan, namaMakanan, infoMakanan);
        }
    }

    private void setDataActivity(String fotoMakanan, String namaMakanan, String infoMakanan) {
        Glide.with(this).asBitmap().load(fotoMakanan).into(ImageViewFotoMakanan);
        TextViewNamaMakanan.setText(namaMakanan);
        TextViewInfoMakanan.setText(infoMakanan);
    }
}
