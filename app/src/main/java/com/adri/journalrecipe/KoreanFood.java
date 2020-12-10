package com.adri.journalrecipe;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KoreanFood extends AppCompatActivity {

    private ArrayList<String> MenuImage = new ArrayList<>();
    private ArrayList<String> MenuText = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean_food);

        getMenuData();
    }

    private void GetKoreanFoodView(){
        RecyclerView recyclerView = findViewById(R.id.FoodList);
        KoreanFoodView adapter = new KoreanFoodView(MenuImage, MenuText,infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getMenuData(){
        MenuText.add("Tteokbokki");
        MenuImage.add("https://cdn.popbela.com/content-images/post/20200615/335c073c723cdbdeb1b338091c87a5bf.jpg");
        infoMakanan.add("Bahan Tteok:\n" +
                "- 6 sendok makan tepung beras\n" +
                "- 2 sendok makan tepung kanji atau tapioka\n" +
                "- 1 sendok makan minyak wijen\n" +
                "- 1 sendok teh penyedap rasa\n" +
                "- 120 ml air panas\n\n" +
                "Bahan Gochujang (saus asam pedas): \n" +
                "- 4 bawang putih, cincang\n" +
                "- 2 bawang merah atau bawang bombai, cincang\n" +
                "- 6 rawit merah, dihaluskan (sesuaikan dengan tingkat pedas yang diinginkan)\n" +
                "- 2 sendok makan margarin atau minyak goreng\n" +
                "- 4 sendok makan saus sambal\n" +
                "- 2 sendok makan saus tomat\n" +
                "- 2 sendok makan mayones\n" +
                "- 1 sendok makan saus tiram\n" +
                "- 1 sendok makan kecap asin\n" +
                "- 70 ml air \n\n" +
                "Topping: \n" +
                "- Irisan daun bawang\n" +
                "- Wijen sangrai\n" +
                "- Sosis \n" +
                "- Odeng\n" +
                "- Telur\n\n" +
                "Cara membuat: \n" +
                "Siapkan baskom, lalu campur semua bahan tteok, kecuali air panas. Aduk jadi satu, kemudian masukkan air panas secara perlahan. Hentikan saat adonan mulai kalis dan dapat dibentuk.\n" +
                "Masak air dan tunggu sampai mendidih. Seraya menunggu, bentuk adonan secara panjang lalu potong. Rebus sampai mengapung, lalu angkat. Tiriskan kemudian sisihkan.  \n" +
                "Selanjutnya, campurkan bahan saos pada mangkuk lalu sisihkan kembali.\n" +
                "Tumis semua bawang dan cabai hingga harum dan berwarna kecoklatan. Tambahkan sosis, odeng, dan telur. Masak dengan api yang kecil.\n" +
                "Lalu, masukkan saus gochujang yang sudah dibuat tadi dan tteok. Aduk secara merata hingga mengental. Cicipi sedikit buat mengoreksi rasa. \n" +
                "Tteokbokki pun siap disajikan. Beri topping wijen sangrai, irisan daun bawang, atau taburan keju mozarella di atas biar makin menguggah selera. Tteokbooki siap dihidangkan");
        MenuText.add("Kimchi Bokkeumbap");
        MenuImage.add("https://cdn.popbela.com/content-images/post/20200615/5037bd7fd79b18191d2c779b6633df9a.jpg");
        infoMakanan.add("Bahan utama:\n" +
                "- 1 cup kimchi yang dipotong kecil\n" +
                "- 3 cup nasi putih\n" +
                "- 3 sendok makan minyak goreng\n" +
                "- 3 sendok teh minyak wijen\n" +
                "- 1 sendok makan saus gochujang (sambal Korea)\n" +
                "- 1 sendok teh garam\n\n" +
                "Topping:\n" +
                "- Nori\n" +
                "- Wijen sangrai\n" +
                "Daun bawang\n" +
                "Telur\n" +
                "Bakso\n\n" +
                "Cara membuat:\n" +
                "Potong daun bawang, bakso, dan kimchi (sesuaikan ukuran dengan selera).\n" +
                "Panaskan margarin atau minyak goreng di wajan. Lalu, tumis daun bawang, sosis, dan bakso dengan api sedang.\n" +
                "Masak sekitar 1-2 menit, kemudian tambahkan kimchi yang sudah dipotong. Tumis semua bahan dengan waktu 2 menit saja agar kimchi tidak terlalu layu.\n" +
                "Siapkan nasi putih, masukkan lalu aduk sampai rata.\n" +
                "Setelah nasi terlihat agak kering, tambahkan minyak wijen untuk menambah cita rasa dari kimchi bokkeumbap ini.\n" +
                "Terakhir, angkat dan sajikan bersama taburan nori, wijen, telur mata sapi di atasnya. Dijamin, bakal ketagihan!");
        MenuText.add("Kimchi");
        MenuImage.add("https://cdn.popbela.com/content-images/post/20200615/67750a32ea20430c45d87f6c85f19afc.jpg");
        infoMakanan.add("Bahan utama:\n" +
                "1-2 kg sawi putih\n" +
                "1 buah wortel (potong menyerupai korek api)\n" +
                "10 sendok makan garam\n" +
                "2 sendok makan tepung beras\n" +
                "100 ml air\n\n" +
                "Bumbu:\n" +
                "5 siung bawang putih\n" +
                "1 buah bawang bombai\n" +
                "1 ruas jahe\n\n" +
                "Saus kimchi:\n" +
                "2 sendok makan gula\n" +
                "5 sendok makan kecap ikan\n" +
                "2 sendok makan bubuk cabe (sesuaikan dengan tingkat pedas yang diinginkan)\n" +
                "2 sendok makan kecap asin\n\n" +
                "Cara membuat:\n" +
                "Belah sawi menjadi 4 bagian, potong sekitar 6-7 cm (usahakan untuk tidak terlalu kecil memotongnya biar sawi tidak mudah hancur)\n" +
                "Aduk rata sawi dengan garam. Pastikan semua bagian sawi terkena garam. Diamkan sekitar 6 jam, sesekali boleh diaduk agar garam cepat meresap dan tekstur dari sawi nggak lagi kaku.\n" +
                "Nyalakan api dalam kondisi sedang, masukkan 100 ml ke dalam panci. Lalu, tambahkan tepung beras, aduk terus sampai tidak ada yang menggumpal. Setelah adonan tampak kental, matikan. Lalu, dinginkan.\n" +
                "Selanjutnya, haluskan bumbu. Kemudian, campurkan semua bahan saus kimchi jadi satu.\n" +
                "Tengok kimchi yang sudah didiamkan selama 6 jam. Cuci bersih sawi sampai semua garam hilang. Namun, saat bilasan terakhir, gunakan air matang yang mengalir. Lalu, tiriskan.\n" +
                "Campurkan bahan adonan, bumbu, saus, beserta wortel yang sudah dipotong ke dalam sebuah wadah. Kemudian, masukkan sawi yang telah ditirsikan. Aduk hingga rata, kimchi buatanmu pun siap dinikmati bersama keluarga atau teman.\n" +
                "Jika kamu ingin kimchi lebih terasa fermentasinya.");
        MenuText.add("Yukgaejang");
        MenuImage.add("https://cdn.popbela.com/content-images/post/20200615/051249c1b8362755feb92b84ea7ee585.jpg");
        infoMakanan.add("Bahan utama:\n" +
                "200 gram daging sapi, potong sesuai selera\n" +
                "2 genggam tauge\n" +
                "3 batang daun bawang, potong panjang\n" +
                "50 gram kembang kol\n" +
                "200 gram lobak\n" +
                "2 butir telur\n" +
                "3 buah jamur (shitake atau tiram)\n" +
                "2-3 batang daun bawang\n\n" +
                "Bumbu:\n" +
                "2 sendok makan cabai bubuk\n" +
                "2 sendok teh kecap asin\n" +
                "1 sdm minyak goreng\n" +
                "1 sendok makan gochujang (sambal Korea)\n" +
                "1 buah bawang bombai, potong besar-besar\n" +
                "1 buah bawang putih, cincang\n" +
                "1/2 sendok makan lada putih bubuk\n" +
                "1/2 sendok makan garam\n" +
                "14 gelas air\n\n" +
                "Cara membuat:\n" +
                "Siapkan panci besar untuk merebus daging biar mudah dipotong sesuai selera. Didihkan daging, bawang, lobak, dan bawang putih dalam 14 gelas air yang sudah disiapkan sebelumnya. Masak dalam api sedang. Tunggu daging sampai empuk sekitar 1-1.5 jam. Angkat daging, dinginkan. Buang sayuran dan lemak yang terlihat, sisakan air kaldu yang di dalam panci.\n" +
                "Potong daging memanjang sesuai selesa. Lalu, tumis bawang putih dan bawang bombai hingga harum. Kemudian, masukkan kembang kol dan tauge yang sudah dicuci bersih. Tumis sampai layu. Lalu, bumbui dengan kecap asin.\n" +
                "Selanjutnya, didihkan air. Lalu, tambahkan potongan daging, jamur, lobak, saus gochujang, beserta air kaldu yang disisihkan sebelumnya. Rebus dengan api sedang dan masak selama 20 menit.\n" +
                "Terakhir, tambahkan telur yang sudah dikocok ringan, garam, dan lada secukupnya di atas sup yukgaejang yang mendidih. Matikan api.\n" +
                "Sajikan yukgaejang bersama nasi panas biar makin mantap saat disantap.");

        MenuText.add("Bibimbap");
        MenuImage.add("https://cdn.popbela.com/content-images/post/20200619/e34c28b1b147e9c87d590c0e31e45353.jpg");
        infoMakanan.add("Bahan utama:\n" +
                "Nasi matang (sesuai selera)\n" +
                "1 genggam tauge \n" +
                "1 genggam bayam\n" +
                "1 buah mentimun\n" +
                "2 buah wortel\n" +
                "6 buah jamur shitake\n" +
                "1/2 buah paprika\n" +
                "200 gram daging giling\n" +
                "2 butir telur \n\n" +
                "Bumbu: \n" +
                "2 sendok makan saus gochujang\n" +
                "1/2 sendok makan kecap asin \n" +
                "6 siung bawang putih (cincang halus)\n" +
                "1/2 sendok makan minyak wijen \n" +
                "1/2 sendok makan minyak goreng\n" +
                "1/4 sendok makan wijen sangrai\n" +
                "1 sendok makan garam\n" +
                "1 sendok makan gula pasir\n" +
                "1 sendok teh merica \n\n" +
                "Cara membuat:\n" +
                "Rebus bahan-bahan sayuran seperti wortel, tauge, dan bayam. Usahakan untuk tidak terlalu merebus biar nutrisi sayuran tak terbuang dan nggak tampak layu saat ditata.\n" +
                "Campur bahan sayuran dengan kecap asin, minyak wijen, bawang putih yang sudah dihaluskan, dan garam secukupnya.   \n" +
                "Potong mentimun, jamur shitake, dan paprika menjadi seperti korek api, lalu tumis pakai minyak goreng dengan api kecil. Kemudian, campur bahan tersebut dengan kecap asin dan gula pasir. Tunggu sampai matang, sisihkan. \n" +
                "Selanjutnya, tumis daging sampai setengah matang. Tambahkan gula pasir dan bawang putih yang sudah dihaluskan, dan merica secukupnya. Aduk sampai rata.\n" +
                "Masak telur, bisa digoreng atau rebus. Sesuai selera.\n" +
                "Ambil mangkuk, taruh nasih hangat. Susun aneka bahan yang sudah diolah, kemudian tata rapi dari tauge sampai telur di atasnya sehingga variasi warna bibimbab terlihat menarik. ");
        GetKoreanFoodView();
    }

}
