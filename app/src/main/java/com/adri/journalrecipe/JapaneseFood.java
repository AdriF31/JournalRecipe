package com.adri.journalrecipe;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JapaneseFood extends AppCompatActivity {

    private ArrayList<String> MenuImage = new ArrayList<>();
    private ArrayList<String> MenuText = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese_food);

        getMenuData();
    }

    private void GetJapaneseFoodView(){
        RecyclerView recyclerView = findViewById(R.id.FoodList);
        JapaneseFoodView adapter = new JapaneseFoodView(MenuImage, MenuText, infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getMenuData(){
        MenuText.add("Beef Teriyaki");
        MenuImage.add("https://cdn-brilio-net.akamaized.net/news/2020/06/22/186901/1253330-1000xauto-masakan-internasional-jepang.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 350 gram daging sapi (iris tipis)\n\nBumbu halus:\n" +
                "- 1 bawang bombay iris\n" +
                "- 3 bawang putih halus\n" +
                "- 1 sdt merica bubuk\n" +
                "- 1 sdm kecap manis\n" +
                "- 1 1/2 sdm saus teriyaki\n" +
                "- 1 sdm saus tiram\n" +
                "- 1 sdm saus cabai\n" +
                "- kaldu sapi bubuk\n" +
                "- air\n" +
                "- 3 sdm Minyak goreng\n" +
                "- 1 sdt maizena larutkan dengan air\n\nPelengkap:\n" +
                "- buncis\n" +
                "- wortel\n" +
                "- tomat\n\nCara memasak:\n" +
                "1. Tumis bawang putih, masukkan daging.\n" +
                "\n" +
                "2. Tuang air sampai daging terendam.\n" +
                "\n" +
                "3. Masukkan semua saus, aduk rata.\n" +
                "\n" +
                "4. Tambahkan kaldu, rebus hingga air menyusut.\n" +
                "\n" +
                "5. Masukkan bawang bombay, tambahkan larutan maizena, aduk rata.");

        MenuText.add("Chicken Katsu");
        MenuImage.add("https://cdn-brilio-net.akamaized.net/news/2020/06/22/186901/1253334-1000xauto-masakan-internasional-jepang.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 4 potong fillet dada ayam\n" +
                "- 150 g tepung terigu\n" +
                "- 2 butir telur\n" +
                "- 250 g tepung roti\n" +
                "- ½ sdt bawang putih bubuk\n" +
                "- 150 ml susu cair\n" +
                "- garam\n" +
                "- lada\n" +
                "- minyak goreng\n\nBahan saus tonkotsu:\n" +
                "- 100 ml saus tomat\n" +
                "- 3 sdm saus tiram\n" +
                "- 4 sdm saus inggris\n" +
                "- 1 sdm gula pasir\n\nBahan salad:\n" +
                "- kubis ungu, iris tipis\n" +
                "- kubis putih, iris tipis\n" +
                "- wortel, iris tipis\n" +
                "- mayonaise\n" +
                "- 1 buah jeruk nipis\n" +
                "- 1 sdt minyak wijen\n" +
                "- 1 sdt kecap asin\n" +
                "- gula\n\nCara memasak:\n" +
                "1. Campur garam, lada, dan bubuk bawang putih. Aduk rata. Sisihkan.\n" +
                "\n" +
                "2. Lumuri fillet ayam dengan campuran garam tadi.\n" +
                "\n" +
                "3. Kocok tepung terigu, telur, dan tepung roti dalam wadah terpisah.\n" +
                "\n" +
                "4. Lapisi fillet ayam dengan tepung terigu. Kibas-kibaskan sedikit untuk membuang kelebihan tepung.\n" +
                "\n" +
                "5. Celupkan ayam ke kocokan telur dan susu. Gulingkan ke tepung roti. Lapisi bagian luarnya secara merata.\n" +
                "\n" +
                "6. Goreng ayam. Angkat, tiriskan.\n" +
                "\n" +
                "7. Untuk saus tonkotsu: Campur kecap inggris dan gula pasir. Aduk rata. Tambahkan saus tomat dan saus tiram. Aduk rata.\n" +
                "\n" +
                "8. Untuk salad: Campur air perasan jeruk nipis, minyak wijen, dan kecap asin. Aduk rata. Tambahkan gula. Aduk rata. Tambahkan mayonaise. Aduk rata.");
        MenuText.add("Onigiri Tuna Mayo");
        MenuImage.add("https://cdn-brilio-net.akamaized.net/news/2020/06/22/186901/1253331-1000xauto-masakan-internasional-jepang.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 300-400 gra beras\n" +
                "- nori secukupnya\n" +
                "- wijen hitam secukupnya\n" +
                "\n" +
                "Bahan isi:\n" +
                "- 1 cup tuna suwir\n" +
                "- 2-3 sdm mayonaise\n" +
                "- 1/4 bawang bombay, cincang dan tumis sebentar\n" +
                "- 2 sdm kacang polong\n" +
                "- 1 tangkai daun bawang dirajang\n" +
                "- lada dan garam secukupnya\n" +
                "\n" +
                "Cara memasak:\n" +
                "1. Masak beras seperti biasa.\n" +
                "\n" +
                "2. Campur semua bahan isi onigiri jadi satu. Sisihkan.\n" +
                "\n" +
                "3. Ambil secukupnya nasi, beri isian tuna mayo, kepal-kepalkan hingga berbentuk segitiga.\n" +
                "\n" +
                "4. Bungkus onigiri dengan nori, taburi wijen hitam.");
        MenuText.add("Pokcoy Saus Jamur");
        MenuImage.add("https://cdn-brilio-net.akamaized.net/news/2020/06/22/186901/1253332-1000xauto-masakan-internasional-jepang.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 4 ikat pokcoy, bersihkan, potong ujungnya\n" +
                "- 1 kaleng kecil jamur kancing kaleng, iris\n" +
                "- 3 siung bawang putih, cincang\n" +
                "- 2 siung bawang merah, cincang\n" +
                "- 1 sdm saus tiram\n" +
                "- 1 sdm kecap manis\n" +
                "- 1 sdt kecap asin\n" +
                "- garam dan lada secukupnya\n" +
                "- 1 sdt gula pasir\n" +
                "- 1 sdt minyak wijen\n" +
                "- 1 sdt maizena, larutkan dengan sedikit air\n" +
                "- air secukupnya\n" +
                "\n" +
                "Cara memasak:\n" +
                "1. Rebus pokcoy sebentar saja. Angkat dan tiriskan, susun di piring.\n" +
                "\n" +
                "2. Tumis bawang putih dan bawang merah, masukkan jamur. Tumis sebentar.\n" +
                "\n" +
                "3. Tuang air secukupnya, aduk rata. Tuang saus tiram, kecap manis, kecap asin, garam dan gula.\n" +
                "\n" +
                "4. Masukkan lada dan minyak wijen, aduk rata. Masukkan maizena, aduk rata.\n" +
                "\n" +
                "5. Masak sampai mengental, angkat. Siram di atas pokcoy.");

        MenuText.add("Takoyaki");
        MenuImage.add("https://cdn-brilio-net.akamaized.net/news/2020/06/22/186901/1253337-masakan-internasional-jepang.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 100 gram tepung terigu\n" +
                "- 340 ml air/susu cair\n" +
                "- 1 sendok teh kaldu bubuk\n" +
                "- 1 sendok teh kecap ikan\n" +
                "- 1 sendok teh bawang putih halus\n" +
                "- 1 butir telur\n" +
                "- 1 daun bawang\n" +
                "- 2 buah gurita, iris kecil-kecil\n" +
                "\n" +
                "Cara memasak:\n" +
                "1. Blender semua bahan, kecuali gurita.\n" +
                "\n" +
                "2. Tuangkan adonan ke cetakan kue cubit yang sudah dipanaskan. Masukkan irisan.\n" +
                "\n" +
                "3. Balik adonan agar berbentuk bulat. Masak hingga kecokelatan.");
        GetJapaneseFoodView();
    }

}
