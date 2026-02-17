package Recu2024MARTIN.comparadores;

import Recu2024MARTIN.Libro;

import java.util.Comparator;

public class ComparadorTit implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) {
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
