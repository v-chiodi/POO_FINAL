package Recu2024MARTIN;

import Recu2024MARTIN.filtros.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public class Libro extends ElementoBiblioteca{
    private String titulo;
    private int puntaje;
    private int tiempoEstimado;
    private ArrayList<String> generos;


    public String getTitulo(){
        return titulo;
    }

    @Override
    public int getPuntaje() {
        return puntaje;
    }
    @Override
    public int getTiempo() {
        return tiempoEstimado;
    }

    @Override
    public ArrayList<String> getGeneros() {
       ArrayList<String> aux = new ArrayList<>();
       aux.addAll(generos);
       return aux;
    }
@Override
public ArrayList<Libro> buscar(Condicion c, Comparator<Libro> comp) {
    ArrayList<Libro> devolver = new ArrayList<>();
    if (c.cumple(this)) {
        devolver.add(this);
    }
    return devolver;
}


}




