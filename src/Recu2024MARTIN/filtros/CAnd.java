package Recu2024MARTIN.filtros;

import Recu2024MARTIN.ElementoBiblioteca;
import Recu2024MARTIN.Libro;

public class CAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;

    @Override
    public boolean cumple(ElementoBiblioteca l) {
        if (c1.cumple(l) && c2.cumple(l)){
            return true;
        }
        return false;
    }
}
