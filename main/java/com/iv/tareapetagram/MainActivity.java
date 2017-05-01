package com.iv.tareapetagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaContactos = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();
        Toast.makeText(getBaseContext(),"onCreate" ,Toast.LENGTH_LONG).show();
    }

    public void inicializaAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaContactos.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.corgi,"Corgi",2,'m'));
        mascotas.add(new Mascota(R.drawable.corgi2,"Corgi2",1,'f'));
        mascotas.add(new Mascota(R.drawable.dog_48,"Tomy",5,'m'));
        mascotas.add(new Mascota(R.drawable.dog_50,"Catty",5,'f'));
        mascotas.add(new Mascota(R.drawable.german_shepherd,"Sam",6,'f'));
        mascotas.add(new Mascota(R.drawable.hachiko,"Hatchy",7,'m'));

    }

    public void favoritos(View v){
        Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
        startActivity(intent);
    }

}
