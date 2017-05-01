package com.iv.tareapetagram;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ivis on 26/04/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    //Inflar el layout y lo pasara al viewholder para que obtenga los views.
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);

        return new MascotaViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, final int position) {
        //mascotaViewHolder.miCardView.setTag(position);
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgMascota.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombre().toString());
        mascotaViewHolder.tvLike.setText("" + mascota.getLike());

        if(mascota.getSexo()=='f')
            mascotaViewHolder.imgMascota.setBackgroundResource(R.color.colorAccent);
        else
            mascotaViewHolder.imgMascota.setBackgroundResource(R.color.colorPrimary);

        mascotaViewHolder.imgHuesoBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mascota.setLike(mascota.getLike()+1);
                mascotaViewHolder.tvLike.setText("" + mascota.getLike());
            }
        });
    }

    @Override
    public int getItemCount() {//Cantidad de elementos que contiene la lista
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgMascota;
        private TextView tvNombreMascota, tvLike;
        public View miView;
        private CardView miCardView;
        private ImageView imgHuesoBlanco;
        public MascotaViewHolder(View itemView) {
            super(itemView);
            miView = itemView;
            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvLike = (TextView) itemView.findViewById(R.id.tvLike);
            miCardView = (CardView) itemView.findViewById(R.id.cvMascota);
            imgHuesoBlanco = (ImageView) itemView.findViewById(R.id.imgHuesoBlanco);

        }

    }

}
