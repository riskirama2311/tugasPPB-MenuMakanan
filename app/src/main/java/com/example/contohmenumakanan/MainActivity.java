
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
        listKuliner.add(new Kuliner("Nasi Goreng",
                                    "12.000",
                                    "Nasi Goreng, Timun dan Tomat, Telor.",
                                    R.drawable.nasgor));

        listKuliner.add(new Kuliner("Nasi Ayam Bali",
                "14.000",
                "Nasi Ayam Bali menjadi best seller di Burjo ini.",
                R.drawable.nasiayambali));

        listKuliner.add(new Kuliner("Nasi Rames",
                "10.000",
                "Nasi, Telor bulat, Sambal, Mie, Kering tempe.",
                R.drawable.nasirames));

        listKuliner.add(new Kuliner("Es Teh",
                "5.000",
                "Es Teh Manis, semanis janjinya padamu. ",
                R.drawable.esteh));
    }
}