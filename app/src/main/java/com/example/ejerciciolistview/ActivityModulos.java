package com.example.ejerciciolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejerciciolistview.databinding.ActivityModulosBinding;

public class ActivityModulos extends AppCompatActivity {

    private ActivityModulosBinding binding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2 = ActivityModulosBinding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());


    }
}