package Recu2024MARTIN;

import Recu2024MARTIN.filtros.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoBiblioteca {

    public abstract ArrayList <String> getGeneros();
    public abstract int getPuntaje();
    public abstract int getTiempo();

    public abstract ArrayList<Libro> buscar(Condicion c, Comparator<Libro> comp);


}
