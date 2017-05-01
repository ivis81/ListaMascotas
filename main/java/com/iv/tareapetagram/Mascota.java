package com.iv.tareapetagram;

/**
 * Created by Ivis on 26/04/2017.
 */

public class Mascota {

    private String nombre;
    private char sexo;
    private int like, foto;

    public Mascota(int foto, String nombre, int like, char sexo) {
        this.foto = foto;
        this.nombre = nombre;
        this.sexo = sexo;
        this.like = like;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
