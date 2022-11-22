package com.arstudio.sigiat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menemukan id Tombol
        Button btntujuan = findViewById(R.id.tujuan);
        Button btnpemantik = findViewById(R.id.pemantik);
        Button btnpeta = findViewById(R.id.petakonsep);
        Button btnapersepsi = findViewById(R.id.apersepsi);
        Button btnkatakunci = findViewById(R.id.katakunci);
        Button btnmateri = findViewById(R.id.btnView);
        Button btntentang = findViewById(R.id.tentang);


        //fungsi untuk btntujuan
        btntujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent untuk berpindah
                Intent intent_tujuan = new Intent(MainActivity.this, TujuanPembelajaran.class);
                //mulai aktiviti
                startActivity(intent_tujuan);
            }
        });

        //fungsi untuk btnpemantik
        btnpemantik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent untuk berpindah
                Intent intent_pemantik = new Intent(MainActivity.this, pemantik.class);
                //mulai aktiviti
                startActivity(intent_pemantik);
            }
        });

        //fungsi untuk btnpeta
        btnpeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent untuk berpindah
                Intent intent_peta = new Intent(MainActivity.this, PetaKonsep.class);
                //mulai aktiviti
                startActivity(intent_peta);
            }
        });

        //fungsi untuk btnpersepsi
        btnapersepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent untuk berpindah
                Intent intent_apersepsi = new Intent(MainActivity.this, apersepsi.class);
                //mulai aktiviti
                startActivity(intent_apersepsi);
            }
        });

        //fungsi untuk btnkatakunci
        btnkatakunci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent untuk berpindah
                Intent intent_katakunci = new Intent(MainActivity.this, katakunci.class);
                //mulai aktiviti
                startActivity(intent_katakunci);
            }
        });

        //fungsi untuk btnmateri
        btnmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent untuk berpindah
                Intent intent_materi = new Intent(MainActivity.this, materipdf.class);
                //mulai aktiviti
                startActivity(intent_materi);
            }
        });

        //fungsi untuk btntentang
        btntentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent untuk berpindah
                Intent intent_tentang = new Intent(MainActivity.this, tentang.class);
                //mulai aktiviti
                startActivity(intent_tentang);
            }
        });


    }
}