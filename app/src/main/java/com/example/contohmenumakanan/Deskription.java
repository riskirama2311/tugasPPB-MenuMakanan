package com.example.contohmenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Deskription extends AppCompatActivity {

    ImageView imgFotoMakanan;
    TextView txtNamaMakanan, txtDeskripsiMakanan, txtAlamatMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskription);

        imgFotoMakanan = findViewById(R.id.imgFotoMakanan);
        txtNamaMakanan = findViewById(R.id.txtNamaMakanan);
        txtDeskripsiMakanan = findViewById(R.id.txtDeskripsiMakanan);
        txtAlamatMakanan = findViewById(R.id.txtAlamatMakanan);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if (getIntent().hasExtra("foto") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("deskripsi") && getIntent().hasExtra("alamat_makanan")){

            int imgFoto = getIntent().getIntExtra("foto", 1);
            String txtNama = getIntent().getStringExtra("nama_makanan");
            String txtDeskripsi = getIntent().getStringExtra("deskripsi");
            String txtAlamat = getIntent().getStringExtra("alamat_makanan");

            setDataActivity(imgFoto, txtNama, txtDeskripsi, txtAlamat);
        }
    }

    private void setDataActivity(int imgFoto, String txtNama, String txtDeskripsi, String txtAlamat){

        imgFotoMakanan.setImageResource(imgFoto);

        txtNamaMakanan.setText(txtNama);
        txtDeskripsiMakanan.setText(txtDeskripsi);
        txtAlamatMakanan.setText(txtAlamat);
    }
}