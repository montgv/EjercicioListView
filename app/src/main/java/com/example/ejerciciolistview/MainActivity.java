package com.example.ejerciciolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejerciciolistview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<Personas> miLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        miLista = new ArrayList<>();
        miLista.add(new Personas("Miguel", "López Sánchez", "Hombre", "ASIR"));
        miLista.add(new Personas("Juan", "Pérez Pérez", "Hombre", "DAW"));
        miLista.add(new Personas("Maria", "Martínez Fernández", "Mujer", "DAM"));
        miLista.add(new Personas("Antonio", "González García", "Hombre", "DAM"));
        miLista.add(new Personas("Ana", "Díaz Torres", "Mujer", "ASIR"));

        MiAdaptador miAdaptador = new MiAdaptador(this, R.layout.opciones_item, miLista);
    }
}