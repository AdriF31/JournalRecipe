package com.adri.journalrecipe;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IndonesianFood extends AppCompatActivity {

    private ArrayList<String> MenuImage = new ArrayList<>();
    private ArrayList<String> MenuText = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indonesian_food);

        getMenuData();
    }

    private void GetIndonesianFoodView(){
        RecyclerView recyclerView = findViewById(R.id.FoodList);
        IndonesianFoodView adapter = new IndonesianFoodView(MenuImage, MenuText, infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getMenuData(){
        MenuText.add("Ayam Kecap");
        MenuImage.add("https://thegorbalsla.com/wp-content/uploads/2019/04/Resep-Masakan-Ayam-Kecap-700x525.jpg");
        infoMakanan.add("Bahan-bahan :\n1. 300 gram ayam\n2. 1 batang serai\n3. 3 lembar daun jeruk\n4. Lada secukupnya\n5. ½ sdt ketumbar\n6. ½ sdt gula\n7. Garam secukupnya\n8. Kaldu ayam bubuk secukupnya\n9. Kecap manis secukupnya\n\nBumbu dihaluskan :\n1. 6 siung bawang merah\n2. 4 siung bawang putih\n3. 1 ruas jahe\n4. ½ ruas kunyit\n5. 2 buah kemiri\n6. 6 buah cabai merah\n\nCara memasak ayam kecap :\nTumis semua bumbu halus, serai dan daun jeruk. Kemudian masukkan lada bubuk dan ketumbar bubuk. Masukkan potongan ayam yang telah dicuci bersih, aduk-aduk sampai rata kemudian tambahkan air secukupnya. Setelah air menyusut, tambahkan garam, gula, kecap dan penyedap rasa secukupnya. Masak ayam sampai matang dan koreksi rasa. Angkat dan ayam kecap siap disajikan.");

        MenuText.add("Cumi Asin");
        MenuImage.add("https://thegorbalsla.com/wp-content/uploads/2019/04/Resep-Masakan-Cumi-Asin-700x524.jpg");
        infoMakanan.add("Bahan  :\n1. 100 gram cumi asin\n2. 5 siung bawang putih cincang halus\n3. 6 buah cabai rawit hijau, iris serong tipis \n4. 2 buah cabai hijau besar, iris serong tipis\n5. 1 buah tomat\n6. 1 sachet saos tiram\n7. 3 sendok makan minyak goreng\n8. air secukupnya\n\nCara Memasak Cumi Asin\nBersihkan cumi asin dari kulit arinya, kemudian rendam sebentar dengan menggunakan air panas. Kemudian potong sesuai selera.\n" +
                "Tumis cumi dengan 3 sendok makan minyak goreng, kemudian masukkan bawang putih dan tumis sampai harum.\n" +
                "Tambahkan air secukupnya, kemudian masukkan cabai hijau dan cabai rawit, tomat sampai sedikit layu.\n" +
                "Koreksi rasa dan tunggu sebentar lalu angkat dan masakan siap disajikan.");

        MenuText.add("Opor Ayam");
        MenuImage.add("https://thegorbalsla.com/wp-content/uploads/2019/04/Resep-Masakan-Opor-Ayam-700x527.jpg");
        infoMakanan.add("Bahan  :\n1. 1 ekor ayam buras, potong sesuai selera\n2. 1 lt santan encer\n3. 250 ml santan kental\n4. 1 batang serai, memarkan\n5. 2 lembar daun salam\n6. 3 lembar daun jeruk purut\n7. 3 sendok makan minyak untuk menumis\n\nBumbu Halus :\n1. 2 sdt ketumbar butiran, sangrai\n2. ¼ sdt jinten, sangrai\n3. 1 sdt merica butiran\n4. 4 butir kemiri, sangrai\n5. 1 ruas lengkuas, memarkan\n6. 1 ruas kencur\n7. 8 siung bawang merah\n8. 6 siung bawang putih\n9. 2 sdt garam\n10. 1 sdm gula merah, sisir\n\n Cara Memasak Opor\n Panaskan minyak, tumis bumbu halus, serai, daun salam dan daun jeruk. Tumis hingga harum.\n" +
                "Masukkan potongan ayam, sampai keluar minyaknya dan ayam kaku.\n" +
                "Tambahkan santan encer, masak dengan api sedang sampai ayam benar-benar empuk.\n" +
                "Jika ayam sudah empuk, masukkan santan kental dan sesekali sampai mendidih. Kecilkan api dan masak ayam sampai santan agak berminyak.\n" +
                "Opor ayam siap disajikan   ");

        MenuText.add("Capcay");
        MenuImage.add("https://thegorbalsla.com/wp-content/uploads/2019/04/Resep-Masakan-Capcay-Kuah-700x525.jpg");
        infoMakanan.add("Bahan  :\n1. 1 buah bunga kol\n2. 1 buah brokoli\n3. 1 ikat sawi putih\n4. 1 buah wortel\n5. 5 buah bakso sapi\n6. 100 gram daging ayam\n7. 1 buah bawang bombay, cincang halus\n8. 3 siung bawang putih, cincang halus\n9. ½sdt merica bubuk\n10. 1 sdm saos tiram\n11. 1 sdt gula pasiri\n12. 1 sdm tepung maizena, larutkan dengan sedikit air\n13. Penyedap rasa secukupnya\n14. 200ml air\n15. 2 sdm margarin\n\nCara Memasak Capcay\nCuci semua sayuran sampai bersih, kemudian potong sesuai dengan selera.\n" +
                "Siapkan wajan dengan api sedang.\n" +
                "Masukkan margarin, tumis bawang bombay dan bawang putih hingga harum.\n" +
                "Tambahkan air dan tunggu sampai mendidih.\n" +
                "Masukkan ayam dan sayuran dari yang paling lama masaknya terlebih dahulu.\n" +
                "Kemudian masukkan bakso.\n" +
                "Tambahkan saos tiram,gula, merica bubuk, garam dan penyedap rasa. Aduk sampai rata.\n" +
                "Larutkan tepung maizena dengan 1 sdm air.\n" +
                "Tuang larutan maizena ke dalam sayuran da aduk hingga mengental. Matikan api dan cap chay siap dihidangkan.");
        MenuText.add("Ati Ampela Bumbu Rujak");
        MenuImage.add("https://thegorbalsla.com/wp-content/uploads/2019/04/Resep-Masakan-Ati-Ampela-Bumbu-Rujak-700x526.jpg");
        infoMakanan.add("1. 6 pasang ati ampela\n" +
                "2. 7 buah cabai rawit\n" +
                "3. 5 buah cabai merah\n" +
                "4. 7 siung bawang merah\n" +
                "5. 4 siung bawang putih\n" +
                "6. 4 butir kemiri\n" +
                "7. 1 buah tomat\n" +
                "8. Gula secukupnya\n" +
                "9. Garam secukupnya\n" +
                "10. Penyedap rasa secukupnya\n" +
                "11. 2 sendok makan minyak goreng\n\nCara memasak ati ampela bumbu rujak:\n" +
                "Didihkan air, rebus ati ampela kira-kira 15 menit. Kemudian tiriskan, jika sudah dingin ati ampela dipotong dadu.\n" +
                "Haluskan bumbu seperti kemiri, bawang merah, bawang putih, cabai rawit dan cabai merah.\n" +
                "Panaskan minyak, tumis bumbu halus hingga harum dan masukkan tomat yang telah dipotong tipis-tipis.\n" +
                "Masukkan ati ampela, sambil diaduk sampai rata kemudian tambahkan air sedikit.\n" +
                "Tambahkan garam, gula dan penyedap rasa. Masak hingga matang, angkat dan masakan siap disajikan.");
        GetIndonesianFoodView();
    }

}
