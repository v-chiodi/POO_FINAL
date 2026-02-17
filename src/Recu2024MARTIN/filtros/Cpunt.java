package Recu2024MARTIN.filtros;

import Recu2024MARTIN.ElementoBiblioteca;
import Recu2024MARTIN.Libro;

public class Cpunt extends Condicion{
    private int puntPop;

    @Override
    public boolean cumple(ElementoBiblioteca l) {
        if (l.getPuntaje()>puntPop){
            return true;
        }
        return false;
    }
}
