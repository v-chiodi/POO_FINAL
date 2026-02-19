package Parcial2024;


import Parcial2024.condiciones.Condicion;

import java.util.ArrayList;

public class Figurita extends ElementoFig{
    private String marca;
    private String album;
    private int numFig;
    private int precio;

    public Figurita(String nombre,String marca, String album, int numFig, int precio) {
        super(nombre);
        this.marca = marca;
        this.album = album;
        this.numFig = numFig;
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getNumFig() {
        return numFig;
    }

    public void setNumFig(int numFig) {
        this.numFig = numFig;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCant(){
        return 1;
    }
    public Figurita getMayor(){
        return new Figurita(this.getNombre(),marca,album,numFig,precio);
    }


    @Override
    public ElementoFig getCopia(Condicion c){
        if(c.cumple(this)){
            return new Figurita(this.getNombre(),marca,album,numFig,precio); //usamos this pq el atributo lo tiene el padre
        }
        return null;
    }
}
