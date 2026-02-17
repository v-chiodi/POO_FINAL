package Recu2024MARTIN.comparadores;

import Recu2024MARTIN.Libro;

import java.util.Comparator;

public class ComparadorComp implements Comparator<Libro> {
    private Comparator<Libro> principal;
    private Comparator<Libro> secundario;


    @Override
    public int compare(Libro l1, Libro l2) {
        int resPrinc = principal.compare(l1,l2);

        if (resPrinc == 0){
            return secundario.compare(l1,l2);
        }
        return resPrinc;
    }
}
