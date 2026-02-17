package Recu2024MARTIN.comparadores;

import Recu2024MARTIN.Libro;

import java.util.Comparator;

public class ComparadorPunt implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return (l1.getPuntaje() - l2.getPuntaje());
    }


}
