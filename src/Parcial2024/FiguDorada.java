package Parcial2024;

import Parcial2024.condiciones.Condicion;

import java.util.ArrayList;

public class FiguDorada extends Figurita {
    private Condicion c;
    private int nroUnidades;
    private int otroValor;

    public FiguDorada(String nombre, String marca, String album, int numFig, int precio, Condicion c, int nroUnidades, int otroValor) {
        super(nombre, marca, album, numFig, precio);
        this.c = c;
        this.nroUnidades = nroUnidades;
        this.otroValor = otroValor;
    }

    @Override
    public int getPrecio() {
        if(c.cumple(this)) {
            return super.getPrecio();
        }
        return otroValor;

    }

    @Override
    public ElementoFig getCopia(Condicion c){
        if (c.cumple(this)){
            return new FiguDorada(getNombre(),getMarca(),getAlbum(),getNumFig(),getPrecio(),c,nroUnidades,otroValor);
        }
        return null;

    }
}
