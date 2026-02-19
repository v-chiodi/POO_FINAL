package Parcial2024;

import Parcial2024.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoFig {
    private String nombre;


    public ElementoFig(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public abstract int getPrecio();
    public abstract int getCant();
    public abstract Figurita getMayor();
    public abstract ElementoFig getCopia(Condicion c);

}
