package Recu2024MARTIN.filtros;

import Recu2024MARTIN.ElementoBiblioteca;
import Recu2024MARTIN.Libro;

import java.util.ArrayList;

public class Cgenero extends Condicion {
    private String generoComp;

    @Override
    public boolean cumple(ElementoBiblioteca l) {
        ArrayList<String> aux = new ArrayList<>();
        aux = l.getGeneros();
        if (l.getGeneros().contains(generoComp)) {
            return true;
        }
        return false;
    }


}
