
package com.example.contohmenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Rendang",
                                    "15.000",
                                    "Rendang adalah masakan khas Minangkabau Sumatera Barat yang berbahan dasar daging. Bukan hanya daging sapi, bumbu rendang juga bisa diolah untuk bahan dasar lain, seperti kerbau, kambing, dan ayam.",
                                    R.drawable.rendang));

        listKuliner.add(new Kuliner("Kalio",
                "18.000",
                "Kalio adalah sebutan dari rendang setengah jadi, yang masih berwarna kecoklatan dibanding rendang yang berwarna cokelat kehitaman. Kalio bertekstur lengket dan basah dengan aroma karamel yang kuat, sementara rendang lebih kering, bertekstur kasar, dan mengeluarkan aroma rempah yang tajam.",
                R.drawable.kalio));

        listKuliner.add(new Kuliner("Dendeng Batokok",
                "20.000",
                "Dendeng batokok adalah masakan khas Sumatra Barat dibuat dari irisan tipis dan lebar. Setelah daging sapi diiris tipis melebar, lalu dipukul-pukul dengan batu cobek supaya daging nya menjadi lembut. Kemudian makanan ini diberi cabai hijau yang diiris kasar.",
                R.drawable.dendengbatok));

        listKuliner.add(new Kuliner("Gulai Tunjang",
                "18.000",
                "Gulai Tunjang atau banyak juga di perantauan yang bilang gulai kikil adalah salah satu menu masakan khas dari Sumatera Barat yang diolah dari kulit kaki sapi. Masakan yang satu ini sangat digemari karena rasanya yang sangat lezat dan perpaduan kuah santan gulai dan kikil yang lembut dan gurih bikin selalu ingin nambah makan nya.. ",
                R.drawable.gulaitunjang));
    }
}