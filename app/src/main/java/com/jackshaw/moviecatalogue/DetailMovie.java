package com.jackshaw.moviecatalogue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovie extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie" ;
    private TextView tvJudul, tvdeskripsi, tvSutradara, tvProduksi, tvTahun, tvPemain1, tvPemain2, tvPemain3, tvKonten;
    private ImageView imgMain, imgPemeran1, imgPemeran2, imgPemeran3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_movie);



        Movie filmSelected = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (filmSelected != null){
            tvJudul = findViewById(R.id.tv_judul);
            tvdeskripsi = findViewById(R.id.tv_content);
            imgMain = findViewById(R.id.img_main);;
            tvSutradara = findViewById(R.id.tv_sutradara);
            tvTahun = findViewById(R.id.tv_tahun);
            tvProduksi = findViewById(R.id.tv_produksi);
            tvPemain1 = findViewById(R.id.tv_pemain1);
            tvPemain2 = findViewById(R.id.tv_pemain2);
            tvPemain3 = findViewById(R.id.tv_pemain3);
            tvKonten = findViewById(R.id.tv_content);
            imgPemeran1 = findViewById(R.id.img_pemeran1);
            imgPemeran2 = findViewById(R.id.img_pemeran2);
            imgPemeran3 = findViewById(R.id.img_pemeran3);

            tvJudul.setText(filmSelected.getName());
            tvdeskripsi.setText(filmSelected.getDeskripsi());
            imgMain.setImageResource(filmSelected.getPoster());
            tvSutradara.setText(filmSelected.getSutradara());
            tvTahun.setText(filmSelected.getTahun());
            tvProduksi.setText(filmSelected.getProduksi());
            imgPemeran1.setImageResource(filmSelected.getPemeran1());
            imgPemeran2.setImageResource(filmSelected.getPemeran2());
            imgPemeran3.setImageResource(filmSelected.getPemeran3());
            tvPemain1.setText(filmSelected.getPemain1());
            tvPemain2.setText(filmSelected.getPemain2());
            tvPemain3.setText(filmSelected.getPemain3());
            tvKonten.setText(filmSelected.getKonten());
        }
    }

}
