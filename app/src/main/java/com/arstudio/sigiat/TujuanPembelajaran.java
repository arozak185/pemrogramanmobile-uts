package com.arstudio.sigiat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class TujuanPembelajaran extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan);

        ActionBar menu = getSupportActionBar();
        menu.setDefaultDisplayHomeAsUpEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tujuan Pembelajaran");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}