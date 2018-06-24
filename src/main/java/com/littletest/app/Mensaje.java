package com.littletest.app;

import java.io.Serializable;

/**
 * Created by Ricard on 23/06/2018.
 */
public class Mensaje implements Serializable {
    private String nombre;
    private String cuerpo;

    public Mensaje(String nombre, String cuerpo){
        this.nombre = nombre;
        this.cuerpo = cuerpo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
