package com.jackshaw.moviecatalogue;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] dataJudul, dataDeskripsi, dataSutradara, dataTahun, dataProduksi, dataPemain1, dataPemain2, dataPemain3, dataSinopsis;
    private TypedArray dataPoster, dataPemeran1, dataPemeran2, dataPemeran3;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieAdapter = new MovieAdapter(this);
        final ListView listView = findViewById(R.id.lv_list_movie);
        listView.setAdapter(movieAdapter);
        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent kirim = new Intent(MainActivity.this, DetailMovie.class);
                kirim.putExtra(DetailMovie.EXTRA_MOVIE, movies.get(position));
                startActivity(kirim);
            }
        });
    }

    private void prepare(){
        dataPoster = getResources().obtainTypedArray(R.array.data_poster);
        dataPemeran1 = getResources().obtainTypedArray(R.array.data_pemeran1);
        dataPemeran2 = getResources().obtainTypedArray(R.array.data_pemeran2);
        dataPemeran3 = getResources().obtainTypedArray(R.array.data_pemeran3);
        dataJudul = getResources().getStringArray(R.array.data_movie);
        dataDeskripsi = getResources().getStringArray(R.array.data_deskripsi);
        dataSutradara = getResources().getStringArray(R.array.dataSutradara);
        dataProduksi = getResources().getStringArray(R.array.dataProduksi);
        dataTahun = getResources().getStringArray(R.array.dataTahun);
        dataPemain1 = getResources().getStringArray(R.array.dataPemain1);
        dataPemain2 = getResources().getStringArray(R.array.dataPemain2);
        dataPemain3 = getResources().getStringArray(R.array.dataPemain3);
        dataSinopsis = getResources().getStringArray(R.array.dataKonten);

    }

    private void addItem(){
        movies = new ArrayList<>();
        for (int i=0; i < dataJudul.length; i++){
            Movie inimovie = new Movie();
            inimovie.setName(dataJudul[i]);
            inimovie.setPoster(dataPoster.getResourceId(i, -1));
            inimovie.setDeskripsi(dataDeskripsi[i]);
            inimovie.setPemeran1(dataPemeran1.getResourceId(i, -1));
            inimovie.setPemeran2(dataPemeran2.getResourceId(i, -1));
            inimovie.setPemeran3(dataPemeran3.getResourceId(i, -1));
            inimovie.setSutradara(dataSutradara[i]);
            inimovie.setProduksi(dataProduksi[i]);
            inimovie.setTahun(dataTahun[i]);
            inimovie.setPemain1(dataPemain1[i]);
            inimovie.setPemain2(dataPemain2[i]);
            inimovie.setPemain3(dataPemain3[i]);
            inimovie.setKonten(dataSinopsis[i]);
            movies.add(inimovie);
        }
        movieAdapter.setMovies(movies);
    }

}
