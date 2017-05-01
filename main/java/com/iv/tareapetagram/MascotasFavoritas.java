package com.iv.tareapetagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ivis on 28/04/2017.
 */

public class MascotasFavoritas extends AppCompatActivity {
    ArrayList <Mascota> mascotas;
    private RecyclerView listaContactos;

     @Override
     public void onCreate (Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setContentView(R.layout.mascotas_favoritas);

         Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarFavoritos);
         setSupportActionBar(miActionBar);
         getSupportActionBar().setDisplayShowTitleEnabled(true);
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setHomeButtonEnabled(true);


         listaContactos = (RecyclerView) findViewById(R.id.rvMascotas);

         LinearLayoutManager llm = new LinearLayoutManager(this);
         llm.setOrientation(LinearLayoutManager.VERTICAL);

         listaContactos.setLayoutManager(llm);
         mascotasFavoritas();
         inicializaAdaptador();

     }

    public void inicializaAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaContactos.setAdapter(adaptador);
    }

    public void mascotasFavoritas(){
        mascotas = new ArrayList<Mascota>();
        //Toast.makeText(getBaseContext(),"Mascotas favoritas",Toast.LENGTH_LONG).show();

        mascotas.add(new Mascota(R.drawable.corgi,"Corgi",2,'m'));
        mascotas.add(new Mascota(R.drawable.dog_48,"Tomy",5,'m'));
        mascotas.add(new Mascota(R.drawable.dog_50,"Catty",5,'f'));
        mascotas.add(new Mascota(R.drawable.german_shepherd,"Sam",6,'f'));
        mascotas.add(new Mascota(R.drawable.hachiko,"Hatchy",7,'m'));

    }

}
