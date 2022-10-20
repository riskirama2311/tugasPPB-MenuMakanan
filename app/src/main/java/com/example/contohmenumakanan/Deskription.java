package com.example.contohmenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Deskription extends AppCompatActivity {

    ImageView FotoMakanan;
    TextView txtNamaMakanan, txtDeskripsiMakanan, txtAlamatMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskription);

        FotoMakanan = findViewById(R.id.FotoMakanan);
        txtNamaMakanan = findViewById(R.id.txtNamaMakanan);
        txtDeskripsiMakanan = findViewById(R.id.txtDeskripsiMakanan);
        txtAlamatMakanan = findViewById(R.id.txtAlamatMakanan);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if (getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("deskripsi_makanan") && getIntent().hasExtra("alamat_makanan")){

            int imgFoto = getIntent().getIntExtra("foto_makanan", 1);
            String txtNama = getIntent().getStringExtra("nama_makanan");
            String txtDeskripsi = getIntent().getStringExtra("deskripsi_makanan");
            String txtAlamat = getIntent().getStringExtra("alamat_makanan");

            setDataActivity(imgFoto, txtNama, txtDeskripsi, txtAlamat);
        }
    }

    private void setDataActivity(int imgFoto, String txtNama, String txtDeskripsi, String txtAlamat){

        FotoMakanan.setImageResource(imgFoto);

        txtNamaMakanan.setText(txtNama);
        txtDeskripsiMakanan.setText(txtDeskripsi);
        txtAlamatMakanan.setText(txtAlamat);
    }
}